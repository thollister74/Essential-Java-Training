//**********************************************************//
// Created by hollisti on 2019-05-02.                       //
// Goal was to review some baics covered in videos          //
// and try to set up some a conditional if else             //
//**********************************************************//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fName = "Sterling";
        String lName = "Archer";
        int userAge = 34;

        System.out.println("Your first name: " + fName);
        System.out.println("Your first name: " + lName);
        System.out.println(("You are ") + userAge + (" years old"));
        System.out.println("Are you from Michigan? Y/N");
        Scanner scan = new Scanner(System.in);
        String []candyBar = {"Baby Ruth", "Twix", "Crunch", "Snickers"};
        System.out.println(candyBar[2]);
        candyBar[2] = "Munch";
        System.out.println(candyBar.length);
        for (int i = 0; i < candyBar.length; i++) {
            System.out.println(candyBar[i]);
        }
        // System created Switch statement
        String isFromMichigan = scan.nextLine();
        isFromMichigan = isFromMichigan.toUpperCase();

                switch (isFromMichigan) {
                    case "Y":
                    System.out.println("Glad you're not a Buckeye> Have you been to the UP?");
                    break;

                    case "N":
                    System.out.println("Ew, I hope your not from Ohio.");
                    break;

                    default:
                    System.out.println("Enter 'Y' or 'N'! \nPress the green arrow and try again!");
                    break;

           //**********************************************************************************************
           }

//        // This is the if-else statement I created, the Switch statement above was set up by Intellij
//        String fromMichigan = scan.nextLine();
//        fromMichigan = fromMichigan.toUpperCase();
//        if (fromMichigan.equals("Y")) {
//            System.out.println("Glad you're not a Buckeye. Have you been to the UP?" +
//                    "");
//
//        } else if (fromMichigan.equals("N")) {
//            System.out.println("Ew, I hope your not from Ohio.");
//
//        } else {
//            System.out.println("Dude?! 'Y' or 'N'! It's not that hard!");
//
//        }


    }
}

