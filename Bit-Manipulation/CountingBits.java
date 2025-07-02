// CountingBits.java
// Problem: Leetcode 338 - Count number of 1's in binary representation for all numbers from 0 to n

import java.util.Arrays;

public class CountingBits {

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0; // Base case

        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 5;

        int[] result = countBits(n);

        // Dry Run:
        // i = 1: res[1] = res[0] + 1 = 0 + 1 = 1
        // i = 2: res[2] = res[1] + 0 = 1 + 0 = 1
        // i = 3: res[3] = res[1] + 1 = 1 + 1 = 2
        // i = 4: res[4] = res[2] + 0 = 1 + 0 = 1
        // i = 5: res[5] = res[2] + 1 = 1 + 1 = 2

        System.out.println("Count of set bits from 0 to " + n + ": " + Arrays.toString(result));
    }
}
