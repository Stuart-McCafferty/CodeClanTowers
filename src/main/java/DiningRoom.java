import java.util.ArrayList;

public class DiningRoom extends Room{
    private String name;

    public DiningRoom(int capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
