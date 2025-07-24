/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over a lazy dog";
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32); // to lowercase
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        System.out.println("Is Pangram: " + isPangram);
    }
    
}
