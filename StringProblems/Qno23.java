package StringProblems;

import java.util.Scanner;

public class Qno23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res="";
        
//        for(int i=0;i<str.length();i++){
//           char c = str.charAt(i);
//           if(res.indexOf(c)==-1){
//               res+=c;
//           }
//        }
//        System.out.println(res);

         for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(str.charAt(j) == c) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                res += c;
            }
        }

        System.out.println(res);

    }
    
}
