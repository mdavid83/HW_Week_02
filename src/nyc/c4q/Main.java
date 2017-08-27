package nyc.c4q;

import java.util.Scanner;

public class Main {

    static void forecast1() {
        for (int i = 0; i < 10; i++) ;
        System.out.println("tornado storm on its way");
    }

    public static void main(String[] args) {
        Storm ivan = new Storm();
        Storm lili = new Storm();
        Storm peter = new Storm();

        lili.speed = 60;
        lili.location = "south";
        lili.type = "tornado";

        ivan.speed = 100;
        ivan.location = "north";
        ivan.type = "tropical";

        System.out.println("Hello");
        String message = "Welcome to the game of Storm. Enter your information to get the forecast for your city.";
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String yourName = input.next();
        System.out.println("Hi " + yourName + " lets get started!");

        System.out.println("What is your location");
        String location = input.next();

        while (!location.equalsIgnoreCase("nyc")) {
            System.out.println("We can only help you in NYC");
            System.out.println("What is your location");
            location = input.next();
        }
        if (location.equalsIgnoreCase( "Manhattan")) {
            System.out.println("You are in danger");
            System.out.println("What is your location");
            location = input.next();
        }
        System.out.println(" You entered " + location + " storm wil have speed of " + ivan.speed + " m/hr");
        System.out.println("What storm is on its way 1. Lili, 2. Ivan or 3. Peter?");
        String stormString = input.next();
        switch (stormString) {
            case "1":
                System.out.println("No, Try again");
                break;
            case "2":
                System.out.println("Correct! Now get to a safe zone");
                break;
            case "3":
                System.out.println("No");
                break;
            default:
                System.out.println("Try Again");
                break;
        }

        System.out.println("Good Job! Thanks for Playing!");

        //Main.forecast1();


    }
}
