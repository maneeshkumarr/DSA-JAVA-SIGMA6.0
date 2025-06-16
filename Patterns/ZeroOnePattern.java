package Patterns;
/*
0-1 Pattern

Dry Run:
n = 5

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop for columns: j from 1 to i
- If (i+j) % 2 == 0 -> print 1, else 0
*/

public class ZeroOnePattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
