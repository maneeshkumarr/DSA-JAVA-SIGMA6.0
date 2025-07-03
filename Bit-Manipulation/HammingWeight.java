public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            int bit = n & 1; // Get the last bit
            if (bit == 1) {
                count++;
            }
            n = n >> 1; // Right shift to check next bit
        }

        return count;
    }

    public static void main(String[] args) {
        HammingWeight hw = new HammingWeight();
        int n = 11; // Binary: 1011
        System.out.println("Hamming Weight: " + hw.hammingWeight(n));
    }
}


/*
Binary: 1011

Loop 1: bit = 1 → count = 1 → n = 5
Loop 2: bit = 1 → count = 2 → n = 2
Loop 3: bit = 0 → count = 2 → n = 1
Loop 4: bit = 1 → count = 3 → n = 0

Final count: 3
 */