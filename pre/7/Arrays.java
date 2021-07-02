//Write a program named Arrays.java and in it solve exercises 1, 4 and 5 from
//chapter 8 in Think Java

//Exercise 1   Practice encapsulation Starting with the code
//in Section 8.6, write a method called powArray that takes
//a double array, a, and returns a new array that contains
//the elements of a squared. Generalize it to take a
//second argument and raise the elements of a to the given power.


//indep practice section 8.2
/*
import java.io.*;
import java.util.*;

public class Arrays{
public static double powArray(double [] a) {
//count refer to an array of four integers
//values refer to an array of double, where
//the number of elements in values depends on the value of size
  //counts = new int[4];
  //values = new double[size];

//can also declare the variable and create the array
//in a single line of code:
int[] counts = new int[4];
double[] values = new double[size];
System.out.println("The zeroth element is  " +counts[0]);
counts[0] = 7;
counts[1] = counts[0] * 2;
counts[2]++;
counts[3] -= 60;
  }
}
//error with size
*/


//Kjell practice
//In the following, the array object is constructed and each cell is initialized
//to 0. Then some assignment statements explicitly change some cells:

class Arrays
{
  public static void main ( String[] args )
  {
    int[] stuff = new int[5];

    stuff[0] = 23;
    stuff[1] = 38;
    stuff[2] = 7*2;

    System.out.println("stuff[0] has " + stuff[0] );
    System.out.println("stuff[1] has " + stuff[1] );
    System.out.println("stuff[2] has " + stuff[2] );
    System.out.println("stuff[3] has " + stuff[3] );
    System.out.println("stuff[4] has " + stuff[4] );
  }
}
/*
Output
stuff[0] has 23
stuff[1] has 38
stuff[2] has 14
stuff[3] has 0
stuff[4] has 0
*/
