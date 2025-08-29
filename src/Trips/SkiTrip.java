package Trips;

public class SkiTrip extends Trip {

    private int skiRental;

    public SkiTrip(int tripID, String location, int price, int duration, int amountOfMembers, int skiRental) {
        super(tripID, location, price, duration, amountOfMembers);
        this.skiRental = skiRental;
    }

    public int getSkiRental() {
        return skiRental;
    }

    public void setSkiRental(int skiRental) {
        this.skiRental = skiRental;
    }

    public String toString() {

        return  "Trip ID: " + getTripID() +
                "\nLocation: " + getLocation() +
                "\nPrice per day: " + getPrice() + " kr." +
                "\nDuration: " + getDuration() + " days" +
                "\nAmount Of Members: " + getAmountOfMembers() +
                "\nPrice of ski rental per day: " + skiRental + " kr." +
                "\nTotal cost: " + ((getPrice() * getDuration()) + (skiRental * getDuration() * getAmountOfMembers())) + " kr.";

    }

}
