/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayProblems;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Qno17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        int arr[] = new int[100];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        
        System.out.println("Largest Element: "+max+" Smallest Element: "+min);
    }
    
}
