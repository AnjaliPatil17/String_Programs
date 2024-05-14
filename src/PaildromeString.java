package String_Program;

import java.util.Scanner;

public class PaildromeString {
    public static String paildrome(String text){
        String reverseword="";
        String ans;
        for(int i=text.length()-1;i>=0;i--){
            reverseword=reverseword+text.charAt(i);
        }
        if(reverseword.equals(text)){
           ans="Its paildrome String";
        }else {
            ans="Its not paildrome String";
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text=sc.nextLine();
        System.out.print(paildrome(text));
        sc.close();
    }
}
