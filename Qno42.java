package gfg;

public class Qno42 {
    public static void main(String[] args) {
         int[] arr = {10, 3, 5, 6, 20};
        int n = arr.length;

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int val : arr) {
            if (val > max1) {
                max2 = max1;
                max1 = val;
            } else if (val > max2) {
                max2 = val;
            }

            if (val < min1) {
                min2 = min1;
                min1 = val;
            } else if (val < min2) {
                min2 = val;
            }
        }

        int product1 = max1 * max2;
        int product2 = min1 * min2;

        int maxProduct = Math.max(product1, product2);

        System.out.println("Maximum product = " + maxProduct);
    }
    
}
