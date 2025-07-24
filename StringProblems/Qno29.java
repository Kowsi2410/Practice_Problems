package StringProblems;

public class Qno29 {
    public static void main(String[] args) {
        String input = "Java is a powerful language";
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        System.out.println("Word count: " + wordCount);
    }
    
}
