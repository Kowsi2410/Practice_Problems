package StringProblems;

public class Qno15 {
    public static void main(String[] args) {
        String str1 = "Geeks";
        String str2 = "geeks";
        String flag = "True";
        if(str1.length()!=str2.length()){
            flag ="False";
        }
        else{
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)!=str2.charAt(i)){
                        flag = "False";
                    }
                }
            }
        }
        
        System.out.println(flag);
        
    }
    
}
