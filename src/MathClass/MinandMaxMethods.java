package MathClass;

public class MinandMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80,27);

        int maxNumber2 = Math.max(maxNumber, 125);

        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("maxNumber2 = " + maxNumber2);
        System.out.println("maxNumber3 = " + maxNumber3);

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(minNumber , 2);

        System.out.println("minNumber = " + minNumber);
        System.out.println("minNumber = " + minNumber2);
        System.out.println("minNumber = " + minNumber);


    }
}
