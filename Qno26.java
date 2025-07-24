package ArrayProblems;

import java.util.Scanner;

public class Qno26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        

       System.out.println(arr[k-1]);
            
    }
    
}
