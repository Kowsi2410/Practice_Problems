package StringProblems;

public class Qno06 {
    public static void main(String[] args) {
       System.out.println("GFG\ngfg");
       String str1="geeks";
       String str2="for";
       String res="";
       int index=3;
       for(int i=0;i<str1.length();i++){
           if(i==index){
               res+=str2;
           }
           res+=str1.charAt(i);
       }
       System.out.print(res);
    }
    
}
