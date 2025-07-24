package ArrayProblems;

public class Qno23 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4};
        int union[] = new int[100];
        
        for(int i=0;i<arr1.length;i++){
            union[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            union[i+arr1.length]=arr2[i];
        }
        
        
        for (int i = 0; i < union.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (union[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && union[i]!=0) {
                System.out.println(union[i] + " ");
            } //union[i]!=0 because java itself fills the remaining elements other than the given
              //elements in the array as zeros
        }
        
    }
    
}
