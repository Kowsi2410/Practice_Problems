package ArrayProblems;

public class Qno33 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        int currentSum = arr[0], start = 0;

        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                System.out.println("Subarray found from index " + start + " to " + (i - 1));
                return;
            }

            if (i < arr.length) {
                currentSum += arr[i];
            }
        }

        System.out.println("No subarray found");
    }
    
}
