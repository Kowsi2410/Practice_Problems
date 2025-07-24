/*
 Given an integer n, we need to repeatedly find the sum of its digits until the result becomes a 
single-digit number. 
Examples: 
Input: n = 1234  
Output: 1  
Explanation: 
Step 1: 1 + 2 + 3 + 4 = 10  
Step 2: 1 + 0 = 1
*/
package gfg;
public class q15 {
    public static void main(String[] args) {

        int n = 5674;

        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }

        System.out.println(n);
    }
}
