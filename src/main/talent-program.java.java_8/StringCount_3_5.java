import java.util.Scanner;

public class StringCount_3_5 {
    public static int  countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Enter Text");
        String txt = text.nextLine();
        int i = countVowels(txt);
        System.out.println("The number of vowel is"+i);

        text.close();
    }
}
