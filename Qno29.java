package ArrayProblems;

import java.util.Scanner;

public class Qno29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[50];
        
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int max =-1;
            for(int j=i+1;j<n;j++){
                if( max<arr[j]){
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }
    
}
