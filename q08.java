/*
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1] 
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9] 
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of them. 
Input: arr[] = [0, 1, 2, 3, 4, 5]  
Output: [0, 1, 2, 3, 4, 5] 
Explanation: In range 0 to 5, all number are present. 
*/
package gfg;

public class q08 {

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) ans[i] = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1 && arr[i] < n) {
                ans[arr[i]] = arr[i];  //here ans[arr[i]]->arr[i] becomes the index eg:ans[6]= 6->at 6 th index it stores the value 6
            }
        }

        for (int x : ans) System.out.print(x + " ");
       
    }
}


