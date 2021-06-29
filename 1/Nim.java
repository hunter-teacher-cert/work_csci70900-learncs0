/*
program incomplete - I need to rereadx5 and see more examples
*/

/*
Collaborators:
Benson
Chaouiki
Dwayne
Lyuba
Michele

Consultants:
https://stackoverflow.com/questions/7456462/what-does-the-operator-do-in-java

*/

/*
DIRECTIONS:
-Save in your_work_repo: 1/Nim.java
-Include heading at top of file, as comment.
-List all collaborators and consultants.
-Write a program that will allow a human at console to play against your
"AI" a game of NIM
-Prompt user for number of stones they wish to remove each turn.
-Tell user how many stones the AI removed and how many stones remain
-facilitate play until human or AI wins, and announce winner
-GOAL: Be the player to remove the last stone.
-RULES: bag contains 12 stones initially;
a move consists of removing 1-3 stones from the bag
*/

import java.io.*;
import java.util.*;
import java.util.Scanner; //not necessary because of *

public class Nim{
  public static void main(String[] args){

//create and initialize variable to store the number of stones
    int stonesRemoved = 0;
//create and initialize variable for current number of stones
    int stonesRemain = 12;

/*
not sure what this means: if current number of stones is gt 0
variable valid is false?? while not valid = true, prompt user?
*/
    while (stonesRemain > 0){
      boolean valid = false;
      while (!valid){

    //ask user for number of stones 1-3 out of 12 stones total
    System.out.println("There are 12 stones, please choose between 1-3");

    //create a scanner class
    Scanner in = new Scanner(System.in);

    //read in stones (nextIn-stones rem)
    stonesRemoved = in.nextInt();

    /*
    check input until it is valid - use loop??; can someone explain this
    */
    valid = checkValid(stonesRemain, stonesRemoved);
    if (!valid)
    {
      System.out.println("Invalid entry.");
    }
    }

    /*
    -if valid, then calculate number of stones left
    -can somone explain this:
    -stonesRemain -= stonesRemoved means stonesRemain
     equals stonesRemain minus stonesRemoved
    */
    stonesRemain -= stonesRemoved

    //check if user wins
    if(stonesRemain <= 0) //shouldn't/couldn't this be if(stonesRemain = 0)
    {
      System.out.println("User wins!");
    }
    else
    //will finish tomrrow--
    //create variable for current number of stones
    //if valid then calculate number of stones left
    //AI generates random number between 1-3
    //tell user how many stones AI removed and how many remain - print
    //check winner after each turn; after user and after AI
    //make loop
    }
  }
  public static boolean checkValid(int stoneRemain, int stonesRemoved){
    if (stonesRemoved <= stonesRemain && (stonesRemoved == 3 || stonesRemoved == 2
    || stonesRemoved == 1)){
      return true;
    }
    else return false;
    }

  }
