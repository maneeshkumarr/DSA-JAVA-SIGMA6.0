package Patterns;
/*
Half Pyramid

Dry Run:
n = 5

*
**
***
****
*****

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop for columns: j from 1 to i
- Print '*' in each column
*/

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
