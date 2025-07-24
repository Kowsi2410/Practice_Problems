/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "hello world from java";
        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext && ch >= 'a' && ch <= 'z') {
                    result += (char)(ch - 32); // convert to uppercase
                } else if (!capitalizeNext) {
                    result += ch;
                } else {
                    result += ch;
                }
                capitalizeNext = false;
            }
        }

        System.out.println("CamelCase: " + result);
    }
    
}
