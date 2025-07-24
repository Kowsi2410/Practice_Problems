package ArrayProblems;

import java.util.Scanner;

public class Qno18 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        int arr[] = new int[100];
               
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
