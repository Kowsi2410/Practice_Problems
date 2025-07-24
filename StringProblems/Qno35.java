package StringProblems;

public class Qno35 {
    public static void main(String[] args) {
        String input = "This   is     Java";
        String result = "";
        boolean spaceFound = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                if (!spaceFound) {
                    result += ch;
                    spaceFound = true;
                }
            } else {
                result += ch;
                spaceFound = false;
            }
        }

        System.out.println("Result: " + result);
    }
    
}
