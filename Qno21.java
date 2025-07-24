package ArrayProblems;

public class Qno21 {

    public static void main(String[] args) {
        int n= 6;
        int arr[] = {1,2,4,5,6};
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        int total = (n*(n+1))/2;
        System.out.println(total-sum);
        
    }
    
}
