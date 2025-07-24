/*
Given an array of integers arr[], the task is to move all the zeros to the end of the array while 
maintaining the relative order of all non-zero elements. 
Examples:  
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0] 
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0] 
Explanation: There are three 0s that are moved to the end.  
*/
package gfg;

public class q02 {

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 7, 0, 4, 3, 0, 5, 0};

        // Use a nested loop only when a 0 is encountered
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Shift all elements to the left from i+1 onward
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        // Swap non-zero with zero
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break; // Move to next index
                    }
                }
            }
        }

        // Print the result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
