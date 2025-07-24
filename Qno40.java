package gfg;

public class Qno40 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int diff = 2;
        int n = arr.length;

        System.out.println("Pairs with difference " + diff + ":");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && Math.abs(arr[i] - arr[j]) == diff) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
    
}
