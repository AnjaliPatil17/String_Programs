package String_Program;

public class EvenLengthOfString {
    public static void main(String[] args) {
     String word[]={"apple","kivi","Grapes","chery"};
        System.out.println("Even length of String are: ");
         for(int i=0;i < word.length;i++){
             if(word[i].length()%2==0){
                 System.out.print(word[i] +" ");
             }
         }

    }
}
