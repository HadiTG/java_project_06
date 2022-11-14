package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        //Task 1
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("The number 1 entered by user is = ");
        num1 = input.nextInt();
        System.out.println("The number 2 entered by user is = ");
        num2 = input.nextInt();
        int sum1 = num1 + num2;
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum1);

        //Task 2
        int num3, num4;
        num3 = input.nextInt();
        num4 = input.nextInt();
        int prod1 = num3 * num4;
        System.out.println("The product of the given 2 numbers are: " + prod1);

        //Task 3
        double num5, num6;
        num5 = input.nextDouble();
        num6 = input.nextDouble();
        double sum2 = num5 + num6, prod2 = num5 * num6, diff1 = num5 - num6, div1 = num5/num6, rem1 = num5%num6;
        System.out.println("The sum of the given numbers are = " + sum2);
        System.out.println("The product of the given numbers are = " + prod2);
        System.out.println("The subtraction of the given numbers are = " + diff1);
        System.out.println("The division of the given numbers are = " + div1);
        System.out.println("The remainder of the given numbers are = " + rem1);

        //Task4
        int num7 = -10 + 7 * 5, num8 = (72+24) % 24, num9 = 10 + -3*9 /9, num10 = 5 + 18 / 3 * 3 - (6 % 3);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);

        //Task5
        int numb1, numb2;
        numb1 = input.nextInt();
        numb2 = input.nextInt();
        int avg = (numb1 + numb2) / 2;
        System.out.println("The average of the given numbers is: " + avg);

        //Task6
        int numb3, numb4, numb5, numb6, numb7;
        numb3 = input.nextInt();
        numb4 = input.nextInt();
        numb5 = input.nextInt();
        numb6 = input.nextInt();
        numb7 = input.nextInt();
        int avg1 = (numb3 + numb4 + numb5 + numb6 + numb7) / 5;
        System.out.println("The average of the given numbers is: " + avg1);

        //Task7
        int num11, num12, num13;
        num11 = input.nextInt();
        num12 = input.nextInt();
        num13 = input.nextInt();
        int squ1 = num11 * num11, squ2 = num12 * num12, squ3 = num13 * num13;

        System.out.println("The " + num11 + " multiplied with " + num11 + " is = " + squ1);
        System.out.println("The " + num12 + " multiplied with " + num12 + " is = " + squ2);
        System.out.println("The " + num13 + " multiplied with " + num13 + " is = " + squ3);

        //Task8
        int numb11;
        numb11 = input.nextInt();
        int area = numb11 * numb11, per = numb11 * 4;
        System.out.println("Perimeter of the square = " + per);
        System.out.println("Area of the square = " + area);

        //Task 9
        double sal = 90_000, sal3 = sal * 3;
        System.out.println("A Software Engineer in Test can earn $" + sal3 + " in 3 years.");

        //Task 10
        input.nextLine();
        String favBook, favColor, favNumber;
        favBook = input.nextLine();
        favColor = input.next();
        favNumber = input.next();

        System.out.println("User's favorite book is : " + favBook);
        System.out.println("User's favorite color is : " + favColor);
        System.out.println("User's favorite number is : " + favNumber);

        //Task 11
        String fName, lName, age, email, pNumber, address;
        fName = input.next();
        lName = input.next();
        age = input.next();
        email = input.next();
        input.nextLine();
        pNumber = input.nextLine();
        address = input.nextLine();

        System.out.println("\tUser who joined this program is " + fName + " " + lName + ". " + fName + "'s age is \n" + age
        + ". " + fName + "'s email address is " + email + ", phone number \nis " + pNumber + ", and address is " + address + ".");













    }
}
