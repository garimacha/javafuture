package garimacha.javafuture;



public class ReverseString{

public static void main() {
    String original = new String("Hello World");

    //String str[] = original.
    String str[]=original.split("''");

    for(int i=str.length-1;i>=0;i--)
    {
        System.out.println(str[i]);
    }
    System.out.println();

}
}
