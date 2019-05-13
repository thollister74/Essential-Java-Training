//**********************************************************//
// Created by hollisti on 2019-05-02.                       //
// Goal was to review some baics covered in videos          //
// and try to set up some a conditional if else             //
//**********************************************************//

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

      for (String car : getCarList())  {
          System.out.println(car);
      }

//        String fName = "Sterling";
//        String lName = "Archer";
//        int userAge = 34;
////Array of car names
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Wrangler");
        cars.add("Porche");
        cars.add("Mustang");
        cars.add("Volkswagon Bug");
        cars.add("Tesla");
        cars.get(0);
        cars.set(3, "Lincoln");
        System.out.println("There are " + cars.size() + " elements in the 'cars' array.\n");
        for (int c = 0; c < cars.size(); c++) {
            System.out.println(cars.get(c));
        }


        cars.add("Volvo");
        System.out.println("\nAfter adding to the array, there are " + cars.size() + " elements:");
        for (String d : cars) {
            System.out.println(d);
        }
        System.out.println("");


//A multidementional array, 1st = rows, 2nd and 3rd column values (like excel)
        int[][] intArray = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};
        int b = intArray[2][0];
        System.out.println(b);
        System.out.println("");

//If statement
        int x = 102;
        int y = 22;
        if (x > y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

////Do While loop
int doWhile = 1;
do {
    System.out.println("do while loop " + doWhile);
    doWhile++;
}
while (doWhile < 6);


////Print a sourted array of integers
//        ArrayList<Integer> myInts = new ArrayList<Integer>();
//        myInts.add(0);
//        myInts.add(71);
//        myInts.add(11);
//        myInts.add(25);
//        myInts.add(1286);
//        myInts.add(406);
//        myInts.add(23);
//        Collections.sort(myInts);
//        for (int i : myInts) {
//            System.out.println(i);
//        }

////    For loop that prints out odd numbers, 1-11
//        System.out.println("\nThere are " + myInts.size() + " integers in the array 'myInts'");
//
//        System.out.println("\nOutput odd numbers, 1-11:");
//        for (int x = 1; x <= 11; x = x + 2) {
//            System.out.println(x);
    }

//        System.out.println("Your first name: " + fName);
//        System.out.println("Your first name: " + lName);
//        System.out.println(("You are ") + userAge + (" years old"));
//        System.out.println("Are you from Michigan? Y/N");
//            System.out.println("\n");
//            Scanner scan = new Scanner(System.in);

//// Array of candy bar names
//            String[] candyBar = {"Twix", "Crunch", "Snickers", "100 Grand"};
//            for (int a = 0; a < candyBar.length; a++) {
//                System.out.println(candyBar[a]);
//            }
//            candyBar[2] = "Munch";
//            System.out.println("\n");
//
//            System.out.println(candyBar.length);
//            System.out.println("\n");
//
//            for (String x : candyBar) {
//                System.out.println(x);
//            }

////System created Switch statement, modified an if/else I built
//        String isFromMichigan = scan.nextLine();
//        isFromMichigan = isFromMichigan.toUpperCase();//convert user entered value to upper case
//
//        switch (isFromMichigan) {
//            case "Y":
//                System.out.println("Glad you're not a Buckeye> Have you been to the UP?");
//                break;
//
//            case "N":
//                System.out.println("Ew, I hope your not from Ohio.");
//                break;
//
//            default:
//                System.out.println("Enter 'Y' or 'N'! \nPress the green arrow and try again!");
//                break;
//
//        }

//// This is the if-else statement I created, the Switch statement above was set up by Intellij
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
    public static ArrayList<String> getCarList(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Wrangler");
        cars.add("Porche");
        cars.add("Mustang");
        cars.add("Volkswagon Bug");
        cars.add("Tesla");
        cars.get(0);
        cars.set(3, "Lincoln");
    return cars;
     }
}

