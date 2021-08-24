/*
-pre01 Instructions & Notes/comments:
-Open your editor;
-create a file named Hello.java.
-In that file, write and save this program;
-to compile Hello.java into Java Byte Code that can be run by the
Java Virtual Machine, type javac Hello.java.
-Hello.class  the compiled Java Byte Code that can be run.
*/

import java.io.*;
import java.util.*;

/*
-a class is a collection of methods
-this program defines a class named Hello
-convention:  start with a captital letter
-name of class has to match name of file it is in
-{} groups things together
-outermost {} contain the class definition
-inner {} contain method definition
*/
public class Hello {
  /*
  -method is a names sequence of statements
  -this program defines one method named main
  */
  public static void main(String[] args){
    /*
    -Example of a statement (line of code that performs a
    basic operation).  The print statement displays a message when program runs
    -System has to begin with uppercases
    -phrases in quotesa re strings b/c they contain characters strung together
    -System.out.println moves a newline to the beginning of the next line
    */
    System.out.println("Hello world!");
  }
}
