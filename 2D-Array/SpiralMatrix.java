import java.util.*;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {

            // Traverse Top Row
            for(int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++;

            // Traverse Right Column
            for(int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            // Traverse Bottom Row (if still within bounds)
            if(startRow <= endRow) {
                for(int j = endCol; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }

            // Traverse Left Column (if still within bounds)
            if(startCol <= endCol) {
                for(int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> spiral = spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiral);
    }
}


/*
Initial Matrix:
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

1. Traverse top row → [1, 2, 3]
   Move startRow down → startRow = 1

2. Traverse right column → [6, 9]
   Move endCol left → endCol = 1

3. Traverse bottom row ← [8, 7]
   Move endRow up → endRow = 1

4. Traverse left column ↑ [4]
   Move startCol right → startCol = 1

5. Traverse top row → [5]
   Move startRow down → startRow = 2

Done (startRow > endRow)

 Final Spiral Order: [1, 2, 3, 6, 9, 8, 7, 4, 5]

 */