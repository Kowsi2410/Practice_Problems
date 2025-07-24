package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Qno04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();
        
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
        
    }
    
}
