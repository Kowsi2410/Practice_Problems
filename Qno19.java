package ArrayProblems;

import java.util.Scanner;

public class Qno19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        
        System.out.println("Enter the elements of Array:");
        int arr[] = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean asc = true, desc = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                desc = false;
            }
            if (arr[i] > arr[i + 1]) {
                asc = false;
            }
        }

        if (asc || desc) {
            System.out.println("Yes");  
        } else {
            System.out.println("No");   
        }
    }
}
