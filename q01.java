/*
1.Given an array of positive integers arr[] of size n, the task is to find second largest distinct 
element in the array. 
Note: If the second largest element does not exist, return -1. 
Examples: 
Input: arr[] = [12, 35, 1, 10, 34, 1] 
Output: 34 
Explanation: The largest element of the array is 35 and the second largest element is 34.  
*/
package gfg;
public class q01 {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        // Step 1: Sort the array in descending order
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 2: Print sorted array (optional)
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 3: Find second largest distinct element
        int largest = arr[0];
        boolean found = false;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != largest) {
                System.out.println(arr[i]); // Second largest distinct element
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println(-1); // No second largest exists
        }
    }
}
