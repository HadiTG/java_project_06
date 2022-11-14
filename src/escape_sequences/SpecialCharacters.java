package escape_sequences;

public class SpecialCharacters {
    public static void main(String[] args){
        System.out.println("apple\\orange"); //apple\orange
        System.out.println("apple\\\\orange"); //apple\\orange
        System.out.println("I like \"Sundays\" and apples"); //I like "Sundays and applesl
        System.out.println("My favorite fruits are \"kiwi\" and \"orange\"");
    }
}
