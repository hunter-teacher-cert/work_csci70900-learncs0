
//Write a program named Arrays.java and in it solve exercises 1, 4 and 5 from
//chapter 8 in Think Java

//Consult:
//https://www.geeksforgeeks.org/arrays-in-java/
//https://www.w3schools.com/java/java_methods.asp
//https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array
//https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/



//Ex 1
//Consult:  https://stackoverflow.com/questions/43832451/creating-an-array-method-java
/*
import java.io.*;
import java.util.*;

class Arrays {
public static double[] powArray (double a[]){
    for (int i = 0; i < a.length; i++) {
         a[i] = Math.pow(a[i], 2.0);
    }
    return a;
}

public static void main(String[] args) {
    double[] sqa = powArray(new double[]{1, 2, 3, 4});
    System.out.println("sqa[0] " + sqa[0]);
    System.out.println("sqa[1] " + sqa[1] );
    System.out.println("sqa[2] " + sqa[2] );
    System.out.println("sqa[3] " + sqa[3] );

}
}
/*
output ex 1
sqa[0] 1.0
sqa[1] 4.0
sqa[2] 9.0
sqa[3] 16.0
*/


//Ex 4
//Consult
//https://chortle.ccsu.edu/java5/Notes/chap47/ch47_14.html
//https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit6-Arrays/topic-6-3-arrays-with-foreach.html
//https://stackoverflow.com/questions/21692659/java-arrays-returning-highest-array-index
//https://github.com/AllenDowney/thinkjavasolutions5/blob/master/chap10/Exercise10.java
//https://github.com/ApolloZhu/Think-Java-Exercises/blob/master/Chapter8/8.4.java
/*
import java.io.*;
import java.util.*;

class Arrays {

  public static int indexOfMax(int[] intarr){
        int index = 0;
        for (int i=1; i<intarr.length; i++){
           if (intarr[i] > intarr[index]){
              index = i;
           }
        }
        return index;
     }

public static void main(String[] args) {
  int[] arrayA = {0, 1, 2, 3, 4, 5};
  System.out.println(indexOfMax(arrayA));

}
}
*/
/*
output 5
*/

//Ex 5
//
//The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all
//prime numbers up to any given limit,” which you can read about
//at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns
//a boolean array that indicates, for each number from 0 to n - 1,
//whether the number is prime.
//Consult
//https://www.youtube.com/watch?v=n6Jk1yGsml8
//https://www.youtube.com/watch?v=Hk9n0cWE2OI
//https://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html
//https://www.geeksforgeeks.org/sieve-of-eratosthenes/
//https://www.mathsisfun.com/definitions/prime-number.html
//https://mkyong.com/java/how-to-determine-a-prime-number-in-java/
//Prime number A whole number greater than 1 that
//can not be made by multiplying other whole numbers.
//Example: 5 is a prime number. We cannot multiply 2, 3 or 4 together to make 5
//When the only two factors of a number are 1 and the number,
//then it is a Prime Number

//find multiples of 2 mark as prime; then do same for 3 and so on
//python code for primes https://www.youtube.com/watch?v=JA_YrFwE1hc
//Java walk through: Sieve of Eratosthenes https://www.youtube.com/watch?v=n6Jk1yGsml8

import java.io.*;
import java.util.*;
import java.util.Scanner;



class Arrays {
public static boolean sieve (int n){
  //make an array of n variables each being true or false
  boolean[] isPrime = new boolean[n];
  //set all values to true-prime
  for (int i=1; i<n; i++){
    isPrime[i] = true;
  }//for
  //check numbers
  for (int j=2; j<=n; j++){

    //i is prime if not removed
    if (isPrime[j-1]){
      System.out.println(j);
      //remove multiples
      for (int k = 2*i; k<=n; k++){
        isPrime[k-1]=false;
      }
    }
  }
}//boolean
public static void main(String[] args){
  //user input
  int n;
  Scanner in = new Scanner(System.in);
  System.out.println("Find the prime numbers of:  ");
  n = in.nextInt();

}
  }

/*error
Arrays.java:125: error: cannot find symbol
      for (int k = 2*i; k<=n; k++){
                     ^
  symbol:   variable i
  location: class Arrays
1 error
*/


/*
//get prime numbers 1-100 https://www.youtube.com/watch?v=TOxq8rDrYbg

import java.io.*;
import java.util.*;
//import java.util.Scanner;

class Arrays {
public static void main (String[] args){
  //numbers to check if prime;
  for (int i=2; i<=100;  i++){
    //test-can number be divided by itself; if it can be divided
    //by another number other than itself it's not prime
    for (int j=2; j<=i;j++){
      if(j==i){ //if i=j number is prime so print
        System.out.println("j=i so it's a prime number " +i);
      } //check if there's a remainder
      if(i%j==0){ // 7/2 =3r1; 6/2=2r0
        break;
      }
    }
  }

}
}
*/


//personal practice -------

/* ex 5
Scanner in = new Scanner(System.in);
System.out.println("Find the prime numbers of:  ");
n = sc.next.Int();


public static void sieve (int n){
  boolean prime[] = new boolean[n];
  prime = false
*/
//Exercise 4
//Write a method called indexOfMax that
//takes an array of integers and returns the index of the largest element.
//Can you write this method using an enhanced for loop? Why or why not?
//https://www.mathsisfun.com/numbers/fundamental-theorem-arithmetic.html

