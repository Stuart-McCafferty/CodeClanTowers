import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    ArrayList<Guest>guests;
    @Before
    public void SetUp(){
        guest = new Guest("Ethan", false);
        guests = new ArrayList<>();
        guests.add(guest);
        guests.add(guest);
        guests.add(guest);
        bedroom = new Bedroom(1, guests, RoomType.SINGLE, 7);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(3, bedroom.getGuestsCount());
    }

    @Test
    public void canCalcSize(){
        double size = Bedroom.calculateRoomSize(5.00, 2.00);
        assertEquals(10.00, size, 0.0);
    }

}
