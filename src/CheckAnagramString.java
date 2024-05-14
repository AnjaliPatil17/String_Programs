package String_Program;
import java.util.*;

public class CheckAnagramString {
    public static void checkAnagram(String str1,String str2){
        // Convert strings to character arrays
        char[] char_array1 = str1.toCharArray();
        char[] char_array2 = str2.toCharArray();

        Arrays.sort(char_array1);
        Arrays.sort(char_array2);

        // Check if the sorted arrays are equal
        if (Arrays.equals(char_array1, char_array2)) {
            System.out.println("Anagram string");
        } else {
            System.out.println("Not an anagram string");
        }
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1=sc.next();
        System.out.print("Enter second string: ");
        String str2=sc.next();
        checkAnagram(str1,str2);

    }
}

