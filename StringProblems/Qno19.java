package StringProblems;

public class Qno19 {
    public static void main(String[] args) {
        String ip = "125.512.100.1";
        int start = 0, dotCount = 0;
        boolean isValid = true;

        for (int i = 0; i <= ip.length(); i++) {
            if (i == ip.length() || ip.charAt(i) == '.') {
                dotCount++;
                if (dotCount > 4) {
                    isValid = false;
                    break;
                }
                int num = 0;
                for (int j = start; j < i; j++) {
                    char ch = ip.charAt(j);
                    if (ch < '0' || ch > '9') {
                        isValid = false;
                        break;
                    }
                    num = num * 10 + (ch - '0');
                }
                if (num < 0 || num > 255 || i == start) {
                    isValid = false;
                    break;
                }
                start = i + 1;
            }
        }

        if (dotCount != 4) isValid = false;

        System.out.println(isValid ? "Valid" : "Invalid");
    }
    
}
