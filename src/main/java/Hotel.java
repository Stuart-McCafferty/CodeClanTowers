import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    protected HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public int getBedroomsCount() {
        return this.bedrooms.size();
    }

    public int getConferenceRoomsCount() {
        return this.conferenceRooms.size();
    }

    public void checkIn(Bedroom bedroom, Guest guest) {

        ArrayList<Room> emptyRooms = new ArrayList<>();
        emptyRooms = getEmptyRooms();
        if(!guest.isCheckedIn() && (bedroom.getGuestsCount() < bedroom.getCapacity()) && emptyRooms.contains(bedroom)){
            guest.flippedCheckIn();
            bedroom.addGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int i) {
        Booking booking = new Booking(bedroom, i);
        return booking;
    }


    public void addDiningRoom(DiningRoom diningRoom) {
        if(!diningRooms.containsKey(diningRoom.getName())){
            this.diningRooms.put(diningRoom.getName(), diningRoom);
        }
    }

    public ArrayList<Room> getEmptyRooms() {
        ArrayList<Room>emptyRooms = new ArrayList<>();
        for(int i = 0; i < this.bedrooms.size(); i++){
            if(this.bedrooms.get(i).guests.size() == 0){
                emptyRooms.add(bedrooms.get(i));
            }
        }
        return emptyRooms;
    }
}
