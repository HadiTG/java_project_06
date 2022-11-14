package homeworks;
import utilities.ScannerHelper;
public class Homework5 {
    public static void main(String[] args) {
        //Task 8
        int number = ScannerHelper.getANumber();
      int sum = 0;
      int i = 0;
        do {
            sum += ScannerHelper.getANumber();
            i++;
        } while(sum < 100);

        if(i == 1) System.out.println("This number is already more then 100");
        else System.out.println("Sum of the entered numbers is at least 100");

        //Task 10
        int count = 0;
        String fullName = ScannerHelper.getAName();
        String lowerCaseName = fullName.toLowerCase();

        for (int i1 = 0; i < fullName.length(); i++) {
            if(lowerCaseName.charAt(i) == 'a'  || lowerCaseName.charAt(i) == 'e'  ||
            lowerCaseName.charAt(i) == 'i'  || lowerCaseName.charAt(i) == 'o'  ||
                    lowerCaseName.charAt(i) == 'u') count++;
        }


    }


}
