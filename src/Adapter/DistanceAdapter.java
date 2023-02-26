//Adapter
package Adapter;
/**
 * The DistanceAdapter class is an implementation of the {@link DistanceInMetersDevice} interface that adapts a
 * {@link DistanceMilesChecker} instance to calculate distances in meters. It achieves this by using the
 * {@link DistanceMilesChecker#getDistance()} method to retrieve the distance in miles, and then converting that distance
 * to meters using a conversion factor of 0.62.
 */
public class DistanceAdapter implements DistanceInMetersDevice {

    /**
     * The instance of {@link DistanceMilesChecker} that this adapter wraps around.
     */
    private DistanceMilesChecker milesChecker;

    /**
     * Constructs a new {@link DistanceAdapter} with the specified {@link DistanceMilesChecker}.
     * @param milesChecker the instance of {@link DistanceMilesChecker} to be used for distance measurement.
     */
    public DistanceAdapter(DistanceMilesChecker milesChecker) {
        this.milesChecker = milesChecker;
    }

    /**

     * Calculates the distance in meters by multiplying the distance in miles, retrieved from the wrapped {@link DistanceMilesChecker} instance,
     * by the conversion factor of 0.62.
     * @return the distance in meters.
     */
    @Override
    public double getDistance() {
        return milesChecker.getDistance() * 0.62;
    }
}
