package StringProblems;

public class Qno31 {
    public static void main(String[] args) {
        String str = "abaxyzzyxf";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            // Odd length palindrome
            String p1 = expandAroundCenter(str, i, i);
            if (p1.length() > longest.length()) longest = p1;

            // Even length palindrome
            String p2 = expandAroundCenter(str, i, i + 1);
            if (p2.length() > longest.length()) longest = p2;
        }

        System.out.println("Longest palindromic substring: " + longest);
    }

    static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Build the substring manually
        String result = "";
        for (int i = left + 1; i < right; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    
}
