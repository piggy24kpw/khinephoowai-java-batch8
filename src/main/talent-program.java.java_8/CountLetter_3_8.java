import java.util.Scanner;

public class CountLetter_3_8 {
    public static int LetterInput(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String txt = text.nextLine();
        int result = LetterInput(txt);
        System.out.println("The number of character is"+result);

        text.close();
    }
}
