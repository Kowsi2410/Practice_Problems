package gfg;
import java.util.Arrays;
public class q49 {
   public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 6};
        int n = arr.length;
        Arrays.sort(arr);
        boolean consecutive = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                consecutive = false;
                break;
            }
        }
        System.out.println(consecutive ? "Yes" : "No");
    }
}

    


