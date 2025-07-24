/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gfg;
public class q06 {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
