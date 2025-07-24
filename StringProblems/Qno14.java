package StringProblems;

import java.util.Scanner;

public class Qno14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        String res ="";
        
        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
        }
        System.out.println(res);
    }
    
}
