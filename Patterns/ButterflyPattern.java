package Patterns;
/*
Butterfly Pattern

Dry Run:
n = 5

*        *
**      **
***    ***
****  ****
**********

Logic:
- Two halves (left and right wings)
- For rows 1 to n:
  - Print i stars
  - Print (2*(n - i)) spaces
  - Print i stars
*/

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            // Left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for(int j = 1; j <= 2*(n - i); j++) {
                System.out.print(" ");
            }
            // Right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
