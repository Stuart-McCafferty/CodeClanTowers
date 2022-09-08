import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {


    Bedroom bedroom;
    Booking booking;
    Guest guest;
    ArrayList<Guest>guests;

    @Before
    public void SetUp(){
        guest = new Guest("Ethan", false);
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(1, guests, RoomType.DOUBLE, 7);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(30, booking.getTotalBill());
    }
}
