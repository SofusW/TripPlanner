package Trips;

public class BeachTrip extends Trip {

    private int surfingLessons;

    BeachTrip(int tripID, String location, int price, int duration, int amountOfMembers, int surfingLessons) {
        super(tripID, location, price, duration, amountOfMembers);
        this.surfingLessons = surfingLessons;
    }

    public int getSurfingLessons() {
        return surfingLessons;
    }

    public void setSurfingLessons(int surfingLessons) {
        this.surfingLessons = surfingLessons;
    }

    public String toString() {

        return  "Trip ID: " + getTripID() +
                "\nLocation: " + getLocation() +
                "\nPrice: " + getPrice() + " kr. " +
                "\nDuration: " + getDuration() + " days" +
                "\nAmount Of Members: " + getAmountOfMembers() +
                "\nPrice of surfing lessons per day: " + surfingLessons + " kr." +
                "\nTotal cost: " + ((getPrice() * getDuration()) + (surfingLessons * getDuration() * getAmountOfMembers())) + " kr.";

    }

}
