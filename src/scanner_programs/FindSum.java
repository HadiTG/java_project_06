package scanner_programs;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        int num1, num2, num3;


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        num1 = input.nextInt();

        System.out.println("Please enter your second number:");
        num2 = input.nextInt();

        System.out.println("Please enter your third number:");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The sum of all 3 numbers are = " + sum);


    }
}
