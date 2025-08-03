class Book{
    String title,author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void discount(double discountPercent) {
        this.price -= price * (discountPercent / 100.00);
        System.out.println("The book "+ title + "is price "+ price + " with " + discountPercent);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class BookStore_4_6 {
    public static void main(String[] args) {
        Book[] bookList = new Book[3];
        bookList[0] = new Book("Beloved","Toni Morrison", 1987);
        bookList[1] = new Book("One Hundred Years ", "Gabriel", 2020);
        bookList[2] = new Book("he Catcher in the Rye", "J.D. Salinge", 2021);


        for( Book b : bookList) {
            b.discount(10);
        }
    }
}
