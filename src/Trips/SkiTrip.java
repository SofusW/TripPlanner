package Trips;

public class SkiTrip extends Trip {

    int skiRental;

    SkiTrip(String location, int price, int duration, int amountOfMembers, int skiRental) {
        super(location, price, duration, amountOfMembers);
        this.skiRental = skiRental;
    }

    public String toString() {

        return "Location:" + location +
                "\nPrice per day: " + price + " kr." +
                "\nDuration: " + duration + " days" +
                "\nAmount Of Members: " + amountOfMembers +
                "\nPrice of ski rental per day: " + skiRental + " kr." +
                "\nTotal cost: " + ((price * duration) + (skiRental * duration * amountOfMembers)) + " kr.";

    }

}
