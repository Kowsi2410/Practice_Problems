package StringProblems;

public class Qno20 {
    public static void main(String[] args) {
        String str = "abc";
        char[] arr = str.toCharArray();
        permute(arr, 0);
    }

    static void permute(char[] arr, int index) {
        if (index == arr.length - 1) {
            for (char c : arr)
                System.out.print(c);
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permute(arr, index + 1);
            swap(arr, i, index); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
