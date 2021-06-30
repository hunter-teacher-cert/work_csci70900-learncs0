import java.io.*;
import java.util.*;
public class Date {
  public static void main(String[] args){

    //declares variables named day, date, month, and year
    //with type integer and string
    String day;
    String month;
    int date, year;

    //assign values to represent today's date with assignment statement
    //= means assignment not equality
    day = "Monday";
    month = "June ";
    date = 14;
    year = 2021;

//Display the value of each variable on a line by itself
System.out.println("Today is: ");
System.out.println(day);
System.out.println(month);
System.out.println(date);
System.out.println(year);


//Modify the program so that it displays the date in standard American format
    System.out.print("American Format: ");
    System.out.print(day);
    System.out.print(",");
    System.out.print(" ");
    System.out.print(month);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(" ");
    System.out.print(year);
    System.out.println(".");

  //Modify the program so that it displays the date in European format
        System.out.print("European Format: ");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(year);
        System.out.println(".");

  }
}
