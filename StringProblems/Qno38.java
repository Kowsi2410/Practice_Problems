package StringProblems;

public class Qno38 {
    public static void main(String[] args) {
        String input = "Java123WORLD";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= 'a' && ch <= 'z')) {
                result += ch;
            }
        }

        System.out.println("Without lowercase: " + result);
    }
    
}
