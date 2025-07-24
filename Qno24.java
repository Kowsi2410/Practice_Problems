package ArrayProblems;

import java.util.Scanner;

public class Qno24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int maxcount=0;
        int maxElement = arr[0];
        
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                maxElement=arr[i];
            }
        }
        System.out.println(maxElement);
        
    }
    
}
