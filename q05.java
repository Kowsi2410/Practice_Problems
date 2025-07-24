
package gfg;

public class q05 {
 
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i]; // XOR logic: a^a = 0, 0^a = a
        }
        System.out.println(ans);
    }
}

    

