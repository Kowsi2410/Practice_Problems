package gfg;

public class Qno39 {
    public static void main(String[] args) {

        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;

        int repeating = -1, missing = -1;
        int[] freq = new int[n + 1];

        for (int val : arr) {
            freq[val]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Missing = " + missing + ", Repeating = " + repeating);
    }
}

