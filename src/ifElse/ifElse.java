package ifElse;

import java.util.Scanner;

public class ifElse { public static void main(String[] args){

    int age;
    Scanner input = new Scanner(System.in);
    age = input.nextInt();

    if(age >= 21){
        System.out.println("Welcome");

    }
    else{
        System.out.println("Have your milk");

    }
}
}
