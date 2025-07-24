package StringProblems;

public class Qno33 {
    public static void main(String[] args) {
        String input = "Geeks123For456";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }

        System.out.println("String without digits: " + result);
    }
    
}
