package arithmetic_operators.increment_decrement_operators;

public class PreIncrementsVsPostIncrements {
    public static void main(String[] args) {

        //Post increment
        int num1 =5;
        num1++; //increase it by 1 and assign it later.

        System.out.println(num1);

        //pre increment
        int num2 = 5;

        ++num2; //Increase it by one and assign it right away.

        System.out.println(num2);


        //the difference

        byte b1 =5, b2 =5;

        System.out.println(b1++);
        System.out.println(++b2);

    }
}
