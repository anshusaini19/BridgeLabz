/*1.
 Problem — Movie Booking System
Create a movie reservation system.

Features
Add movies
Book/cancel seats
Search movies
Revenue calculation
Sort by ratings 
*/



import java.util.*;

class Movie {

    String name;
    int totalSeats;
    int bookedSeats;
    double rating;
    double ticketPrice;

    // Constructor
    Movie(String name, int totalSeats, double rating, double ticketPrice) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.rating = rating;
        this.ticketPrice = ticketPrice;
        this.bookedSeats = 0;
    }

    // Booking seats
    void bookSeats(int seats) {

        // Check if enough seats are available
        if (bookedSeats + seats <= totalSeats) {

            bookedSeats += seats;

            System.out.println(seats + " seats booked for " + name);

        } else {
            System.out.println("Not enough seats available for " + name);
        }
    }

    // Cancel seats
    void cancelSeats(int seats) {

        // Check if booked seats are enough
        if (bookedSeats >= seats) {

            bookedSeats -= seats;

            System.out.println(seats + " seats cancelled for " + name);

        } else {
            System.out.println("Invalid cancellation");
        }
    }

    // Calculate revenue
    double calculateRevenue() {
        return bookedSeats * ticketPrice;
    }
}

public class Code1_MovieBooking {

    public static void main(String[] args) {

        // Stores movie objects dynamically
        List<Movie> movies = new ArrayList<>();

        // Adding movies
        movies.add(new Movie("Inception", 100, 4.8, 250));
        movies.add(new Movie("ABCD", 80, 4.2, 200));
        movies.add(new Movie("Nun", 120, 4.5, 300));

        // Booking seats
        movies.get(0).bookSeats(10);
        movies.get(1).bookSeats(5);

        // Cancel seats
        movies.get(0).cancelSeats(2);

        // Search movie
        String search = "ABCD";

        System.out.println("\nSearching Movie:");

        for (Movie m : movies) {

            if (m.name.equalsIgnoreCase(search)) {
                System.out.println("Movie Found: " + m.name);
            }
        }

        // Revenue calculation
        System.out.println("\nMovie Revenues:");

        for (Movie m : movies) {
            System.out.println(m.name + " Revenue = " + m.calculateRevenue());
        }

        // Sort movies by ratings in descending order
        movies.sort((a, b) -> Double.compare(b.rating, a.rating));

        System.out.println("\nMovies Sorted By Ratings:");

        for (Movie m : movies) {
            System.out.println(m.name + " -> " + m.rating);
        }
    }
}

// Learned:
// How to model real-world systems using classes and objects.


// Learned:
// How ArrayList stores objects dynamically.


// Learned:
// How lambda expressions work for sorting objects.


// Learned:
// How business logic like booking/cancellation is implemented.