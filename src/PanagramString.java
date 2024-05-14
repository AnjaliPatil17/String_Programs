package String_Program;
import java.util.Scanner;

public class PanagramString {
    public static boolean isPanagram(String str){

        if(str.length()<26){
            return false;
        }
        else{
            for(char ch = 'a';ch<= 'z';ch++){

                if(str.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine().toLowerCase();
        if (isPanagram(str) == true)
            System.out.print( "is a pangram.");
        else
            System.out.print("is not a pangram.");

        sc.close();
    }
}
