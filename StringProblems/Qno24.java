package StringProblems;

import java.util.Scanner;

public class Qno24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        boolean[] visited = new boolean[str.length()];
        
        for(int i=0;i<str.length();i++){
            if(visited[i]) continue;
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i)+":"+count);
        }
        
    }
    
}
