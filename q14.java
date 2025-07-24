/*
Given an array, arr[] of size n, the task is to find the count of array indices such that removing an 
element from these indices makes the sum of even-indexed and odd-indexed array elements equal. 
Examples: 
Input: arr[] = [ 2, 1, 6, 4 ]  
Output: 1  
Explanation: Removing arr[1] from the array modifies arr[] to [ 2, 6, 4 ] such that, arr[0] + arr[2] 
= arr[1].  
Therefore, the required output is 1. 
*/
package gfg;

public class q14 {

    static int cntWays(int[] arr) {
        int n = arr.length;
        int res = 0;
        
        // Try removing each element one by one
        for (int i = 0; i < n; i++) {
            int evenSum = 0, oddSum = 0;
            int index = 0;
            
            // Calculate sum of even and odd indexed elements
            // after removing element at index i
            for (int j = 0; j < n; j++) {
                
                // Skip the removed element
                if (j == i) continue; 
                
                if (index % 2 == 0) {
                    evenSum += arr[j];
                } 
                else {
                    oddSum += arr[j];
                }
                index++;
            }
            
            // Check if even sum equals odd sum
            if (evenSum == oddSum) {
                res++;
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 1, 6, 4};
        System.out.println(cntWays(arr));
        
    }
    
}
