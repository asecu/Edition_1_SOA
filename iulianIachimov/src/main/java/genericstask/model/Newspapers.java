package genericstask.model;

public class Newspapers extends Media implements Comparable<Newspapers> {
    private String language;

    public Newspapers(String title, String language) {
        super(title);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Newspapers{" +
                "language='" + language + '\'' + getTitle() +
                '}';
    }

    @Override
    public int compareTo(Newspapers o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
