package StringProblems;

import java.util.Scanner;

public class Qno30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(c);
                found = true; //return; for first non-repeating character
            }
        }
        if(!found){
        System.out.println("No non-repeating character found.");
        }
    }
    
}
