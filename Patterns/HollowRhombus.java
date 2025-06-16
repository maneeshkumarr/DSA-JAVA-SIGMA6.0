package Patterns;
/*
Hollow Rhombus

Dry Run:
n = 5

    *****
   *   *
  *   *
 *   *
*****

Logic:
- For rows 1 to n:
  - Print (n - i) spaces
  - Print stars and spaces:
    - If first or last row: print all stars
    - Else: print star, then spaces, then star
*/

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars and spaces
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
