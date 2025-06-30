package StringConceptsJava;

// Explains how String memory works with stack and heap
public class StackHeapStringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";               // String literal stored in String Pool (Heap)
        String s2 = new String("Hello");   // New object in Heap, even if the same content

        // '==' checks memory reference, not content
        System.out.println(s1 == s2); // false

        // Use equals() to compare string values
        System.out.println(s1.equals(s2)); // true
    }
}
