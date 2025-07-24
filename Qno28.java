package ArrayProblems;

public class Qno28 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break; 
                }
            }
            if (found)
                break; 
        }

        if (!found) {
            System.out.println("No repeating element found.");
        }
    }
    
}
