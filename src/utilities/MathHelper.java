package utilities;

public class MathHelper {

    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }
    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

 public static int midOfThree(int num1, int num2, int num3){
       int max = maxOfThree(num1, num2, num3);
       int min = minOfThree(num1, num2, num3);

       return num1 + num2 + num3 - min - max;
 }

 public static boolean isOdd(int num){
        if(num % 2 != 0)return true;

        return false;
 }
}
