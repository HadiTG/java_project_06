package escape_sequences;

import java.sql.SQLOutput;

public class Concatenation {
    public static void main(String[] args){
        System.out.println("Hello World"); //Hello World
        System.out.println("Hello" + "World"); //HelloWorld
        System.out.println("Hello" + " " + "World"); //Hello World
        System.out.println("Today" + " " + "is" + " " + "Sunday"); //Today is Sunday
        System.out.println(); //Empty line, basically \n
    }
}
