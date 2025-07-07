package Recursion;

public class Power {
    public static long power(long x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
    }
}


/*
 power(2,3) = 2 * power(2,2)
            = 2 * (2 * power(2,1))
            = 2 * (2 * (2 * power(2,0)))
            = 8
 */