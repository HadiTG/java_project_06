package arithmetic_operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int num1;

        Scanner input = new Scanner (System.in);

        System.out.println("Hey user, how much you make yearly?");
        num1 = input.nextInt();

        System.out.println("Your monthly payment is $" + num1 / 12 + " " + "then!");
    }
}
