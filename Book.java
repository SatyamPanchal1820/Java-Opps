public class Book {
   
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "no-title";
        this.author = "no-author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public static void main(String[] args) {
   
        Book book1 = new Book();
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());

        book1.setAuthor("New Author");
        System.out.println("Updated Author for Book 1: " + book1.getAuthor());

        Book book2 = new Book("Title", "Author", 123);
        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: " + book2.getPrice());
        System.out.println("Title of Book 2: " + book2.getTitle());
        book2.setPrice(456);
        System.out.println("Updated Price for Book 2: " + book2.getPrice());
    }
}
