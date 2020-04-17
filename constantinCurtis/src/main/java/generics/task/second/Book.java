package generics.task.second;

public class Book extends Media {
    private int pages;
    private String author;

    public Book(String title, double price, int year, int pages, String author) {
        super(title, price, year);
        if (pages > 0) {
            this.pages = pages;
        } else System.out.println("Invalid quantity of pages set");
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

