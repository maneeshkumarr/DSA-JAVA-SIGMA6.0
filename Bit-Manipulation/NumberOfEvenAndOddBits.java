// NumberOfEvenAndOddBits.java
// Problem: Leetcode 2595 - Count number of 1s at even and odd bit positions
// Link: https://leetcode.com/problems/number-of-even-and-odd-bits/

public class NumberOfEvenAndOddBits {

    public static int[] evenOddBit(int n) {
        int even = 0, odd = 0;
        int pos = 0;

        // Process each bit from right to left (LSB to MSB)
        while (n > 0) {
            int bit = n & 1; // Check the last bit
            if (bit == 1) {
                if (pos % 2 == 0) {
                    even++; // Even position (0, 2, 4...)
                } else {
                    odd++;  // Odd position (1, 3, 5...)
                }
            }
            n >>= 1;  // Move to next bit
            pos++;    // Increase position
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        int n = 17;

        // Dry Run for n = 17:
        // Binary: 10001
        // Bit positions (right to left): [4]1 [3]0 [2]0 [1]0 [0]1
        // Even positions (0,2,4): 1s at pos 0 and 4 → even = 2
        // Odd positions (1,3): 0s → odd = 0

        int[] result = evenOddBit(n);
        System.out.println("Even set bits: " + result[0]);
        System.out.println("Odd set bits: " + result[1]);
    }
}
