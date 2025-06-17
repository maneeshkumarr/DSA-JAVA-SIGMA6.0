public class PrintAllPairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7};
        int n = arr.length;

        // Loop to pick the first element of the pair
        for (int i = 0; i < n; i++) {
            int cur = arr[i];

            // Loop to pair it with each of the elements after it
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + cur + ", " + arr[j] + ")");
            }
        }
    }
}
