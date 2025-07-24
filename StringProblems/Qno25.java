package StringProblems;

public class Qno25 {
    public static void main(String[] args) {
         String input = "java";
        String upper = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Convert only if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // ASCII conversion
            }

            upper += ch;
        }

        System.out.println("Uppercase: " + upper);
    }
    
}
