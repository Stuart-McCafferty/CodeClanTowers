import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> testGuests;
    ArrayList<Guest> testGuests2;
    ArrayList<Guest> testGuests3;
    ArrayList<Guest> testGuests4;

    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void SetUp(){
        guest = new Guest("Ethan", false);
        guest2 = new Guest("Stuart", false);
        testGuests = new ArrayList<Guest>();
        testGuests2 = new ArrayList<Guest>();
        testGuests3 = new ArrayList<Guest>();
        testGuests4 = new ArrayList<Guest>();

        diningRoom = new DiningRoom(5, testGuests3, "Dining room");
        diningRooms = new HashMap<>();
        bedroom = new Bedroom(1, testGuests, RoomType.DOUBLE, 7);
        bedroom2 = new Bedroom(2, testGuests2, RoomType.TRIPLE, 8);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom);
        bedrooms.add(bedroom2);
        conferenceRoom = new ConferenceRoom(3, testGuests4, "The Keith Room");
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.getBedroomsCount());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.getConferenceRoomsCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(bedroom, guest);
        assertEquals(true, guest.isCheckedIn());
    }

    @Test
    public void addToRoom(){
        hotel.checkIn(bedroom, guest);
        assertEquals(1, bedroom.getGuestsCount());
    }

    @Test
    public void cannotAddPastCapacity(){
        hotel.checkIn(bedroom, guest);
        hotel.checkIn(bedroom, guest2);
        assertEquals(1, bedroom.getGuestsCount());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom, 3);
        assertEquals(3, booking.getNoOfNights());
    }

    @Test
    public void getSizeDiningRoomHashMap(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRooms.size());
    }

    @Test
    public void cannotAddSameDiningRoomTwice(){
        hotel.addDiningRoom(diningRoom);
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.diningRooms.size());
    }

    @Test
    public void canCalcConferenceRoomSize(){
        double size = ConferenceRoom.calculateRoomSize(5.00, 10.00);
        assertEquals(50.00, size, 0.0);
    }

    @Test
    public void canCalcDiningRoomSize(){
        double size = DiningRoom.calculateRoomSize(5.00, 5.00);
        assertEquals(25.00, size, 0.0);
    }

    @Test
    public void canReturnEmptyRooms(){
        hotel.checkIn(bedroom, guest);
        ArrayList<Room>emptyRooms = hotel.getEmptyRooms();
        assertEquals(1, emptyRooms.size());
    }

    @Test
    public void canOnlyCheckInToEmptyRoom(){
        hotel.checkIn(bedroom, guest);
        hotel.checkIn(bedroom, guest2);
        assertEquals(1, bedroom.getGuestsCount());
    }
}
