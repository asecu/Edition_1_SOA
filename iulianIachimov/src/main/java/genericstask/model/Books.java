package genericstask.model;

import java.util.Objects;

public class Books extends Media implements Comparable<Books> {
  private String author;

  public Books(String title, String author) {
    super(title);
    this.author = author;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Books{" + "author='" + author + '\'' + getTitle() + '}';
  }

  @Override
  public boolean equals(Object o) {
    return this.author.equalsIgnoreCase(((Books) o).getAuthor());
  }

  @Override
  public int hashCode() {
    return Objects.hash(author);
  }

  @Override
  public int compareTo(Books o) {
    return this.getTitle().compareTo(o.getTitle());
  }
}
