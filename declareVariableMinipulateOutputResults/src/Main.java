package src;
//Created by hollisti on 2019-05-02.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fName = "Sterling";
        String lName = "Archer";
        int userAge = 34;

        System.out.println ("Your first name: "+fName);
        System.out.println("Your first name: "+lName);
        System.out.println(("You are ") + userAge +( " years old"));
        System.out.println("Are you from Michigan? Y/N");
        Scanner scan = new Scanner(System.in);

        String fromMichigan = scan.nextLine();
        switch (fromMichigan) {
            case "Y":
            case "y":
                System.out.println("Glad you're not a Buckeye");

                break;
            case "N":
            case "n":
                System.out.println("Ew, I hope your not from Ohio.");

                break;
            default:
                System.out.println("Dude?! 'Y' or 'N'! It's not that hard! \nPress ENTER and try again!");

                break;
        }
// This is the if-else statement I created, the Switch statement above was set up by Intellij
//*****  String fromMichigan = scan.nextLine();
//        if (fromMichigan.equals("Y") || fromMichigan.equals("y")) {
//            System.out.println("Glad you're not a Buckeye");
//
//        } else if (fromMichigan.equals("N") || fromMichigan.equals("n")) {
//            System.out.println("Ew, I hope your not from Ohio.");
//
//        } else {
//            System.out.println("Dude?! 'Y' or 'N'! It's not that hard!");
//
//*****   }


    }
}