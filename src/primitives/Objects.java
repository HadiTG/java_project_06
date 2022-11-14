package primitives;

public class Objects {
    public static void main(String[] args) {
        /*
        Any data that cannot be stored with primitives should be handled using objects
        objects = reference types = non-primitives
         */

        String name = "Hadi";
        String lname = "Abdullah";
        String DOB = "October 3rd, 2002";
        String SSN = "454-46-4533";
        String phoneNumber = "(353)239-2953";

        System.out.println(name);
        System.out.println(lname);
        System.out.println(DOB);
        System.out.println(SSN);
        System.out.println("the phone number is" + phoneNumber);

    }
}
