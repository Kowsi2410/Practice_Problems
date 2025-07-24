package ArrayProblems;

public class Qno32 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 1, 2};
        boolean isEqual = true;
        
        if(arr1.length!=arr2.length){
            System.out.println("Not Equal");
        }
        else{
            for(int i=0;i<arr1.length;i++){
                for(int j=i+1;j<arr1.length;j++){
                    if(arr1[i]>arr1[j]){
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }   
                }
            }
            for(int i=0;i<arr2.length;i++){
                for(int j=i+1;j<arr2.length;j++){
                    if(arr2[i]>arr2[j]){
                        int temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }   
                }
            }
            
            for(int i=0;i<arr1.length;i++){
                    if(arr1[i]!=arr2[i]){
                        isEqual = false;
                        break;
                    }
                
            }
            if(isEqual){
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }
        }
    }
    
}
