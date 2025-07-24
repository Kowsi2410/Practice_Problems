package gfg;

import java.util.Arrays;

public class Qno41 {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;

        Arrays.sort(arr);
        System.out.println("Triplets with sum 0:");

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // skip duplicates
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println("(" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
    
}
