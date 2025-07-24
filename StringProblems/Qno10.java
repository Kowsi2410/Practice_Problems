package StringProblems;

import java.util.Scanner;

public class Qno10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String strarr[]=new String[100];
        
        int wordcount =0;
        String word = "";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                word+=str.charAt(i);
            }
            else{
                strarr[wordcount] = word;
                wordcount++;
                word="";
            }
        }
        
        if (!word.equals("")) {
            strarr[wordcount] = word;
            wordcount++;
        }
        
        System.out.print("[");
        
        for(int i=0;i< wordcount;i++){
            if(i!=wordcount-1){
                System.out.print(strarr[i]+",");
            }
            else{
                System.out.print(strarr[i]);
            }
        }
        
        System.out.println("]");
        
        System.out.println(strarr[1]);
    }
    
}
