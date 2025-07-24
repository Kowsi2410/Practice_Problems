/*
We are given an array that contains 1 to n elements, our task is to sort this array in an efficient way. 
We are not allowed to simply copy the numbers from 1 to n. 
Examples :  
Input : arr[] = {2, 1, 3}; 
Output : {1, 2, 3} 
*/
package gfg;

public class q03 {

    public static void main(String[] args) {
        int arr[]={2,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
