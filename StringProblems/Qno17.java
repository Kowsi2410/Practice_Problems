package StringProblems;
public class Qno17 {

    public static void main(String[] args) {
        String str = "102100211";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int zero = 0, one = 0, two = 0;
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                switch(ch){
                    case '0': zero++; break;
                    case '1': one++; break;
                    case '2': two++; break;
                }

                if (zero == one && one == two) {
                    count++;
                }
            }
        }
        System.out.println("Count of substrings with equal 0s, 1s, and 2s: " + count);

    }
    
}
