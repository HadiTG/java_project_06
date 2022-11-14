package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
       int number = ScannerHelper.getANumber();

        System.out.println("\n The odd numbers from 1-" + number +" are as follows: \n");
        for (int i = 0; i <= number; i++) {
            if(i %2 ==1 )System.out.println(i);

        }
        }
    }

