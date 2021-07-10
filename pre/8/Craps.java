/*
Chapter 9 of Think Java deals with String manipulations. You don’t explicitly
need it for this section but you should review it prior to starting our program.

Create a directory named pre08 in your assignments folder.

You will write a program named Craps.java that will play a simplified game of craps.

There should be at least three static methods in addition to main. One named
roll which accepts an integer parameter and returns a random number between
1 and that number, inclusive. There should also be one named shoot which
accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.

The third method should be named round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:

the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.
The main program should take a parameter from the command line,
play that many rounds and as it plays indicate each time the shooter wins or loses.
 The program should also print out the status of the rounds they occur.
*/

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Craps{

//The main program should take a parameter from the command line,
//play that many rounds and as it plays indicate each time the shooter wins or loses.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int win = 0;
    int loss = 0;
    int point = 0;
    //If he rolls a 2,3, or 12,that’s Craps and he loses.
    if result == 2 || result == 3 || result == 12

    //If he rolls a 7 or 11, that’s a Natural and he wins.
    if result == 7 || result == 11

  //One methods named roll which accepts an integer parameter and returns
  //a random number between 1 and that number, inclusive.
/*  public static int roll (int n) {
    return (int) (Math.random() * n);
}
*/

//one named shoot which accepts two parameters - a number of
//dice and the maximum value for those dice and returns the result of rolling those dice.
public static int shoot(){
  Random rand = new Random();
  int d1 = rand.nextInt(6)+1;
  int d2 = rand.nextInt(6)+1;
  int result = d1+d2;
  System.out.println("die rolls: " + die1 + " + " + die2 + " = " + result);

  //The third method should be named round. It should accept no parameters
  //and it should return something to indicate if the shooter of the round wins or loses.

  public static round{

  }


}


}
