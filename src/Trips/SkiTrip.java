package Trips;

public class SkiTrip extends Trip {

    int skiRental;

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

        return  "Trip ID: " + tripID +
                "\nLocation: " + location +
                "\nPrice per day: " + price + " kr." +
                "\nDuration: " + duration + " days" +
                "\nAmount Of Members: " + amountOfMembers +
                "\nPrice of ski rental per day: " + skiRental + " kr." +
                "\nTotal cost: " + ((price * duration) + (skiRental * duration * amountOfMembers)) + " kr.";

    }

}
