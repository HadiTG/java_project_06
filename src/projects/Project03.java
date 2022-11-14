package projects;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Project03 {
    public static void main(String[] args) {

        //Task 1
        String s1 ="24",s2 = "5";

        int sum = Integer.parseInt(s1) + Integer.parseInt(s2), difference = Integer.parseInt(s1) - Integer.parseInt(s2),
        div = Integer.parseInt(s1) / Integer.parseInt(s2), product = Integer.parseInt(s1) * Integer.parseInt(s2),
                rem = Integer.parseInt(s1) % Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 = " + sum);
        System.out.println("The subtraction of 24 and 5 = " + difference);
        System.out.println("The division of 24 and 5 = " + div);
        System.out.println("The multiplication of 24 and 5 = " + product);
        System.out.println("The remainder of 24 and 5 = " + rem);

        //Task 2
        int random = (int)(Math.random()* (35 - 1) + 1);
        System.out.println("Random number = " + random);

        if (random == 2 || random == 3 || random == 5 || random == 7 || random == 11 || random == 13 ||
              random == 17 || random == 19 || random == 23 || random == 19 || random == 23 || random == 29 ||
              random == 31){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        //Task 3
        int random2 = (int)(Math.random()* (50) + 1), random3 = (int)(Math.random()* (50) + 1),
                random4 = (int)(Math.random()* (50) + 1);

        if (random2 < random3 && random2 < random4) {
            System.out.println("The lowest number is = " + random2);
        }
        else if (random3 < random2 && random3 < random4) {
            System.out.println("The lowest number is = " + random3);
        }
        else if (random4 < random2 && random4 < random3) {
            System.out.println("The lowest number is = " + random4); }

            if (random2 > random3 && random2 < random4 || random2 > random4 && random2 < random3) {
                System.out.println("The middle number is = " + random2);
            }
            else if (random3 < random2 && random3 > random4 || random3 < random4 && random3 > random2) {
                System.out.println("The middle number is = " + random3);
            }
            else if (random4 < random2 && random4 > random3 || random4 > random2 && random4 < random3) {
                System.out.println("The middle number is = " + random4);
        }
        if (random2 > random3 && random2 > random4) {
            System.out.println("The greatest number is = " + random2);
        }
        else if (random3 >random2 && random3 > random4) {
            System.out.println("The greatest number is = " + random3);
        }
        else if (random4 > random2 && random4 > random3) {
            System.out.println("The greatest number is = " + random4); }

        //Task 4
        char c1 = '5', c2 = 'a', c3 = 'R';
        int char1 = c1, char2= c2, char3 = c3;

        if(char1 >= 65 && char1 <= 90){
            System.out.println("The letter is uppercase");
        }
        else if(char1 >= 97 && char1 <= 122){
            System.out.println("The letter is lowercase");
        }
        else System.out.println("Invalid character detected!!!");

        if(char2 >= 65 && char2 <= 90){
            System.out.println("The letter is uppercase");
        }
        else if(char2 >= 97 && char2 <= 122){
            System.out.println("The letter is lowercase");
        }
        else System.out.println("Invalid character detected!!!");

        if(char3 >= 65 && char3 <= 90){
            System.out.println("The letter is uppercase");
        }
        else if(char3 >= 97 && char3 <= 122){
            System.out.println("The letter is lowercase");
        }
        else System.out.println("Invalid character detected!!!");

        //Task 5
        char vow = 'a';
        int vow1 = vow;
        if (vow1 == 65 || vow1 == 97 || vow1 == 69 || vow1 == 101 || vow1 ==73 ||
        vow1 == 105 || vow1 == 79 || vow1 == 111 || vow1 ==85 || vow1 == 117){
            System.out.println("The letter is a vowel");
        }
        else if(vow1 >=65 && vow1 <=90 || vow1 >= 97 && vow1 <=122){
            System.out.println("This letter is a consonant");
        }
        else System.out.println("Invalid character detected!!!");

        //Task 6
        char char4 = '*';
        int c5 = char4;

        if(c5 >= 32 && c5 <= 37 || c5 >= 58 && c5 <= 64 || c5 >= 91 && c5 <= 96 || c5 >= 123 && c5 <= 126){
            System.out.println("Special character is = " + c5);
        }
        else System.out.println("Invalid character detected!!!");

        //Task 7
        char c6 = '@';
        int vow2 = c6;

        if(vow2 >=65 && vow2 <=90 || vow2 >= 97 && vow2 <=122){
            System.out.println("Character is a letter");
        }
        else if(vow2 >= 32 && vow2 <= 37 || vow2 >= 58 && vow2 <= 64 || vow2 >= 91 && vow2 <= 96 || vow2 >= 123 && vow2 <= 126){
            System.out.println("Character is a special character");
        }
        else if(vow1 >= 48 && vow2 <= 57){
            System.out.println("Character is a digit");
        }
}}
