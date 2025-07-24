package StringProblems;

import java.util.Scanner;
public class Qno01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
       
        System.out.println("With Builtin: ");
        //with Builtin
        String[] words = s.split(" ");
        for(String word : words){
            if(word.length()%2==0){
                System.out.println(word);
            }
        }
        
        System.out.println("\nWithout Builtin: ");
        //without Builtin
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else{
                if(word.length()%2==0 && word.length()>0){
                    System.out.println(word);
                }
                word="";
            }
        }
        if(word.length()%2==0 && word.length()>0){
            System.out.println(word);
        }
                
    }
    
}
