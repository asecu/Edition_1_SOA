package Generics;

public class Books extends AllMedia {
    private String ageName;
    private int pagesNumber;
    private Boolean pictures;

    public Books(String name, String category, Double cost, String ageName, int pagesNumber, Boolean pictures) {
        super(name, category, cost);
        this.ageName = ageName;
        this.pagesNumber = pagesNumber;
        this.pictures = pictures;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ageName='" + ageName + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", pictures=" + pictures +
                '}';
    }
}
