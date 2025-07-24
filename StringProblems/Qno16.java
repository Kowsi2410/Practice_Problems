package StringProblems;

import java.math.BigInteger;

public class Qno16 {
    public static void main(String[] args) {
        String str1 = "7777555511111111";
        String str2 = "3332222221111";
        
        System.out.println("Method 1:");
        BigInteger n1 = new BigInteger(str1);
        BigInteger n2 = new BigInteger(str2);
        System.out.println(n1.add(n2));
        
        System.out.println("Method 2:\n");
        long num1 = Long.parseLong(str1);
        long num2 = Long.parseLong(str2);
        System.out.println(num1+num2);
    }
    
}
