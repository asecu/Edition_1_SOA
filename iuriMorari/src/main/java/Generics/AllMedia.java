package Generics;

public abstract class AllMedia {
    private String name;
    private String category;
    private Double cost;

    public AllMedia(String name, String category, Double cost) {
        this.name = name;
        this.category = category;
        if (cost >= 0)
            this.cost = cost;
        else System.out.println("Negative cost of ittem. It need to be positive or 0");
    }

    @Override
    public String toString() {
        return "AllMedia{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public Double getCost() {
        if (cost >= 0)
            this.cost = cost;
        else System.out.println("Negative cost of ittem. It need to be positive or 0");
        return cost;
    }

    public void setCost(Double cost) {
        if (cost >= 0)
            this.cost = cost;
        else System.out.println("Negative cost of ittem. It need to be positive or 0");
    }
}
