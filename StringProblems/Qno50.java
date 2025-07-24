/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "bcadeh";
        String str2 = "hea";

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 'a' && ch <= 'z') count1[ch - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch >= 'a' && ch <= 'z') count2[ch - 'a']++;
        }

        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(count1[i] - count2[i]);
        }

        System.out.println("Minimum deletions: " + deletions);
    }
    
}
