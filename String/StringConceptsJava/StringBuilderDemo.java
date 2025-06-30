package StringConceptsJava;

// Demonstrates use of StringBuilder for mutable string operations
public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder allows modification of strings without creating new objects
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends to the same object

        // Prints the final string
        System.out.println(sb); // Output: Hello World
    }
}
