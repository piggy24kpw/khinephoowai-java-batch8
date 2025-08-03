import java.util.Scanner;

public class ReverseString_3_1 {
    public static String ExchangeString(String word){
        String reversed="";
        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Text");
        String text = input.nextLine();
        System.out.println(ExchangeString(text));

        input.close();

    }
}
