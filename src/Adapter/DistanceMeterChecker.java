package Adapter;//Adapter
/**
 * The DistanceMeterChecker class is an implementation of the {@link DistanceInMetersDevice} interface
 * that represents a device for measuring distance in meters.
 */
public class DistanceMeterChecker implements DistanceInMetersDevice {

    /**
     * The distance measured by this device in meters.
     */
    private int distance;

    /**
     * Constructs a new {@link DistanceMeterChecker} with the specified distance in meters.
     * @param distance the initial distance measured by this device in meters.
     */
    public DistanceMeterChecker(int distance){
        this.distance=distance;
    }

    /**
     * Returns the distance measured by this device in meters.
     * @return the distance measured by this device in meters.
     */
    @Override
    public double getDistance() {
        return distance;
    }
}

