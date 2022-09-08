import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {

    Guest guest;

    @Before
    public void SetUp(){
        guest = new Guest("Ethan", false);
    }

    @Test
    public void hasName(){
        assertEquals("Ethan", guest.getName());
    }

    @Test
    public void hasCheckedIn(){
        assertFalse(guest.isCheckedIn());
    }

    @Test
    public void canFlipCheckIn(){
        guest.flippedCheckIn();
        assertTrue(guest.isCheckedIn());
    }
}
