package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {

        //Creating a scanner object

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        fName = inputReader.nextLine(); // John George

        System.out.println("Please enter your last name:");
        lName = inputReader.next(); // Doe

        System.out.println("Your full name is = " + fName + " " + lName);


    }
}
