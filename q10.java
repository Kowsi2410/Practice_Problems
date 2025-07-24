/*
 Given two integer arrays of the same length, arr[] and index[], the task is to reorder the elements 
in arr[] such that after reordering, each element from arr[i] moves to the position index[i]. The new 
arrangement reflects the values being placed at their target indices, as described by index[] array. 
Example:  
Input: arr[] = [10, 11, 12], index[] = [1, 0, 2] 
Output: 11 10 12 
Explanation: 10 moves to position 1, 11 to 0, and 12 stays at 2. 
*/
package gfg;

public class q10 {

    public static void main(String[] args) {
       
        int[] arr = {10, 11, 12};
        int[] index = {1, 0, 2};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[index[i]] = arr[i];
        }

        for (int x : ans) System.out.print(x + " ");
    }
}

