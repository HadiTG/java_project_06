package arithmetic_operators.shorthand_assignment_operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance, firstTransaction, secondTransaction, thirdTransaction;

        System.out.println("Hey user, please enter your balance: ");
        balance = input.nextDouble();

        System.out.println("\nNow, please tell your first transaction: ");
        firstTransaction = input.nextDouble();

        balance -= firstTransaction;

        System.out.println("Balance after 1st transaction = $" + balance);



        System.out.println("\nNow, please tell your second transaction: ");
        secondTransaction = input.nextDouble();

        balance -= secondTransaction;

        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("\nNow, please tell your third transaction: ");
        thirdTransaction = input.nextDouble();

        balance -= thirdTransaction;

        System.out.println("Balance after 3rd transaction = $" + balance);

    }
}
