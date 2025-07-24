package StringProblems;

public class Qno36 {
    public static void main(String[] args) {
        String input = "aaabbcddd";
        String encoded = "";

        int i = 0;
        while (i < input.length()) {
            char current = input.charAt(i);
            int count = 1;

            while (i + 1 < input.length() && input.charAt(i + 1) == current) {
                count++;
                i++;
            }

            encoded += current;
            encoded += count;
            i++;
        }

        System.out.println("Encoded String: " + encoded);
    }
    
}
