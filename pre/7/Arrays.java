
//Write a program named Arrays.java and in it solve exercises 1, 4 and 5 from
//chapter 8 in Think Java

//Consult:
//https://www.geeksforgeeks.org/arrays-in-java/

//Exercise 1   Practice encapsulation Starting with the code
//in Section 8.6, write a method called powArray that takes
//a double array, a, and returns a new array that contains
//the elements of a squared. Generalize it to take a
//second argument and raise the elements of a to the given power.


//8.6 Array traversal
/*
class Arrays
{
  public static void main (String[] args){
    //double[] a = new double[]; //declare & create double type array a; cells init to 0

    //declare, construct, and initialize the array all in one statement:
    double[] a = {1, 2, 3, 4};
    double[] asq = new double[]; //declare & create double type array asq; cells init to 0




  }


}
for (int i = 0; i < a.length; i++) {
    a[i] = Math.pow(a[i], 2.0);
}

//Looping through the elements of an array is called a traversal.
//the following method takes an int array and an integer value,
//and it returns the index where the value appears:

public static int search(double[] a, double target) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == target) {
            return i;
        }
    }
    return -1;
}


class Arrays
{
  public static void main ( String[] args )
  {
    int[] valA = { 12, 23, 45, 56 };

    int[] valB = new int[4];

    valB[ 0 ]  = valA[ 0 ] ;
    valB[ 1 ]  = valA[ 1 ] ;
    valB[ 2 ]  = valA[ 2 ] ;
    valB[ 3 ]  = valA[ 3 ] ;

    System.out.println("valA [0] has " + valA[0]);
    System.out.println("valA [1] has " + valA[1]);
    System.out.println("valA [2] has " + valA[2]);
    System.out.println("valA [3] has " + valA[3]);

    System.out.println("valB [0] has " + valB[0]);
    System.out.println("valB [1] has " + valB[1]);
    System.out.println("valB [2] has " + valB[2]);
    System.out.println("valB [3] has " + valB[3]);

   }
}







public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}









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






//Kjell practice


//copying values between Arrays
/*
class Arrays
{
  public static void main ( String[] args )
  {
    int[] valA = { 12, 23, 45, 56 };

    int[] valB = new int[4];

    valB[ 0 ]  = valA[ 0 ] ;
    valB[ 1 ]  = valA[ 1 ] ;
    valB[ 2 ]  = valA[ 2 ] ;
    valB[ 3 ]  = valA[ 3 ] ;

    System.out.println("valA [0] has " + valA[0]);
    System.out.println("valA [1] has " + valA[1]);
    System.out.println("valA [2] has " + valA[2]);
    System.out.println("valA [3] has " + valA[3]);

    System.out.println("valB [0] has " + valB[0]);
    System.out.println("valB [1] has " + valB[1]);
    System.out.println("valB [2] has " + valB[2]);
    System.out.println("valB [3] has " + valB[3]);

   }
}
*/
/*
Output
valA [0] has 12
valA [1] has 23
valA [2] has 45
valA [3] has 56
valB [0] has 12
valB [1] has 23
valB [2] has 45
valB [3] has 56
*/

//Using an expression for an array index
//organizing the data into arrays
//processing that data using variables as indexes

//more complicated example
/*
class Arrays
{
  public static void main ( String[] args )
  {
    double[] val = new double[4];

    val[0] =  1.5;
    val[1] = 10.0;
    val[2] = 15.5;

    int j  = 3;

    // same as val[3] = val[2] + val[1]
    //val [3] = val [3-1=2] + val [3-2]
    //val [3] = 15.5+10 == 25.5
    val[j] = val[j-1] + val[j-2];


    System.out.println( "val[" + j + "] == " + val[j] );

   }
}*/
//output val[3] == 25.5


//simple example
/*
class Arrays
{
  public static void main ( String[] args )
  {
    double[] val = new double[4];  // an array of double
                                   // cells initialized to 0.0
    val[0] = 0.12;
    val[1] = 1.43;
    val[2] = 2.98;

    int j = 3;
    System.out.println( "cell 3: " + val[ j   ] ); //index 3 initialized to 0
    System.out.println( "cell 2: " + val[ j-1 ] ); //3-2 index 2 =2.98

    j = j-2;
    System.out.println( "cell 1: " + val[ j   ] );//j=3-2=1 index 1 = 1.43
   }
}
/*
Output
cell 3: 0.0
cell 2: 2.98
cell 1: 1.43
*/

//In the following, the array object is constructed and each cell is initialized
//to 0. Then some assignment statements explicitly change some cells:
/*
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


//-----------------------
//indep practice section 8.2

import java.io.*;
import java.util.*;

public class Arrays{
  public static void main ( String[] args ){
    int[] counts = new int[4];
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;
    //System.out.println("The zeroth element is " + counts[0]);
    //Output of line above The zeroth element is 7

    //You can use any expression as an index,
    //as long as it has type int.
    //One of the most common ways to index an array is with a loop variable. For example:
    //This while loop counts from 0 up to 4.
    //When i is 4, the condition fails and the loop terminates.
    //So the body of the loop is only executed when i is 0, 1, 2, and 3.
    //Each time through the loop we use i as an index
    //into the array, displaying the ith element.
      int i = 0;
      while (i < 4) {
    System.out.println(counts[i]);
    i++;

    //output of above 7
    //14
    //1
    //-60

}

  }

}
