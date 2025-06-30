// Converts first letter of each word in a string to uppercase
public class CapitalizeEachWord {
    public static void main(String[] args) {
        String input = "hello world from java";

        // Splitting sentence into words
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Capitalize first letter of each word
        for (String word : words) {
            if (word.length() > 0)
                result.append(Character.toUpperCase(word.charAt(0)))  // Make first letter uppercase
                      .append(word.substring(1))                      // Add rest of the word
                      .append(" ");
        }

        // Print final result after trimming trailing space
        System.out.println(result.toString().trim()); // Output: Hello World From Java
    }
}
