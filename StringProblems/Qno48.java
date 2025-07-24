/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "I love Java";
        String word = "", result = "";

        for (int i = 0; i <= input.length(); i++) {
            char ch = (i < input.length()) ? input.charAt(i) : ' ';
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += " ";
                word = "";
            }
        }

        System.out.println("Reversed words: " + result.trim());
    }
    
}
