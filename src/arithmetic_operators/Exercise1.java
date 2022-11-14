package arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Assume that you have a rectangle
        Short side is equal to 4 units
        Long side is equal to 7 units
        Find area and the perimeter of the rectangle
        Area = sSide * lSide
        Perimeter = 2*(sSide + lSide)
         */

        int sSide = 4;
        int lSide = 7;
        int num1 = 2;

        System.out.println("The area of the rectangle is = " + sSide * lSide);
        System.out.println("The perimeter of the rectangle is " + num1 * (sSide + lSide));
    }
}
