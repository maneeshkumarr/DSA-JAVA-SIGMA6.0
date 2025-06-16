package Patterns;

/*
Solid Rhombus

Dry Run:
n = 5

    *****
   *****
  *****
 *****
*****

Logic:
- For rows 1 to n:
  - Print (n - i) spaces
  - Print n stars
*/

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
