// PowerOfTwo.java
// Problem: Check if a given number is a power of 2

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it has exactly one bit set.
        // Example: 8 = 1000, 4 = 100, 2 = 10
        // n & (n - 1) will be 0 only for powers of 2
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;

        // Dry run:
        // num = 16 => binary: 10000
        // num - 1 = 15 => binary: 01111
        // 10000 & 01111 = 00000 => result = true

        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2");
        } else {
            System.out.println(num + " is NOT a power of 2");
        }
    }
}
