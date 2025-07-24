/*
 Given an integer array arr[] of size n, find the inversion count in the array. Two array 
elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j. 
Note: Inversion Count for an array indicates that how far (or close) the array is from being sorted. If 
the array is already sorted, then the inversion count is 0, but if the array is sorted in reverse order, the 
inversion count is maximum.  
Examples: 
Input: arr[] = {1, 2, 3, 4, 5} 
Output: 0 
Explanation: There is no pair of indexes (i, j) exists in the given array such that arr[i] > arr[j] and i < 
j 
Input: arr[] = {10, 10, 10} 
Output: 0 
*/
package gfg;

public class q11 {

    public static void main(String[] args) {
       
        int[] arr = {1,2,5,4,3};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) count++;
            }
        }

        System.out.println(count);
    }
}

    
    

