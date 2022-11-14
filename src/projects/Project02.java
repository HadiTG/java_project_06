package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        //Task 1
        Scanner input = new Scanner(System.in);

        int num1,num2,num3;

        System.out.println("Please enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        int prod1 = num1 *num2 * num3;

        System.out.println("The product of the numbers entered is = " + prod1);

        //Task 2
        String fName, lName;
        int YOB;


        System.out.println("What is your first name?");
        input.nextLine();
        fName = input.nextLine();
        System.out.println("What is your last name?");
        lName = input.nextLine();
        System.out.println("What is your year of birth?");
        YOB = input.nextInt();
        int age1 = 2022 - YOB;
        System.out.println(fName + " " + lName + "'s age is = " + age1 + ".");

        //Task 3
        String fullName;
        int kg;
        System.out.println("What is your full name?");
        input.nextLine();
        fullName = input.nextLine();
        System.out.println("What is your weight?");
        kg = input.nextInt();
        double lbs = kg * 2.205;
        System.out.println(fullName + "'s weight is = " + lbs + " lbs.");

        //Task 4
        String studName1, studName2, studName3;
        int studAge1, studAge2, studAge3;

        System.out.println("What is your full name?");
        input.nextLine();
        studName1 = input.nextLine();
        System.out.println("What is your age?");
        studAge1 = input.nextInt();
        System.out.println("What is your full name?");
        input.nextLine();
        studName2 = input.nextLine();
        System.out.println("What is your age?");
        studAge2 = input.nextInt();
        System.out.println("What is your full name?");
        input.nextLine();
        studName3 = input.nextLine();
        System.out.println("What is your age?");
        studAge3 = input.nextInt();
int avgAge = (studAge1 + studAge2 + studAge3) / 3;
int eldAge = Math.max(studAge1, studAge2);
int oldAge = Math.max(eldAge, studAge3);
        int youngAge = Math.min(studAge1, studAge2);
        int youngAge2 = Math.min(youngAge, studAge3);
        System.out.println(studName1 + "'s age is " + studAge1 + ".");
        System.out.println(studName2 + "'s age is " + studAge2 + ".");
        System.out.println(studName3 + "'s age is " + studAge3 + ".");
        System.out.println("The average age is " + avgAge + ".");
        System.out.println("The eldest age is " + oldAge + ".");
        System.out.println("The youngest age is " + youngAge2 + ".");

    }
}
