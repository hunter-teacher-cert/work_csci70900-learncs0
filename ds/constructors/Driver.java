import java.io.*;
import java.util.*;

public class Driver{


public static void main(String[] args) {
  //to use books need to create object in java
  Books b = new Books("A second Book by Michele", 1000); //book object called b;  constructor has parentheses
  b.openBook(); //a method in book class
  b.closeBook();
  //can pass these in as parameters to constructor
  //b.setTitle("Stories by Michele");
  //b.setPages(100);

  System.out.println(b.title);
  System.out.println("Number of pages in book: " + b.pages);

}
}
