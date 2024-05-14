package String_Program;

import java.util.Scanner;

public class CharacterIncrementByOne {
    public  static void charcterIncrement(char ch){

       for( int i=(int)ch; i<=122;i++){
           System.out.print((char)i +" ");
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char: ");
        char ch=sc.next().charAt(0);
        charcterIncrement(ch);
    }
}
