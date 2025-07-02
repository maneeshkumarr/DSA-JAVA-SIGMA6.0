// BitwiseOperatorsDemo.java
// Demonstrates all basic bitwise operations in Java with dry runs

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        // 1. Bitwise AND
        int andResult = a & b;
        // 0101 & 0011 = 0001 (1)
        System.out.println("AND (5 & 3): " + andResult);

        // 2. Bitwise OR
        int orResult = a | b;
        // 0101 | 0011 = 0111 (7)
        System.out.println("OR (5 | 3): " + orResult);

        // 3. Bitwise XOR
        int xorResult = a ^ b;
        // 0101 ^ 0011 = 0110 (6)
        System.out.println("XOR (5 ^ 3): " + xorResult);

        // 4. Binary Left Shift
        int leftShift = a << 1;
        // 0101 << 1 = 1010 (10)
        System.out.println("Left Shift (5 << 1): " + leftShift);

        // 5. Binary Right Shift
        int rightShift = a >> 1;
        // 0101 >> 1 = 0010 (2)
        System.out.println("Right Shift (5 >> 1): " + rightShift);

        // 6. Check if number is even or odd using bitwise AND
        int num = 7;
        if ((num & 1) == 1) {
            // 0111 & 0001 = 0001 => Odd
            System.out.println(num + " is Odd");
        } else {
            System.out.println(num + " is Even");
        }
    }
}
