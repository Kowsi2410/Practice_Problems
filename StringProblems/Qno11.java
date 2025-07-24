package StringProblems;

import java.util.Scanner;

public class Qno11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res ="";
        char[] chr = str.toCharArray();
        
        
        if(chr.length%2==0){
            for(int i=0;i<chr.length-1;i+=2){
                char temp = chr[i];
                chr[i]=chr[i+1];
                chr[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<chr.length-2;i+=2){
                char temp = chr[i];
                chr[i]=chr[i+1];
                chr[i+1]=temp;
            }
        }
        
        for(int i=0;i<chr.length;i++){
            res+=chr[i];
        }
        
        System.out.println(res);
    }
    
}
