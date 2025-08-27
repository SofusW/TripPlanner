package Trips;

import java.util.ArrayList;
import java.util.Scanner;

public class TripsMenu {

    public static void menu(ArrayList<Trip> trips) {

        Scanner scanner = new Scanner(System.in);

        while(1 > 0) {

            System.out.println("What do you want to do?\n");
            System.out.println("1. Create new trip.");
            System.out.println("2. List trip");
            System.out.println("3. Alter trip\n");

            int choiceOfAction = scanner.nextInt();

            switch (choiceOfAction) {

                case 1 -> createTrip(trips, scanner);
                case 2 -> listTrip(trips);
                case 3 -> alterTrip(trips, scanner);
                default -> System.exit(0);

            }

        }

    }

    static void createTrip(ArrayList<Trip> trips, Scanner scanner) {

        int tripID = 0;

        for(int i = 0; i < trips.size(); i++) {

          if(trips.get(i).getTripID() == i+1) {

          } else {
              tripID = i+1;
              break;
          }

        }

        if(tripID == 0) {
            tripID = trips.size()+1;
        }

        System.out.println("Which type of trip is it?\n");

        System.out.println("1. Ski trip");
        System.out.println("2. Beach Trip\n");
        int typeOfTrip = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the location of the trip.\n");
        String location = scanner.nextLine();
        System.out.println("Please enter room cost per night.\n");
        int price = scanner.nextInt();
        System.out.println("Please enter the duration of the trip.\n");
        int duration = scanner.nextInt();
        System.out.println("Please enter the amount of members on the trip.\n");
        int amountOfMembers = scanner.nextInt();

        switch(typeOfTrip) {

            case 1 -> {
                System.out.println("What is the price of ski rental?\n");
                int skiRental = scanner.nextInt();
                trips.add(new SkiTrip(tripID, location, price, duration, amountOfMembers, skiRental));
            }
            case 2 -> {
                System.out.println("What is the price of surfing lessons?\n");
                int surfingLessons = scanner.nextInt();
                trips.add(new SkiTrip(tripID, location, price, duration, amountOfMembers, surfingLessons));
            }

        }

    }

    static void listTrip(ArrayList<Trip> trips) {

        for(Trip trip : trips) {

            System.out.println(trip + "\n");

        }


    }

    static void alterTrip(ArrayList<Trip> trips, Scanner scanner) {

        for(Trip trip : trips) {

            System.out.println(trip + "\n");

        }

        System.out.println("Please enter the trip ID of the trip you wish to alter.\n");

        int choiceOfTrip = scanner.nextInt();
        scanner.nextLine();

        System.out.println(trips.get(choiceOfTrip) + "\n");

        System.out.println();

        System.out.println("Which information do you want to alter?");

        System.out.println("1. Trip ID");
        System.out.println("2. Location");
        System.out.println("3. Price per day");
        System.out.println("4. Duration");
        System.out.println("5. Amount of members");

        if(trips.get(choiceOfTrip) instanceof SkiTrip) {
            System.out.println("6. Price of ski rental per day");
        } else if(trips.get(choiceOfTrip) instanceof BeachTrip) {
            System.out.println("6. Price of surfing lessons per day");
        }

        int informationToAlter = scanner.nextInt();

        String information = "";

        switch(informationToAlter) {
            case 1 -> information = "trip ID";
            case 2 -> information = "location";
            case 3 -> information = "price per day";
            case 4 -> information = "duration";
            case 5 -> information = "amount of members";
            case 6 -> {
                if(trips.get(choiceOfTrip) instanceof SkiTrip) {
                    information = "price of ski rental per day";
                } else if(trips.get(choiceOfTrip) instanceof BeachTrip) {
                    information = "price of surfing lessons per day";
                }
            }

        }

        System.out.println("What do you want to change the " + information + " to?\n");

        String newInformation = scanner.nextLine();

        switch(informationToAlter) {
            case 1 -> trips.get(choiceOfTrip).setTripID(Integer.parseInt(newInformation));
            case 2 -> trips.get(choiceOfTrip).setLocation(newInformation);
            case 3 -> trips.get(choiceOfTrip).setPrice(Integer.parseInt(newInformation));
            case 4 -> trips.get(choiceOfTrip).setDuration(Integer.parseInt(newInformation));
            case 5 -> trips.get(choiceOfTrip).setAmountOfMembers(Integer.parseInt(newInformation));
            case 6 -> {
                if(trips.get(choiceOfTrip) instanceof SkiTrip) {
                    ((SkiTrip) trips.get(choiceOfTrip)).setSkiRental(Integer.parseInt(newInformation));
                } else if(trips.get(choiceOfTrip) instanceof BeachTrip) {
                    ((BeachTrip) trips.get(choiceOfTrip)).setSurfingLessons(Integer.parseInt(newInformation));
                }
            }

        }

    }

}
