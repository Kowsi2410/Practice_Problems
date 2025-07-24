package ArrayProblems;

import java.util.Scanner;

public class Qno27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[100];
        int evenCount=0;
        int oddCount=0;
        
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                oddCount+=1;
            }
            else{
                evenCount+=1;
            }
        }
        
        System.out.println("Even:" + evenCount+"\nOdd:"+oddCount);
    }
    
}
