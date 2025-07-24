package gfg;

public class Qno37 {
    public static void main(String[] args) {
       int[] arr = {3,3,4,2,3,3,3,4,4,4,4,4,4};
       for(int i=0;i<arr.length;i++){
           int count = 1; 
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
           }
           if(count>(arr.length/2)){
               System.out.println(arr[i]);
               break;
           }
       }
       
    }  
}
