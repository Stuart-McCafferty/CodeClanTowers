public class Booking {
    private int noOfNights;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int noOfNights) {
        this.bedroom = bedroom;
        this.noOfNights = noOfNights;
    }


    public int getNoOfNights() {
        return this.noOfNights;
    }

    public int getTotalBill(){
        return bedroom.roomType.getRate() * this.noOfNights;
    }
}
