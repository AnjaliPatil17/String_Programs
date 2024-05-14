package String_Program;

import java.util.Scanner;

public class ReverseString {
    public static String Reverse( String word){
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse= reverse + word.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input String: ");
        String word = sc.nextLine();
        System.out.print(Reverse(word));
        sc.close();
    }
}
