package StringProblems;

import java.util.Scanner;

public class Qno13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                index=i;
                break;
               
            }
        }
        for(int i=index;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
    
}
