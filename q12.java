/*
  Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays. Assume 
that the two sorted arrays are merged and then median is selected from the combined array. 
This is an extension of Median of two sorted arrays of equal size problem. Here we handle arrays of 
unequal size also. 
Examples:  
Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10] 
Output: 3 
Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. So the median of the 
merged array is 3. 
*/
package gfg;
import java.util.Arrays;
public class q12 {   
    public static void main(String[] args) {
        int[] a = {-5, 3, 6, 12, 15};
        int[] b = {-12, -10, -6, -3, 4, 10};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);
        int n = c.length;
        if (n % 2 == 0)
            System.out.println((c[n / 2 - 1] + c[n / 2]) / 2.0);
        else
            System.out.println(c[n / 2]);
    }
}
