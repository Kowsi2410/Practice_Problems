package StringProblems;

public class Qno18 {
    public static void main(String[] args) {
        String a = "1001";
        String b = "11";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
        }

        System.out.println("Sum: " + result);
    }
    
}
