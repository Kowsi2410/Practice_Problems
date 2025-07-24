package StringProblems;

public class Qno27 {
    public static void main(String[] args) {
        String input = " Hello World ";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("String without spaces: " + result);
    }
    
}
