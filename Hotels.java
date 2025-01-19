class Room {
    private int roomNumber;
    private boolean isBooked;
    private double pricePerNight;

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        setPricePerNight(pricePerNight);
        this.isBooked = false; 
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String setPricePerNight(double pricePerNight) {
        if (pricePerNight > 500) {
            this.pricePerNight = pricePerNight;
            return ("Price set successfully.");
        } else {
            return ("Price per night must be above ₹500.");
        }
    }

    public boolean bookRoom() {
        if (!isBooked) {
            isBooked = true;
            return true; 
        }
        return false; 
    }
}

class Hotel {
    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void roomss() {
        System.out.println("Available Rooms:");
        boolean availableFound = false;
        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println("Room Number: " + room.getRoomNumber() + ", Price per Night: ₹" + room.getPricePerNight());
                availableFound = true;
            }
        }
        if (!availableFound) {
            System.out.println("No available rooms.");
        }
    }

    public boolean bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.bookRoom();
            }
        }
        System.out.println("Room not found.");
        return false;
    }
}

public class Hotels {
    public static void main(String[] args) {
    
        Room room1 = new Room(101, 1500);
        Room room2 = new Room(102, 2000);
        Room room3 = new Room(103, 450); 
        Room room4 = new Room(104, 1200);

        Room[] rooms = { room1, room2, room4 }; 
        Hotel hotel = new Hotel(rooms);

        hotel.roomss();

        int roomToBook = 101;
        if (hotel.bookRoom(roomToBook)) {
            System.out.println("Room " + roomToBook + " booked successfully.");
        } else {
            System.out.println("Room " + roomToBook + " could not be booked.");
        }
        hotel.roomss();
    }
}