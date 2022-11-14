package utilities;

import java.util.Scanner;

public class ScannerHelper {
    /*
    Create a method that asks user to enter a name and RETURN it
     */
    public static String getAName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = input.nextLine();

        return name;

    }

    public static int getAnAge() {
Scanner input = new Scanner(System.in);
        System.out.println("Please enter an age: ");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }
    public static String getAnAddress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an address: ");
        String address = input.nextLine();

        return address;
    }

    public static int getANumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    {



    }

}
