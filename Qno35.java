//Problem not clear

package ArrayProblems;

import java.util.Scanner;

public class Qno35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[100];
        int count=0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        
        if(count>n/2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
