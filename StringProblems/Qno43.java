/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "abaeae";
        System.out.println("Palindromic substrings:");

        for (int i = 0; i < str.length(); i++) {
            // Odd length
            findPalindrome(str, i, i);
            // Even length
            findPalindrome(str, i, i + 1);
        }
    }

    static void findPalindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            if (right - left + 1 >= 3) {
                for (int i = left; i <= right; i++) {
                    System.out.print(str.charAt(i));
                }
                System.out.println();
            }
            left--;
            right++;
        }
    }
    
}
