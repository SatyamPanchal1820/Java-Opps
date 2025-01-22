class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(int price) {
        this.price = price;
    }
}

public class Books {
    public static void main(String[] args) {

        Book book = new Book("Admire me", "Swam", 20);
        System.out.println("The Title of book is " + book.getTitle() + " , Name of Author is " + book.getAuthor()
                + " and price is " + book.getPrice());
    }

}