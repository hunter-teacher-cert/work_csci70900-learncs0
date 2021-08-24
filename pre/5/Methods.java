
/*pre05 exercises 2, 3, 8 chpt 6 Think Java*/


import java.io.*;
import java.util.*;

/* Exercise 2: Write a method named isDivisible that takes two integers, n and m,
and that returns true if n is divisible by m, and false otherwise.*/


public class Methods {
  public static boolean isDivisible(int n, int m){
    //a number is divisible by another if after dividing remainder is 0//
    if (n % m == 0)
      return true;
    else return false;
}
public static void main(String[] args){
  //test values
  System.out.println(isDivisible(10,5)); //should be true
  System.out.println(isDivisible(5,10)); //should be false

}
  }



/* Exercise 3: Write a method named isTriangle that takes three integers
as arguments and returns either true or false, depending on whether
you can or cannot form a triangle from sticks with the given lengths.
The point of this exercise is to use conditional statements
to write a value method.
*/

public class Methods {
  public static boolean isTriangle(int a, int b, int c){
    /*If any of the three lengths is greater than the sum of the other two,
    you cannot form a triangle.*/
    if (a > (b + c)) {
      return false;
    } else if (b > (a + c)) {
      return false;
    } else if (c > (a + b)) {
      return false;
    } else {
      return true;
  }
  //test code
}
public static void main(String args[]){
  System.out.println(isTriangle(1,2,3)); //true
  System.out.println(isTriangle(1,1,4)); //false
}


}

/*
Note to instructors:
I will come back to #8 because I don't even know how to start;
I will work on the other exercises in the other chapters.

Exercise 8:  Write a method called ack that takes two ints as parameters
and that computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from main and
displaying the return value. Note the return value gets
very big very quickly. You should try it only for small values
of m and n (not bigger than 3).
*/
