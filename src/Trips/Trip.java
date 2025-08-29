package Trips;

public class Trip {

    private int tripID;
    private String location;
    private int price;
    private int duration;
    private int amountOfMembers;

    public Trip(int tripID, String location, int price, int duration, int amountOfMembers) {

        this.tripID = tripID;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.amountOfMembers = amountOfMembers;

    }

    public int getTripID() {
        return tripID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAmountOfMembers() {
        return amountOfMembers;
    }

    public void setAmountOfMembers(int amountOfMembers) {
        this.amountOfMembers = amountOfMembers;
    }





}
