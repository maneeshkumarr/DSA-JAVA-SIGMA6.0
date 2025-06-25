import java.util.*;

public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < m) result[k++] = a[i++];
        while (j < n) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        /*
        Dry Run:
        a = [1, 3, 5], b = [2, 4, 6]

        Step-by-step:
        → 1 < 2 → result = [1]
        → 3 > 2 → result = [1, 2]
        → 3 < 4 → result = [1, 2, 3]
        → 5 > 4 → result = [1, 2, 3, 4]
        → 5 < 6 → result = [1, 2, 3, 4, 5]
        → left: 6 → result = [1, 2, 3, 4, 5, 6]
        */

        System.out.println("Merged Array: " + Arrays.toString(merge(a, b)));
    }
}

