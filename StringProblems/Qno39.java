package StringProblems;

public class Qno39 {
    public static void main(String[] args) {
        String input = "I love Java";
        String[] words = new String[100];
        String current = "";
        int count = 0;

        for (int i = 0; i <= input.length(); i++) {
            char ch = (i < input.length()) ? input.charAt(i) : ' ';
            if (ch != ' ') {
                current += ch;
            } else {
                if (current.length() > 0) {
                    words[count++] = current;
                    current = "";
                }
            }
        }

        System.out.print("Reversed sentence: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) System.out.print(" ");
        }
        System.out.println();
    }
    
}
