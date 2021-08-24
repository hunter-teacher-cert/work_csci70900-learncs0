//Write a program that converts a temperature from Celsius to Fahrenheit.//


import java.io.*;
import java.util.*;
import java.util.Scanner; //import Scanner

public class Temperature {
  public static void main(String[] args){

//set up vars
double cels;
double fahr;

//prompt the user for input,
Scanner in = new Scanner(System.in);
System.out.print("What is the temp in celsius? ");

//calculate the result

cels = in.nextDouble();
fahr = cels *  9/5 + 32;
System.out.print(cels + " C = ");
System.out.println(fahr +  " F");


    //practice with code in book
  /*  String line;
    Scanner in = new Scanner(System.in);

    System.out.print("Type something: ");
    line = in.nextLine();
    System.out.println("You said: " + line);

    System.out.print("Type something else:  ");
    line = in.nextLine();
    System.out.println("You also said: " + line);*/

  }
}
