package Adapter;

//Adapter
public class mainAdapter {

        public static void main(String[] args) {
            DistanceMilesChecker milesChecker = new DistanceMilesChecker(100);
            DistanceAdapter distanceAdapter = new DistanceAdapter(milesChecker);
            DistanceMeterChecker distanceMeterChecker = new DistanceMeterChecker(62);

            System.out.println("Distance in Miles: " + milesChecker.getDistance());
            System.out.println("Distance in Meters: " + distanceAdapter.getDistance());
            System.out.println("Distance in Meters: " + distanceMeterChecker.getDistance());

        }
    }

