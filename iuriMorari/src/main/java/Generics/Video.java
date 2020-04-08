package Generics;

public class Video extends AllMedia {
    private String kindOfMovie;
    private String storageCarrier;
    private int duration;

    public Video(String name, String category, Double cost, String kindOfMovie, String storageCarrier, int duration) {
        super(name, category, cost);
        this.kindOfMovie = kindOfMovie;
        this.storageCarrier = storageCarrier;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "kindOfMovie='" + kindOfMovie + '\'' +
                ", storageCarrier='" + storageCarrier + '\'' +
                ", duration=" + duration +
                '}';
    }
}
