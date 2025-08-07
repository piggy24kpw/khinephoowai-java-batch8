package Day8Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int max = 0;
        int min = 0;


        ArrayList<String> myList = new ArrayList<>();
        ArrayList<Integer> myInt = new ArrayList<>();

        System.out.println("Enter values you want to add list:");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();

        String[] stringList = myString.split(" ");


        for (String s : stringList) {
            myList.add(s);

            try {
                Integer num = Integer.valueOf(s);
                myInt.add(num);
                min = myInt.get(0);

                sum += num;
                if(num > max){
                    max = num;
                }

                if(num < min){
                    min = num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format ");
            }
        }
        int avg = sum / myList.size();

        System.out.println("The sum of integers " + sum);
        System.out.println("The average of integers " + avg);
        System.out.println("The maxium number is " + max);
        System.out.println("The minimun number is " + min);

        input.close();


    }
}
