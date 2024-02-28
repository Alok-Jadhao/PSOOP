package Arrays;

public class Hotel {
    private int hotelId; // ID of the hotel
    private String location; // Location of the hotel
    private int[] rooms; // Array format: [suites, deluxe, standard] - number of each type of room

    // Constructor to initialize hotel details
    public Hotel(int hotelId, String location, int[] rooms) {
        this.hotelId = hotelId;
        this.location = location;
        this.rooms = rooms;
    }

    // Getter method for hotelId
    public int getHotelId() {
        return hotelId;
    }

    // Getter method for location
    public String getLocation() {
        return location;
    }

    // Getter method for rooms array
    public int[] getRooms() {
        return rooms;
    }

    // Method to list hotels in a given location
    public static void listHotels(Hotel[] hotels, String location) {
        System.out.println("Hotels in " + location + ":");
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equalsIgnoreCase(location)) {
                System.out.println("Hotel ID: " + hotel.getHotelId() + ", Location: " + hotel.getLocation() + ", Rooms: " + arrayToString(hotel.getRooms()));
            }
        }
    }

    // Method to list total number of rooms of a certain type in each hotel
    public static void listHotels(Hotel[] hotels, int roomType) {
        String[] roomTypes = {"Suite", "Deluxe", "Standard"};
        System.out.println("Total number of " + roomTypes[roomType] + " rooms in each hotel:");
        for (Hotel hotel : hotels) {
            System.out.println("Hotel ID: " + hotel.getHotelId() + ", Location: " + hotel.getLocation() + ", " + roomTypes[roomType] + " rooms: " + hotel.getRooms()[roomType]);
        }
    }

    // Helper method to convert an array to string
    private static String arrayToString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i < array.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Main method to demonstrate class functionality
    public static void main(String[] args) {
        // Creating hotels
        Hotel[] hotels = new Hotel[3];
        hotels[0] = new Hotel(1, "Mumbai", new int[]{20, 40, 60});
        hotels[1] = new Hotel(2, "Delhi", new int[]{30, 50, 70});
        hotels[2] = new Hotel(3, "Bangalore", new int[]{25, 45, 65});

        // Listing hotels by location
        Hotel.listHotels(hotels, "Mumbai");

        // Listing total number of rooms of a certain type in each hotel
        Hotel.listHotels(hotels, 1); // Type 1 represents "Deluxe" rooms
    }
}
