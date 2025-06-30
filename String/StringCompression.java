// Performs basic string compression using character counts
public class StringCompression {
    public static void main(String[] args) {
        String input = "aaabbccdd";
        StringBuilder sb = new StringBuilder();

        int count = 1;

        // Loop through characters and count consecutive duplicates
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1)); // Add the character
                if (count > 1)
                    sb.append(count); // Add count if more than 1
                count = 1; // Reset count
            }
        }

        // Output compressed string
        System.out.println("Compressed: " + sb.toString()); // Output: a3b2c2d2
    }
}
