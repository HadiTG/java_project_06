package scanner_programs;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        String age1 = input.nextLine();

        System.out.println("Please enter your address:");
        String address = input.nextLine();

        System.out.println("");
    }
}
