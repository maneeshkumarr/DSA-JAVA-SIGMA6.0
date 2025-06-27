public class BruteForcePalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome (Brute Force)? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // Step 1: Filter and lowercase
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();

        // 🔍 Dry Run:
        // Input: "A man, a plan, a canal: Panama"
        // After filtering and lowercasing: "amanaplanacanalpanama"
        // Reversed string: "amanaplanacanalpanama"
        // Both match → return true

        return cleaned.equals(reversed);
    }
}
