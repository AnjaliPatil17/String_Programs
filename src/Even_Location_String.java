package String_Program;

public class Even_Location_String {
    public static void main(String[] args) {
        String array[]={"aka","wish","pika","ash","dora"};
        System.out.println("String at even location");
        for(int i= 0;i <= array.length;i++){
            if (i% 2==0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
