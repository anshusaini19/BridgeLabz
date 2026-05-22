/*2. Problem — Cab Fare Analytics
Create a ride analytics system.

Features
Track rides
Calculate peak-hour fares
Generate driver earnings
Detect cancelled ride patterns
Sort by ride distance */
import java.util.ArrayList;

class Ride {

    int rideId;
    String driverName;
    double distance;
    boolean peakHour;
    boolean cancelled;

    // Constructor
    Ride(int rideId, String driverName,
         double distance,
         boolean peakHour,
         boolean cancelled) {

        this.rideId = rideId;
        this.driverName = driverName;
        this.distance = distance;
        this.peakHour = peakHour;
        this.cancelled = cancelled;
    }

    // Calculate fare
    double calculateFare() {

        double fare = distance * 15;

        // Extra charge during peak hour
        if (peakHour) {
            fare = fare + 50;
        }

        return fare;
    }

    // Display ride details
    void displayRide() {

        System.out.println("Ride ID: " + rideId);
        System.out.println("Driver: " + driverName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Peak Hour: " + peakHour);
        System.out.println("Cancelled: " + cancelled);

        if (!cancelled) {
            System.out.println("Fare: " + calculateFare());
        } else {
            System.out.println("Fare: Ride Cancelled");
        }

        System.out.println();
    }
}

public class CabFareAnalytics {

    public static void main(String[] args) {

        ArrayList<Ride> rides = new ArrayList<>();

        // Add rides
        rides.add(new Ride(101, "Aman",
                12, true, false));

        rides.add(new Ride(102, "Rahul",
                7, false, true));

        rides.add(new Ride(103, "Aman",
                20, true, false));

        rides.add(new Ride(104, "Rohit",
                5, false, false));

        // Display all rides
        System.out.println("===== ALL RIDE DETAILS =====\n");

        for (Ride r : rides) {
            r.displayRide();
        }

        // Driver earnings
        double amanEarning = 0;
        double rahulEarning = 0;
        double rohitEarning = 0;

        for (Ride r : rides) {

            // Earnings only if ride not cancelled
            if (!r.cancelled) {

                double fare = r.calculateFare();

                if (r.driverName.equals("Aman")) {
                    amanEarning += fare;
                }

                else if (r.driverName.equals("Rahul")) {
                    rahulEarning += fare;
                }

                else if (r.driverName.equals("Rohit")) {
                    rohitEarning += fare;
                }
            }
        }

        // Display driver earnings
        System.out.println("===== DRIVER EARNINGS =====\n");

        System.out.println("Aman -> " + amanEarning);
        System.out.println("Rahul -> " + rahulEarning);
        System.out.println("Rohit -> " + rohitEarning);

        // Count cancelled rides
        int cancelledCount = 0;

        for (Ride r : rides) {

            if (r.cancelled) {
                cancelledCount++;
            }
        }

        System.out.println("\nCancelled Rides = "
                + cancelledCount);

        // Sort rides by distance in descending order
        rides.sort((a, b) ->
                Double.compare(b.distance, a.distance));

        // Display sorted rides
        System.out.println("\n===== RIDES SORTED BY DISTANCE =====\n");

        for (Ride r : rides) {

            System.out.println(
                    "Ride ID: " + r.rideId +
                    " -> " + r.distance + " km"
            );
        }
    }
}

// Learned:
// How to calculate dynamic fares using conditions.


// Learned:
// How peak-hour pricing works in real-world applications.
// Learned:
// How sorting objects works using Comparator and lambda.


// Learned:
// How to perform basic analytics like cancellation counting.