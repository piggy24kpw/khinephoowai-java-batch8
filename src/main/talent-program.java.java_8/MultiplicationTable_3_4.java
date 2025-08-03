import java.util.Scanner;

public class MultiplicationTable_3_4 {
    public static int printTable(int number, int row){
        int result =0;
        for (int i=1; i<=row; i++){
            result = number*i;
            System.out.println((number+"*" + i) + "=" + result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int num = input.nextInt();

        System.out.println("Enter many you want to execute");
        int line = input.nextInt();

        printTable(num,line);
        input.close();

    }
}
