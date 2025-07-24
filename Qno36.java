package gfg;

import java.util.Scanner;

public class Qno36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // columns
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] freq = new int[1000]; // stores count of each element across rows

        // Handle first row without duplicates
        boolean[] seen = new boolean[1000];
        for (int j = 0; j < n; j++) {
            int val = mat[0][j];
            if (!seen[val]) {
                freq[val]++;
                seen[val] = true;
            }
        }

        // Process rest of the rows
        for (int i = 1; i < m; i++) {
            seen = new boolean[1000]; // reset for each row
            for (int j = 0; j < n; j++) {
                int val = mat[i][j];
                if (freq[val] == i && !seen[val]) {
                    freq[val]++;
                    seen[val] = true;
                }
            }
        }

        // Print common elements
        boolean found = false;
        for (int i = 0; i < 1000; i++) {
            if (freq[i] == m) {
                System.out.println(i);
                found = true;
                
            }
        }

        if (!found) {
            System.out.println("No common element");
        }
    }
}
