public class RemoveDuplicateLettersRecursive {
    public String removeDuplicateLetters(String s) {
        if (s.length() == 0) return "";

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            count[s.charAt(i) - 'a']--;
            if (count[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }

        char first = s.charAt(pos);
        String rest = s.substring(pos + 1).replaceAll("" + first, "");

        return first + removeDuplicateLetters(rest);
    }

    // Optional main method for testing
    public static void main(String[] args) {
        RemoveDuplicateLettersRecursive solution = new RemoveDuplicateLettersRecursive();
        System.out.println(solution.removeDuplicateLetters("cbacdcbc")); // Output: acdb
    }
}
