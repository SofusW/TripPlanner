package Trips;

import java.util.ArrayList;
import java.util.Scanner;

public class TripsMenu {

    public static void menu(ArrayList<Trip> trips) {

        Scanner scanner = new Scanner(System.in);

        while(1 > 0) {

            System.out.println("What do you want to do?\n");
            System.out.println("1. Create new trip.");
            System.out.println("2. List trip\n");


            int choiceOfAction = scanner.nextInt();

            switch (choiceOfAction) {

                case 1 -> createTrip(trips, scanner);
                case 2 -> listTrip(trips);
                default -> System.exit(0);

            }

        }

    }

    static void createTrip(ArrayList<Trip> trips, Scanner scanner) {

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
                trips.add(new SkiTrip(location, price, duration, amountOfMembers, skiRental));
            }
            case 2 -> {
                System.out.println("What is the price of surfing lessons?\n");
                int surfingLessons = scanner.nextInt();
                trips.add(new SkiTrip(location, price, duration, amountOfMembers, surfingLessons));
            }

        }

    }

    static void listTrip(ArrayList<Trip> trips) {

        for(Trip trip : trips) {

            System.out.println(trip + "\n");

        }


    }

}
