package Recursion;

public class Factorial {
    public static long fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5)); // 120
    }
}

/*
 fact(4) = 4 * fact(3)
fact(3) = 3 * fact(2)
fact(2) = 2 * fact(1)
fact(1) = 1
Unwind: 2 → 6 → 24
 */