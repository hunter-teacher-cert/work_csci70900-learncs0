
import java.io.*;
import java.util.*;

//constructors are like methods that make new objects
public class Books {

  //properties of books
  public static String title;
  public static int pages;

  //treat constructor like method - default
  Books(){
  }
  Books (String title, int pages) {
    this.title = title;
    this.pages = pages;
  }
  //methods -
  public static void openBook(){
    System.out.println("Open the book to table of contents: ");
  }

  public static void closeBook(){
    System.out.println("Done reading book");
  }

  public static void setTitle(String newTitle){
    title = newTitle;
  }
  public static void setPages(int newPages){
    pages = newPages;

  }

}
