
package ArrayProblems;

public class Qno34 {

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 11, 14, 13, 12, 20, 2};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        
         int maxCount = 1, currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue; //skip duplicates

            if (arr[i] == arr[i - 1] + 1) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        System.out.println("Longest consecutive subsequence length: " + maxCount);
    }
    
}
