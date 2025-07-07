package Recursion;


public class PrintDecreasing {
    public static void printDec(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        printDec(5); // 5 4 3 2 1
    }
}


/*
 call(3) -> print 3 -> call(2) -> print 2 -> call(1) -> print 1 -> call(0) -> return
 */