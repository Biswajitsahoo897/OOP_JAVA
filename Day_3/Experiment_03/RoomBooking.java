package Experiment_03;
import java.util.ArrayList;
import java.util.Scanner;

class Booking {
    String date;
    String startTime;
    String endTime;
    String name;

    public Booking(String date, String startTime, String endTime, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }

    public boolean conflictsWith(String date, String startTime, String endTime) {
        return this.date.equals(date) && (
                (this.startTime.compareTo(endTime) < 0 && this.endTime.compareTo(startTime) > 0)
        );
    }
}

public class RoomBooking {
    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nConference Room Booking System");
            System.out.println("1. Book a Room");
            System.out.println("2. Check Availability");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    checkAvailability();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // to book a conference room
    public static void bookRoom() {
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Start Time (HH:MM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter End Time (HH:MM): ");
        String endTime = scanner.nextLine();
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        for (Booking b : bookings) {
            if (b.conflictsWith(date, startTime, endTime)) {
                System.out.println("Sorry, the room is already booked for this time slot!");
                return;
            }
        }

        // FOR no conflicts
        bookings.add(new Booking(date, startTime, endTime, name));
        System.out.println("Booking successful for " + name + " on " + date + " from " + startTime + " to " + endTime);
    }

    public static void checkAvailability() {
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Start Time (HH:MM): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter End Time (HH:MM): ");
        String endTime = scanner.nextLine();

        for (Booking b : bookings) {
            if (b.conflictsWith(date, startTime, endTime)) {
                System.out.println("Room is already booked during this time slot.");
                return;
            }
        }

        System.out.println("Room is available for booking.");
    }

    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        System.out.println("\nAll Bookings:");
        for (Booking b : bookings) {
            System.out.println(b.date + " | " + b.startTime + " - " + b.endTime + " | " + b.name);
        }
    }
}
