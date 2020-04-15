package generics.task.second;

public class Newspaper extends Media {
    private String quality;
    private int numbOfPages;
    private String language;

    public Newspaper(String title, double price, int year, String quality, int numbOfPages, String language) {
        super(title, price, year);
        this.quality = quality;
        this.numbOfPages = numbOfPages;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "quality='" + quality + '\'' +
                ", numbOfPages=" + numbOfPages +
                ", language='" + language + '\'' +
                '}';
    }
}
