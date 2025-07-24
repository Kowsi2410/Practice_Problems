package StringProblems;

import java.util.Scanner;

public class Qno12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();   // input string
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String temp = "";
            for (int j = i; j < chars.length; j++) {
                temp += chars[j];  
                System.out.println(temp);
            }
        }

        System.out.println("\"\"");  
    }
    
}
