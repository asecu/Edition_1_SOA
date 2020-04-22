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

  public void setSource(String source) throws AssertionError {
    if (source != null) {
      this.source = source;
    } else {
      throw new AssertionError("The source cannot be null");
    }
  }

  {
  }

  @Override
  public String toString() {
    return "Video{" + "source='" + source + '\'' + getTitle() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return this.source.equalsIgnoreCase(((Video) o).getSource());
  }

  @Override
  public int compareTo(Video o) {
    return getTitle().compareTo(o.getTitle());
  }
}
