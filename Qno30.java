
package ArrayProblems;
public class Qno30 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
