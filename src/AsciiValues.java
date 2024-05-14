package String_Program;

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input=sc.nextLine();
        char ch=input.charAt(0);
        System.out.println("ASCII value of "+ ch + " is "+(int)ch);
        sc.close();
    }
}
