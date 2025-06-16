package Patterns;
/*
Diamond Pattern

Dry Run:
n = 5

    *
   ***
  *****
 *******
*********

Logic:
- Upper half: for i = 1 to n
  - Print (n - i) spaces
  - Print (2*i - 1) stars
- Lower half: for i = n-1 down to 1
  - Print (n - i) spaces
  - Print (2*i - 1) stars
*/

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


