package String;
public class TwoPointerPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome (Two Pointer)? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // 🔍 Dry Run:
        // left = 0 ('A'), right = s.length()-1 ('a')
        // skip spaces/punctuation
        // compare Character.toLowerCase(left) and right
        // if mismatch → false; else move pointers inward

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
