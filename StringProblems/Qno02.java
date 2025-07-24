package StringProblems;

import java.util.Scanner;

public class Qno02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Original String: ");
        String s = sc.next();
        System.out.println("String to be inserted: ");
        String s2 = sc.next();
        System.out.println("Enter Index: ");
        int index = sc.nextInt();
        String result="";
        
        //With Builtin
        System.out.println("\nWith Builtin: ");
        String part1 = s.substring(0, index);
        String part2 = s.substring(index);
        System.out.println(part1+s2+part2);
        
        //Without Builtin
        System.out.println("\nWithout Builtin:");
        for(int i=0;i<s.length();i++){
            if(i==index){
                result=result+s2;
            }
            result+=s.charAt(i);
        }
        System.out.println(result);
    }
    
}
