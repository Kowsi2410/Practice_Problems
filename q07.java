/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gfg;
public class q07
{
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        int curr = 0, start = 0;

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            while (curr > sum) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                System.out.println((start + 1) + " " + (i + 1));
                return;
            }
        }
        System.out.println("-1");
    }
}
