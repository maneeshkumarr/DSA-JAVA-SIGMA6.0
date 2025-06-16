package Patterns;
/*
Inverted Half Pyramid

Dry Run:
n = 5

*****
****
***
**
*

Logic:
- Outer loop for rows: i from n to 1
- Inner loop for columns: j from 1 to i
*/

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
