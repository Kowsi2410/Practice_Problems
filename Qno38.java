
package gfg;

public class Qno38 {

    public static void main(String[] args) {
        int[] arr ={12, 17, 70, 15, 22, 65, 21, 90};
        
        System.out.print("Even: [");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
        
        System.out.print("Odd: [");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
               System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
    }
    
}
