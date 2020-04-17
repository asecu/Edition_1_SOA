package generics.task.second;

public abstract class Media {
    private String title;
    private double price;
    private int year;

    public Media(String title, double price, int year) {
        this.title = title;
        if (price > 0)
            this.price = price;
        else System.out.println("Price can't be negative. Please introduce correct price");
        this.year = year;
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        if (price > 0)
            this.price = price;
        else System.out.println("Price can't be negative. Please introduce correct price");
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else System.out.println("Price can't be negative. Please introduce correct price");

    }
}
