//pre06 Exercises 3, 4, 5 Chapter 7 Loops

//Chapter 7-Ex 3 Write an iterative method to perform
//the same calculation: power,which takes a double x and an integer n
//and returns x^n (x power n).
//A recursive definition of this operation is x^n = x · x^n−1.
//Also, remember that anything raised to the zeroth power is 1.

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Loops{
public static double power(double x, int n) {

//anything raised to the zeroth power is 1
    if (n == 0)
    return 1;

    //x raised to 1 is x
    if (n == 1)
    return x;

  double result = 1; //initalize variable

  //while (n>1){
    //multiply x n times
    for (int i = 0; i < n; i++){
    result = result * x;
  }
  return result;
}

//test code
public static void main(String[] args){
double x = 3;
int n = 3;
System.out.println("result(" + x + "^" + n +") = " + power(x, n));
}
}*/
//Output result(3.0^3) = 27.0


//Exercise 4
//Section 6.7 presents a recursive method that computes the
//factorial function. Write an iterative version of factorial.


public class Loops{
public static int factorial(int n) {
  if (n == 0) {
        return 1;
      }
      int i;
      int result = 1; //initalize
      for (i = 1; i <= n; i++){
        result = result * i; //don't understand this
      }
      return result;
      }


public static void main (String[] args) {
  int n = 5;
  System.out.println(factorial(5));
}

}

//output = 120

/*

Exercise 5
One way to calculate ex is to use the infinite series expansion:

ex = 1 + x + x2 / 2! + x3 / 3! + x4 / 4! + …
The ith term in the series is xi / i!.

Write a method called myexp that takes x and n as parameters and estimates ex by adding the first n terms of this series. You can use the factorial method from Section 6.7 or your iterative version from the previous exercise.

You can make this method more efficient if you realize that the numerator of each term is the same as its predecessor multiplied by x, and the denominator is the same as its predecessor multiplied by i. Use this observation to eliminate the use of Math.pow and factorial, and check that you get the same result.
Write a method called check that takes a parameter, x, and displays x, myexp(x), and Math.exp(x). The output should look something like:
1.0     2.708333333333333     2.718281828459045
You can use the escape sequence "\\t" to put a tab character between columns of a table.

Vary the number of terms in the series (the second argument that check sends to myexp) and see the effect on the accuracy of the result. Adjust this value until the estimated value agrees with the correct answer when x is 1.
Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and 100.0. How does the accuracy of the result vary as x varies? Compare the number of digits of agreement rather than the difference between the actual and estimated values.
Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0, and -100.0. Comment on the accuracy.


*/






//Personal practice
//Exercise 9 Chpt 6:  write a recursive version of power,
//which takes a double x and an integer n and returns x^n (x power n).
//A recursive definition of this operation is x^n = x · x^n−1.
//Also, remember that anything raised to the zeroth power is 1.

/*import java.io.*;
import java.util.*;

public class Loops{
  public static double power(double x, int n){

//anything raised to the zeroth power is 1
    if (n == 0)
    return 1;

    //x raised to 1 is x
    if (n == 1)
    return x;

    //recursive definition of this operation is x^n = x · x^n−1
    else
    //System.out.println(x+" "+n);
      return x * power(x, n-1);
        //System.out.println(x+);
        //System.out.println(x+" "+n);//output - don't understand
        //3.0 3
        //3.0 2

}

  //test
  public static void main(String[] args){
    System.out.println(power(3, 3));//27
    //System.out.println(x);
    //System.out.println(n);
//System.out.println(x+" "+n);

  }
}

//

//double powTest = power(3, 3); //output is 27
//System.out.println(powTest);
    //System.out.println(power (3, 3)); //output is 27

    /*System.out.println(power(3, 3)); //three to third is 27
    System.out.println(power(3, 2)); //three to second is 9
    System.out.println(power(3, 1)); //three to first is 3
    System.out.println(power(3, 0)); //three to zero is 1*/
    //return power(x * (x, n-1); //does not work
//return (x*power(x, n-1)); //output is 27
//return power (x, n-1); //output is 3.0
//System.out.println(double x, int n); //error

/*
  }
}*/


/*Output but I don't understand
3
2
*/









/*
personal practice section 5.8
*/
//5.8  Recursive methods
//takes a single integer as a parameter.
//If the parameter is zero, it displays the word “Blastoff”.
//Otherwise, it displays the number and then
//invokes itself, passing n - 1 as the argument

/*public class Loops {

public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}
    public static void main(String[] args){
          countdown(3);}
}
*/
/*output
3
2
1
Blastoff!
Have a nice day.
*/

/*

public class Loops {

  public static void countup(int n) {
      if (n == 0) {
          System.out.println("Blastoff!");
      } else {
          countup(n - 1);
          System.out.println(n);
      }
}
public static void main(String[] args){
      countup(3);
System.out.println("Have a nice day.");
  }

}
*/

// simple code that works
/*public class Loops {
  public static void main(String[] args){
    System.out.println("doing loops hw");
  }
}*/

//text example 6.2
/*import java.io.*;
import java.util.*;

public class Loops{
  public static double distance
  (double x1, double y1, double x2, double y2){
double dx = x2 - x1;
double dy = y2 - y1;
double dsquared = dx * dx + dy * dy;
double result = Math.sqrt(dsquared);
return result;
  }

public static void main(String[] args){
  double dist = distance(1.0, 2.0, 4.0, 6.0);
  System.out.println(dist);
}
}*/
//output:5

//7.1 test program-while
/*import java.io.*;
import java.util.*;
public class Loops {

public static void countdown(int n){
  while (n>0){
    System.out.println(n);
    n=n-1;
  }
  System.out.println("Blastoff!");
}
public static void main(String[] args){
      countdown(4);
}
}*/
/*Output
4
3
2
1
Blastoff!*/
/*7.1
Each time through the loop, the program displays the
value of n and then checks whether it is even or odd.
If it is even, the value of n is divided by two.
If it is odd, the value is replaced by 3n+1.
*/
/*import java.io.*;
import java.util.*;
public class Loops {

public static void sequence(int n){
  while (n !=1){
    System.out.println(n);
    if (n%2==0)
      n=n/2;
     else
      n=n*3+1;
}
}

    public static void main(String[] args){
          sequence(3);
    }
  }*/
/*output
3
10
5
16
8
4
2*/


//6.7 More Recursion Value methods

/*import java.io.*;
import java.util.*;

public class Loops {
  public static int factorial(int n){
    //since factorial is defined for integers,
    // method takes an int as a parameter and returns an int
    if (n==0){
      return 1; //base case; if arg is 0 return 1

    }
    int recurse = factorial(n-1); //why do we need factorial
    int result = n*recurse;
    return result;

  }
  public static void main(String[] args){
    System.out.println(factorial(3));
    //System.out.print(factorial(3)); //does not print anything

  }
}*/
