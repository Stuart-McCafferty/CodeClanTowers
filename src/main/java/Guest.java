public class Guest {

    private String name;
    private boolean checkedIn;

    public Guest(String name, boolean checkedIn){
        this.name = name;
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return name;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void flippedCheckIn(){
        this.checkedIn = !this.checkedIn;
    }
}
