package Trips;

public class BeachTrip extends Trip {

    int surfingLessons;

    BeachTrip(String location, int price, int duration, int amountOfMembers, int surfingLessons) {
        super(location, price, duration, amountOfMembers);
        this.surfingLessons = surfingLessons;
    }

    public String toString() {

        return "Location:" + location +
                "\nPrice: " + price + " kr. " +
                "\nDuration: " + duration + " days" +
                "\nAmount Of Members: " + amountOfMembers +
                "\nPrice of surfing lessons per day: " + surfingLessons + " kr." +
                "\nTotal cost: " + ((price * duration) + (surfingLessons * duration * amountOfMembers)) + " kr.";

    }

}
