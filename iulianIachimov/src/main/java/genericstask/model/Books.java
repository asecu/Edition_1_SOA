package genericstask.model;

public class Books extends Media implements Comparable<Books> {
    private String author;

    public Books(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' + getTitle() +
                '}';
    }

    @Override
    public int compareTo(Books o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
