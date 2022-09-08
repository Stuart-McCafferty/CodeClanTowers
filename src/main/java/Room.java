import java.sql.Array;
import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = guests;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuestsCount() {
        return this.guests.size();
    }

    public static double calculateRoomSize(double width, double length){
        return length * width;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
