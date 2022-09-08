import java.util.ArrayList;

public class Bedroom extends Room{
    protected RoomType roomType;
    private int roomNumber;

    public Bedroom(int capacity, ArrayList<Guest> guests, RoomType roomType, int roomNumber) {
        super(capacity, guests);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }




}
