package StringConceptsJava;

// Demonstrates immutability of Strings in Java
public class ImmutableStringDemo {
    public static void main(String[] args) {
        String str = "Hello";

        // String is immutable - this does NOT modify 'str'
        str.concat(" World");

        // Prints "Hello" because the original string is unchanged
        System.out.println("After concat: " + str);

        // To change it, assign the result to a new variable
        String newStr = str.concat(" World");
        System.out.println("New String: " + newStr);
    }
}