/*
public static int indexOfMax(int[] a, double tar) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == target) {
            return i;
        }
    }
    return -1;
}

public static void main(String[] args) {

}








//Exercise 1   Practice encapsulation Starting with the code
//in Section 8.6, write a method called powArray that takes
//a double array, a, and returns a new array that contains
//the elements of a squared. Generalize it to take a
//second argument and raise the elements of a to the given power.


//8.6 Array traversal
/*import java.io.*;
import java.util.*;
//import java.util.Arrays;

class Arrays
{
  public static void main (String[] args){
    //double[] a = new double[]; //declare & create double type array a; cells init to 0

    //declare, construct, and initialize the array all in one statement:
    double[] a = {1, 2, 3, 4};
    double[] asq = new double[4]; //declare & create double type array asq; cells init to 0

    //for (int i = 0; i < 4; i++) { //only works if the array has 4 elements
    //The last time this loop gets executed, i is a.length - 1, which is the index of the last element. When i is equal to a.length, the condition fails and the body is not executed –
    for (int i = 0; i < a.length; i++) { // generalize the code to work with arrays of any size; replacing the magic number 4 with a.length

      asq[i] = a[i]; //copy elements of array a into array asq
      asq[i] = Math.pow(a[i], 2.0);

        }//for
      System.out.println("vala [0] has " + a[0]);
      System.out.println("vala [1] has " + a[1]);
      System.out.println("vala [2] has " + a[2]);
      System.out.println("vala [3] has " + a[3]);

      System.out.println("valasq [0] has " + asq[0]);
      System.out.println("valasq [1] has " + asq[1]);
      System.out.println("valasq [2] has " + asq[2]);
      System.out.println("valasq [3] has " + asq[3]);

      //System.out.println("valasq [0] has " + asq[0]);

      //asq[i] = a[i*2]; alternate square
    //asq[i] = Math.pow (a[i], 2.0);
    //System.out.println("valasq [0] has " + asq[0]);
    //System.out.println("valasq [1] has " + asq[1]);
    //System.out.println("valasq [2] has " + asq[2]);
    //System.out.println("valasq [3] has " + asq[3]);

    //System.out.println(Arrays.toString(asq)); //not working
/*
Arrays.java:32: error: method toString in class Object cannot be applied to given types;
    System.out.println(Arrays.toString(asq)); //not working
                             ^
  required: no arguments
  found:    double[]
  reason: actual and formal argument lists differ in length
1 error
*/




//} //main

//} //class

/*Output
vala [0] has 1.0
vala [1] has 2.0
vala [2] has 3.0
vala [3] has 4.0
valasq [0] has 1.0
valasq [1] has 4.0
valasq [2] has 9.0
valasq [3] has 16.0
*/


/*
}
for (int i = 0; i < a.length; i++) {
    a[i] = Math.pow(a[i], 2.0);
}
*/
//Looping through the elements of an array is called a traversal.
//the following method takes an int array and an integer value,
//and it returns the index where the value appears:

/*public static int search(double[] a, double target) {
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

/*import java.io.*;
import java.util.*;

public class Arrays{
  public static void main ( String[] args ){
    int[] a = {1, 2, 3, 4};
    printArray(a); //output {1, 2, 3, 4}

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
      /*int i = 0;
      while (i < 4) {
    System.out.println(counts[i]);
    i++;*/
    //output of above 7
    //14
    //1
    //-60
    //can be written with for loop
    /*for (int i = 0; i < 4; i++) {
    System.out.println(counts[i]);*/
    /*output of above
    7
    14
    1
    -60*/
//} //main

//display the elements of the array,
/*
public static void printArray(int[] a) {
  System.out.print("{" + a[0]);
  for (int i = 1; i < a.length; i++) {
      System.out.print(", " + a[i]);
  }
  System.out.println("}");*/
  /*output of above {1, 2, 3, 4}*/

//}//print array


//} //class


/*
Kjell text
*/
/*
import java.io.*;
import java.util.*;
//import java.util.Arrays;

import java.util.Scanner ;

class Arrays {

  public static void main ( String[] args )
  {

    int[] array = new int[5];
    int   data;

    Scanner scan = new Scanner( System.in );

    // input the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "enter an integer: " );
      data = scan.nextInt();
      array[ index ] = data ;
    }

    // write out the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }

  }
}*/
/*
outputenter an integer:
1
enter an integer:
0
enter an integer:
-1
enter an integer:
-0
enter an integer:
3
array[ 0 ] = 1
array[ 1 ] = 0
array[ 2 ] = -1
array[ 3 ] = 0
*/


/*
import java.io.*;
import java.util.*;

class Arrays {

public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = i + 1;
    }
    return a;
}
public static void dub(int[] jub) {
    for (int i = 0; i < jub.length; i++) {
        jub[i] *= 2;
    }
}
public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
        fus += zoo[i];
    }
    return fus;
}
public static void main(String[] args) {
    int[] bob = make(5);
    dub(bob);
    System.out.println(mus(bob));
}
}

*/
