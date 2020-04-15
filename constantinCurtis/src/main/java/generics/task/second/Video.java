package generics.task.second;

public class Video extends Media {
    private String format;
    private double duration;
    private String directedBy;

    public Video(String title, double price, int year, String format, double duration, String directedBy) {
        super(title, price, year);
        this.format = format;
        if (duration > 0)
            this.duration = duration;
        else System.out.println("Invalid time duration set");
        this.directedBy = directedBy;
    }

    @Override
    public String toString() {
        return "Video{" +
                "format='" + format + '\'' +
                ", duration=" + duration +
                ", directedBy='" + directedBy + '\'' +
                '}';
    }

    public void setDuration(double duration) {
        if (duration > 0) {
            this.duration = duration;
        } else System.out.println("Invalid time duration set");

    }
}
