package gfg;

public class Qno46 {
    public static void main(String[] args) {
        int[] arr = {0, -10, 1, 3, -20};
        int n = arr.length;

        // Step 1: Replace negatives and 0s with a large number
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 2;
            }
        }

        // Step 2: Mark visited indices
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val <= n) {
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }

        // Step 3: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println("Smallest missing positive number: " + (i + 1));
                return;
            }
        }

        System.out.println("Smallest missing positive number: " + (n + 1));
    }
    
}
