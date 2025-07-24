package gfg;

public class Qno47 { 
    public static void main(String[] args) {
         int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays with sum = " + k + ": " + count);
    }
    
}
