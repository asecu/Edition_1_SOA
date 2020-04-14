package genericstask.model;

public class Video extends Media implements Comparable<Video> {
    private String source;

    public Video(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Video{" +
                "source='" + source + '\'' + getTitle() +
                '}';
    }

    @Override
    public int compareTo(Video o) {
        return getTitle().compareTo(o.getTitle());
    }
}
