package Patterns;
/*
Hollow Rectangle

Dry Run:
rows = 5, cols = 5

*****
*   *
*   *
*   *
*****

Logic:
- Outer loop for rows: i from 1 to rows
- Inner loop for columns: j from 1 to cols
- If i==1 or i==rows or j==1 or j==cols -> print '*'
- Else print space
*/

public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5, cols = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
