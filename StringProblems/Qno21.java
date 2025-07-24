package StringProblems;

import java.util.Scanner;

public class Qno21 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       
       int vow = 0;
       int con = 0;
       
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
                   str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'
                   ||str.charAt(i)=='E'||str.charAt(i)=='I'||
                   str.charAt(i)=='O'||str.charAt(i)=='U'){
               vow++;
           }
           else{
               con++;
           }
       }
       System.out.println("Vowel Count: "+vow);
       System.out.println("Consonant Count: "+con);
    }
    
}
