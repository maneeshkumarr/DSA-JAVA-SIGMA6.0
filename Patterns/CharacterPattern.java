package Patterns;

/*
Character Pattern

Dry Run:
n = 5

A
AB
ABC
ABCD
ABCDE

Logic:
- Outer loop for rows: i from 1 to n
- Inner loop for columns: j from 1 to i
- Print (char)('A' + j - 1)
*/

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }
}
