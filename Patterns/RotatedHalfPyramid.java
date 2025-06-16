package Patterns;
/*
Rotated Half Pyramid

Dry Run:
n = 5

    *
   **
  ***
 ****
*****

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop 1: print (n-i) spaces
- Inner loop 2: print i stars
*/

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
