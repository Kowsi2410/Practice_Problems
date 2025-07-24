
/*
Given a string (seats) of 1s and 0s, where 1 represents a filled seat and 0 represents an empty seat 
in a row. Find an empty seat with maximum distance from an occupied seat. Return the maximum 
distance. 
Examples: 
Input: Seats = "1000101" 
Output: 2 
Explanation: Geek can take 3rd place and have a distance of 2 in left and 2 in right. 

  */
package gfg;

public class q13 {
    public static void main(String[] args) {

        String seats = "1000101";
        int max = 0, last = -1;

        for (int i = 0; i < seats.length(); i++) {
            if (seats.charAt(i) == '1') {
                if (last == -1)
                    max = i;
                else
                    max = Math.max(max, (i - last) / 2);
                last = i;
            }
        }

        max = Math.max(max, seats.length() - 1 - last);
        System.out.println(max);
        
        
    }
}
