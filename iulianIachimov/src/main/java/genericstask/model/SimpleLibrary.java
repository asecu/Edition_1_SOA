package genericstask.model;

import java.util.Collections;
import java.util.List;

public class SimpleLibrary {
  private List<Books> bookList;
  private List<Video> videoList;
  private List<Newspapers> newspaperList;

  public List<Books> getBookList() {
    return bookList;
  }

  public void setBookList(List<Books> bookList) {
    this.bookList = bookList;
  }

  public List<Video> getVideoList() {
    return videoList;
  }

  public void setVideoList(List<Video> videoList) {
    this.videoList = videoList;
  }

  public List<Newspapers> getNewspaperList() {
    return newspaperList;
  }

  public void setNewspaperList(List<Newspapers> newspaperList) {
    this.newspaperList = newspaperList;
  }

  public Books addBook(String title, String author) {
    return new Books(title, author);
  }

  public Video addVideo(String name, String source) {
    return new Video(name, source);
  }

  public Newspapers addNewspaper(String titleName, String language) {
    return new Newspapers(titleName, language);
  }

  public void printBook(List<Books> bookList) {
    for (Books book : bookList) {
        System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
    System.out.print("\n");
  }

  public void printVideos(List<Video> videoList) {
    for (Video video : videoList) {
        System.out.println(video.getTitle() + " from " + video.getSource());
    }
    System.out.print("\n");
  }

    public void printNewsPaper(List<Newspapers> newspaperList) {
      for (Newspapers newsPaper : newspaperList) {
        System.out.println(newsPaper.getTitle() + " in " + newsPaper.getLanguage());
      }
      System.out.print("\n");
    }

  public void sortBookByTitle() {
    Collections.sort(bookList);
  }

  public void sortBookByTitleNew(List<Books> booklistnew) {
    Collections.sort(booklistnew);
  }

  public void printVideoTitleLowerCase() {
    for (Video t1 : videoList) {
      System.out.println(t1.getTitle().toLowerCase());
    }
  }

  public String removeNewspaperByIndex(int index) {
    return String.valueOf(newspaperList.remove(index));
  }
}
