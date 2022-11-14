package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        int number = ScannerHelper.getANumber();
        int number2= ScannerHelper.getANumber();
        for (int i = Math.min(number,number2); i <= Math.max(number,number2); i++) {
            if(i %2 ==0) System.out.println(i);

        }
    }
}
