/*
 Find Maximum Sum of a Subarray (Kadane’s Algorithm) 
Input: arr[] = [-2, -3, 4, -1, -2, 1, 5, -3] 
Output: 7 
Explanation: Maximum sum of contiguous subarray: [4, -1, -2, 1, 5]
*/
package gfg;

public class q48 {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxEndingHere = 0, maxSoFar = Integer.MIN_VALUE;
        for (int x : arr) {
            maxEndingHere += x;
            if (maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
            if (maxEndingHere < 0) maxEndingHere = 0;
        }
        System.out.println(maxSoFar);
    }
}
