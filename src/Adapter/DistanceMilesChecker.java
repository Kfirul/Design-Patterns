package Adapter;//Adapter
/**
 * The DistanceMilesChecker class represents a device for measuring distance in miles.
 */
public class DistanceMilesChecker {

    /**
     * The distance measured by this device in miles.
     */
    private int distance;

    /**
     * Constructs a new {@link DistanceMilesChecker} with the specified distance in miles.
     * @param distance the initial distance measured by this device in miles.
     */
    public DistanceMilesChecker(int distance){
        this.distance=distance;
    }

    /**
     * Returns the distance measured by this device in miles.
     * @return the distance measured by this device in miles.
     */
    public double getDistance() {
        return distance;
    }
}

