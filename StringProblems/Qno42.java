/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringProblems;

/**
 *
 * @author Admin
 */
public class Qno42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mainStr = "GeeksForGeeks";
        String suffix = "Geeks";

        boolean endsWith = true;
        int mainLen = mainStr.length();
        int suffixLen = suffix.length();

        if (suffixLen > mainLen) {
            endsWith = false;
        } else {
            for (int i = 0; i < suffixLen; i++) {
                if (mainStr.charAt(mainLen - suffixLen + i) != suffix.charAt(i)) {
                    endsWith = false;
                    break;
                }
            }
        }

        System.out.println("Ends with suffix: " + endsWith);
    }
    
}
