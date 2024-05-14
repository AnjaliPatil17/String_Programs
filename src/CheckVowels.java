package String_Program;

import java.util.Scanner;

public class CheckVowels {
    public static void checkString(String word){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)== 'a'|| word.charAt(i)=='i'|| word.charAt(i)=='e'|| word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.println("Vowels are present : "+word.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine().toLowerCase();
        checkString(word);
        sc.close();
    }
}
