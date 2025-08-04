package Day5Homework;

class Counter {
    static int count;

    public Counter() {
        count++;
    }

    public static void printCount() {
        System.out.println("The count of object = " + count);
    }
}



public class CounterCount_5_2 {
    public static void main(String[] args) {
        Counter myCounter1 = new Counter();
        Counter myCounter2 = new Counter();

        Counter.printCount();
    }
}
