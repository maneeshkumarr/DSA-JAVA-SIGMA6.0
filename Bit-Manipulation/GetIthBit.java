// GetIthBit.java
// Purpose: Get the i-th bit of a number using bitwise AND

import java.util.Scanner;

public class GetIthBit {
    // Function to get the i-th bit (0-indexed from right)
    public static int getIthBit(int n, int i) {
        // Shift 1 to the left i times to create mask
        // Then do AND with n to extract that bit
        return (n & (1 << i)) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter bit position to check (i): ");
        int i = sc.nextInt();

        int result = getIthBit(n, i);

        // Dry Run Example:
        // n = 13 → binary: 1101
        // i = 2 → we check 3rd bit from right (0-based)
        // Mask: (1 << 2) = 100 = 4
        // n & (1 << i) = 1101 & 0100 = 0100 → not zero → bit is 1

        System.out.println("The bit at position " + i + " is: " + result);
    }
}
