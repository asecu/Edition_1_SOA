package genericstask.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsLibrary<T extends Media & Comparable<T>> {
  private List<T> genericMediaList = new ArrayList<>();

  public List<T> getGenericMediaList() {
    return genericMediaList;
  }

  @Override
  public String toString() {
    return "GenericsLibrary{" + "genericMediaList=" + genericMediaList + '}';
  }

  public void addMedia(T t) {
    genericMediaList.add(t);
  }

  public void sortByTitle() {
    Collections.sort(genericMediaList);
  }

  public void removeMedia(T t) {
    genericMediaList.remove(t);
  }

  public void removeByTitle(String st) {
    for (int i = 0; i < genericMediaList.size(); i++) {
      T t1 = genericMediaList.get(i);
      if (st.equals(t1.getTitle())) {
        removeMedia(t1);
      }
    }
  }

  public int getSize() {
    return genericMediaList.size();
  }

  public String printElementsUpperCase() {
    for (T t1 : genericMediaList) {
      System.out.println(t1);
    }
    return genericMediaList.toString().toUpperCase();
  }

}
