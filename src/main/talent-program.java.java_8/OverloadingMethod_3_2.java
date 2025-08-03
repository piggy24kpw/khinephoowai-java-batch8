import java.util.Scanner;

public class OverloadingMethod_3_2 {
    static void greet(){
        System.out.println("Hello");
    }
    static void greet(String name){
        System.out.println("Hello"+name+"!");
    }

    public static void main(String[] args) {
        greet();

        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        greet(name);
        input.close();
    }
}
