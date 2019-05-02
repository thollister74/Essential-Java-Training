//Created by hollisti on 2019-05-02.
package src;
//*;
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
        if (fromMichigan.equals ("Y")||fromMichigan.equals("y")) {
            System.out.println("Glad you're not a Buckeye");
        }  else {
            System.out.println("Ew, I hope your not from Ohio.");
        }


    }
}