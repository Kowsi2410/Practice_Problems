package StringProblems;

public class Qno34 {
    public static void main(String[] args) {
        String str = "Geeks123";
        boolean isAlphabet = false;
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                isAlphabet=true;
                break;
            }
        }
        if(isAlphabet){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
