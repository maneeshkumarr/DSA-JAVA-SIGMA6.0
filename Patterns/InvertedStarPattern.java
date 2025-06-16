package Patterns;

/*
Inverted Star Pattern

Dry Run:
n = 5

*****
****
***
**
*

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop for columns: j from 1 to (n - i + 1)
- Print '*' in each column
*/

public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
