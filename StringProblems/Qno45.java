/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "abcd";
        System.out.print("ASCII Differences: ");

        for (int i = 1; i < input.length(); i++) {
            int diff = input.charAt(i) - input.charAt(i - 1);
            System.out.print(diff + " ");
        }
        System.out.println();
    }
    
}
