package gfg;

public class Qno44 {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, -4, -1, 4};
        int n = arr.length;

        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, ne = 0;

        // Separate positive and negative elements
        for (int val : arr) {
            if (val >= 0)
                pos[p++] = val;
            else
                neg[ne++] = val;
        }

        // Rearranging alternately
        int i = 0, j = 0, k = 0;
        while (i < p && j < ne) {
            arr[k++] = neg[j++];
            arr[k++] = pos[i++];
        }

        // Add remaining positives
        while (i < p)
            arr[k++] = pos[i++];

        // Add remaining negatives
        while (j < ne)
            arr[k++] = neg[j++];

        System.out.print("Rearranged array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    
}
