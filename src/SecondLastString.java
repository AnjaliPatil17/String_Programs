package String_Program;

import java.util.Scanner;

public class SecondLastString {
    public static void SecondLastString(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num=sc.nextInt();
        System.out.println("Enter the string: ");
        String [] name=new String[num];

        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }

        System.out.println("Second last string is: "+ (name[num-2]));
    }
    public static void main(String[] args) {
      SecondLastString();
    }
}
