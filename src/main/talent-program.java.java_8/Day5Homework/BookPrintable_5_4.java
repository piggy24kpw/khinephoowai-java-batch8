package Day5Homework;

interface printable{
    void print();
}

class Book implements printable {
    public void print() {
        System.out.println("The book has been printed.");
    }
}

class Magazine implements printable{
    @Override
    public void print() {
        System.out.println("The magazine is printing...");
    }
}



public class BookPrintable_5_4 {
    public static void main(String[] args) {
        printable myBook = new Book();
        printable myMagazine = new Magazine();

        myBook.print();
        myMagazine.print();
    }
}
