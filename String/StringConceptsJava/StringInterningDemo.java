package StringConceptsJava;

// Demonstrates String interning in Java
public class StringInterningDemo {
    public static void main(String[] args) {
        String s1 = "Java";           // Stored in string pool
        String s2 = "Java";           // Reuses the same object from the pool
        String s3 = new String("Java"); // New object in heap
        String s4 = s3.intern();      // Moves it to pool if not already there

        System.out.println(s1 == s2); // true - same object from pool
        System.out.println(s1 == s3); // false - s3 is from heap
        System.out.println(s1 == s4); // true - s4 is now from the pool
    }
}

