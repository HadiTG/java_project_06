package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("\n--------- Task 1 ----------\n");

        /*  public static int countMultipleWords(String[] str){
 String str = "abc"
               int counter = 0;
               for (String s : str) {
                   s = s.trim();
                   if (Pattern.matches("([\\w] [\\w]) +", s)) counter++;
               }
                return counter;
              }

         */
        System.out.println("\n--------- Task 2 ----------\n");

       /* ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        public static ArrayList<Integer> removeNegatives (ArrayList < Integer > numbers) {

            Iterator<Integer> numbersIterator = numbers.iterator();
            while (numbersIterator.hasNext()) {
                Integer num = numbersIterator.next();
                if (num < 0) numbersIterator.remove();
            }
            return numbers;
        }

        */
        System.out.println("\n--------- Task 3 ----------\n");
/*
        String password = "Abcd123!";
        System.out.println(validatePassword(password));
        public static boolean validatePassword(String password){

            return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#%&*!+_])[\\S]{8,16}",password));

 */
        System.out.println("\n--------- Task 4 ----------\n");
/*
        String email = "abcd@gmail.com";
        System.out.println(validateEmailAddress(email));
        public static boolean validateEmailAddress (String email){

        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}",email));
 */
    }
}




