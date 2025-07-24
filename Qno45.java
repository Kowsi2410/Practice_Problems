package gfg;

public class Qno45 {

    public static void main(String[] args) {
         int[] arr = {1, 20, 6, 4, 5};
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Number of inversions: " + count);
    }
    
}
