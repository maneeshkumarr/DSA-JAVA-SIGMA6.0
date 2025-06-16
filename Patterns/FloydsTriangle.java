package Patterns;

/*
Floyd's Triangle

Dry Run:
n = 5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop for columns: j from 1 to i
- Print counter++
*/

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
