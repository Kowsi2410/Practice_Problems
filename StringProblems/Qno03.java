package StringProblems;

import java.util.Scanner;

public class Qno03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = true;
        String rev="";
        
        System.out.println("Method:1");
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag = false;
            }
        }
        if(flag){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("Method:2");
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        
        if(rev.equals(str)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
