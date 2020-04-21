package Generics;

public class Newspaper extends AllMedia {
    private String kindOfPaper;
    private String author;
    private int numberOfCopies;

    public Newspaper(String name, String category, Double cost, String kindOfPaper, String author, int numberOfCopies) {
        super(name, category, cost);
        this.kindOfPaper = kindOfPaper;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "kindOfPaper='" + kindOfPaper + '\'' +
                ", author='" + author + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                '}';
    }
}
