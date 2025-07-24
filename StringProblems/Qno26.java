package StringProblems;

import java.util.Scanner;

public class Qno26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                System.out.print('o');
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
