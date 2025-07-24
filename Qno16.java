package ArrayProblems;

import java.util.Scanner;

public class Qno16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean visited[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i])continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
        
        
    }
    
}
