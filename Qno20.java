package ArrayProblems;

import java.util.Scanner;

public class Qno20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        int arr[] = new int[100];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("[");
        for(int i=n-1;i>=0;i--){
            if(i>0){
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
    
}
