/*
An array contains both positive and negative numbers in random order. Rearrange the array 
elements so that positive and negative numbers are placed alternatively. A number of positive and 
negative numbers need not be equal. If there are more positive numbers they appear at the end of the 
array. If there are more negative numbers, they too appear at the end of the array. 
Example: 
Input: [-1, 2, -3, 4, 5, 6, -7, 8, 9] 
Output: [9, -7, 8, -3, 5, -1, 2, 4, 6] 
Input: [-1, 3, -2, -4, 7, -5] 
Output: [7, -2, 3, -5, -1, -4] 
*/
package gfg;

public class q09 {
 
    public static void main(String[] args) {
  int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;

        int arrn[] = new int[n]; // Array to store negative numbers
        int arrp[] = new int[n]; // Array to store positive numbers

        int posCount = 0; // Tracks the number of positive elements
        int negCount = 0; // Tracks the number of negative elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrp[posCount++] = arr[i];
            } else {
                arrn[negCount++] = arr[i];
            }
        }
        
        // Sorting the positive array (your original sorting logic is retained)
        for (int j = 0; j < posCount; j++) {
            for (int k = 0; k < j; k++) {
                if (arrp[j] > arrp[k]) { // Changed to ascending order sort
                    int temp = arrp[j];
                    arrp[j] = arrp[k];
                    arrp[k] = temp;
                }
            }
        }
        
        // Sorting the negative array (your original sorting logic is retained)
        for (int j = 0; j < negCount; j++) {
            for (int k = 0; k < j; k++) {
                if (arrn[j] > arrn[k]) { // Changed to ascending order sort
                    int temp = arrn[j];
                    arrn[j] = arrn[k];
                    arrn[k] = temp;
                }
            }
        }

        // Print alternately
        int posIndex = 0;
        int negIndex = 0;

        while (posIndex < posCount && negIndex < negCount) {
            System.out.print(arrp[posIndex++] + " ");
            System.out.print(arrn[negIndex++] + " ");
        }

        // Print remaining positive numbers
        while (posIndex < posCount) {
            System.out.print(arrp[posIndex++] + " ");
        }

        // Print remaining negative numbers
        while (negIndex < negCount) {
            System.out.print(arrn[negIndex++] + " ");
        }
        System.out.println(); 
    }
}
