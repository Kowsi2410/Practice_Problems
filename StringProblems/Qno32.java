package StringProblems;

public class Qno32 {

    public static void main(String[] args) {
        String input = "JaVa";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // convert to uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // convert to lowercase
            } else {
                result += ch; // keep as-is
            }
        }

        System.out.println("Toggled case: " + result);
    }
    
}
