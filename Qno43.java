package gfg;

public class Qno43 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        System.out.println("Leaders in the array:");
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " "); // Last element is always a leader

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
    
}
