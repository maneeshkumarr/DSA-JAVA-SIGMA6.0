
public class RegexPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome (Regex)? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // Step 1: Remove all non-alphanumerics and lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 🔍 Dry Run:
        // Original: "A man, a plan, a canal: Panama"
        // Cleaned: "amanaplanacanalpanama"
        // Reversed: "amanaplanacanalpanama"
        // Result: true

        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}



