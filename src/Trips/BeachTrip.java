package Trips;

public class BeachTrip extends Trip {

    int surfingLessons;

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

        return  "Trip ID: " + tripID +
                "\nLocation: " + location +
                "\nPrice: " + price + " kr. " +
                "\nDuration: " + duration + " days" +
                "\nAmount Of Members: " + amountOfMembers +
                "\nPrice of surfing lessons per day: " + surfingLessons + " kr." +
                "\nTotal cost: " + ((price * duration) + (surfingLessons * duration * amountOfMembers)) + " kr.";

    }

}
