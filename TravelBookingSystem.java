import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class for a travel service
abstract class TravelService {
    protected String name;
    protected double price;

    public TravelService(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getDescription();
}

// Flight class representing a flight service
class Flight extends TravelService {
    private String departureCity;
    private String destinationCity;
    private String departureDate;
    private String returnDate;
    private int numberOfPassengers;

    public Flight(String name, double price, String departureCity, String destinationCity, String departureDate,
            String returnDate, int numberOfPassengers) {
        super(name, price);
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getDescription() {
        return "Flight: " + name + ", Departure: " + departureCity + ", Destination: " + destinationCity
                + ", Departure Date: " + departureDate + ", Return Date: " + returnDate + ", Passengers: "
                + numberOfPassengers + ", Price: $" + price;
    }
}

// Hotel class representing a hotel service
class Hotel extends TravelService {
    private String cityName;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Hotel(String name, double price, String cityName, String checkInDate, String checkOutDate,
            int numberOfGuests) {
        super(name, price);
        this.cityName = cityName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public String getDescription() {
        return "Hotel: " + name + ", City: " + cityName + ", Check-in Date: " + checkInDate + ", Check-out Date: "
                + checkOutDate + ", Guests: " + numberOfGuests + ", Price: $" + price;
    }
}

// Transportation class representing a transportation service
class Transportation extends TravelService {
    private String source;
    private String destination;
    private String date;
    private int numberOfTravelers;

    public Transportation(String name, double price, String source, String destination, String date,
            int numberOfTravelers) {
        super(name, price);
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.numberOfTravelers = numberOfTravelers;
    }

    public String getDescription() {
        return "Transportation: " + name + ", Source: " + source + ", Destination: " + destination + ", Date: " + date
                + ", Travelers: " + numberOfTravelers + ", Price: $" + price;
    }
}

// TravelBookingSystem class representing the main travel booking system
public class TravelBookingSystem {
    private List<TravelService> bookedServices;

    public TravelBookingSystem() {
        bookedServices = new ArrayList<>();
    }

    // Method to book a flight
    public void bookFlight(Scanner scanner) {
        System.out.println("Enter flight details:");
        // Input handling logic goes here
    }

    // Method to book a hotel
    public void bookHotel(Scanner scanner) {
        System.out.println("Enter hotel details:");
        // Input handling logic goes here
    }

    // Method to book transportation
    public void bookTransportation(Scanner scanner) {
        System.out.println("Enter transportation details:");
        // Input handling logic goes here
    }

    // Method to display booked services
    public void displayBookedServices() {
        System.out.println("Booked Services:");
        for (TravelService service : bookedServices) {
            System.out.println(service.getDescription());
        }
    }

    // Main method to interactively book services
    public void run(Scanner scanner) {
        int choice = 0;
        while (choice != 5) {
            System.out.println("Select an option:");
            System.out.println("1. Book a Flight");
            System.out.println("2. Book a Hotel");
            System.out.println("3. Book Transportation");
            System.out.println("4. Display Booked Services");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookFlight(scanner);
                    break;
                case 2:
                    bookHotel(scanner);
                    break;
                case 3:
                    bookTransportation(scanner);
                    break;
                case 4:
                    displayBookedServices();
                    break;
                case 5:
                    System.out.println("Thank you for using the Travel Booking System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        TravelBookingSystem bookingSystem = new TravelBookingSystem();
        Scanner scanner = new Scanner(System.in);
        bookingSystem.run(scanner);
        scanner.close();
    }
}
