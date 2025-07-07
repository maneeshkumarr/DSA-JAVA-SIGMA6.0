package Recursion;

public class PrintIncreasing {
    public static void printInc(int n) {
        if (n == 0) return ;          // base
        printInc(n - 1);             // smaller
        System.out.print(n + " ");   // work
    }

    public static void main(String[] args) {
        printInc(5); // 1 2 3 4 5
    }
}


/*
 call(3) -> call(2) -> call(1) -> call(0)
return -> print 1 -> return -> print 2 -> return -> print 3
 */