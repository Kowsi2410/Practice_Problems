package StringProblems;

public class Qno40 {
    public static void main(String[] args) {
        String input = "@He#llo!$";
        int specialCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') ||
                  (ch >= 'A' && ch <= 'Z') ||
                  (ch >= '0' && ch <= '9'))) {
                specialCount++;
            }
        }

        System.out.println("Special characters count: " + specialCount);
    }
    
}
