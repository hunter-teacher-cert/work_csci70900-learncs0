//Michelle P,Dwayne,Alexander M

// if the user chooses a circle with number of stones = to
//number of spaces left they gain extra turn
//6,5,4,3,2,1

//If(firstCircle == 6) pick that circle
//else if (circle[2] == 5) pick that circle
//else if (circle[3] == 6) pick that circles

// depending on my amount in the circle that is my number of steps
//int[] counts = new int[4];

import java.io.*;
import java.util.*;

class Mancala {


/*This function displays it conceptually as a Mancala board should appear
rather than how it is represented by the computer in memory.*/
public static void drawBoardForUser(int[] gameBoard)
{

System.out.print("{"+gameBoard[0]+"}");
System.out.print("["+gameBoard[12]+"]");
System.out.print("["+gameBoard[11]+"]");
System.out.print("["+gameBoard[10]+"]");
System.out.print("["+gameBoard[9]+"]");
System.out.print("["+gameBoard[8]+"]");
System.out.print("["+gameBoard[7]+"]");
System.out.print("\n");
System.out.print("    ");

System.out.print("["+gameBoard[1]+"]");
System.out.print("["+gameBoard[2]+"]");
System.out.print("["+gameBoard[3]+"]");
System.out.print("["+gameBoard[4]+"]");
System.out.print("["+gameBoard[5]+"]");
System.out.print("["+gameBoard[6]+"]");
System.out.print("{"+gameBoard[13]+"}");

System.out.println();

}
public static void drawBoard(int[] gameBoard)
{
//displayMancalaBoard();

int gameBoardIndex=1;
System.out.print("{"+gameBoard[0]+"}");

for (int row=0;row<2;row++)
{
if (row==0)
for (int counter=1;counter<(gameBoard.length)/2;counter++)
{
  //print each element with <>
  System.out.print("["+gameBoard[gameBoardIndex]+"]");
gameBoardIndex++;
  };//for
if (row==1)
{
  System.out.print ("   ");

for (int counter2=gameBoardIndex;counter2<(gameBoard.length - 1);counter2++)
{
  //print each element with <>
  System.out.print("["+gameBoard[gameBoardIndex]+"]");
gameBoardIndex++;


  };//for

};
if (row<1)
{
System.out.println();
};//if
  };//for
System.out.print("{"+gameBoard[13]+"}");


System.out.println();

}

//DEFINING the method
public static int userChoice(int[] gameBoard)
{
  System.out.println("Please select pod 1 -6");
  Scanner myInput = new Scanner(System.in);
  //what user types in is assigned to user
  int userPodChoice=myInput.nextInt();
  int counter=gameBoard[userPodChoice];

  // increment bins;
int moves=0;
while (gameBoard[userPodChoice]>0)

{
moves=moves+1;

gameBoard[userPodChoice+moves]=
gameBoard[userPodChoice+moves] + 1;

//the current index + 1
//subtract 1 from user hand as each stone is added to next pod
gameBoard[userPodChoice]=gameBoard[userPodChoice]-1;


}//while




  // increment bins;




  //mancalaBoard[userPodChoice]=0;// when user makes choice everything in chosen is taken out and distributed to the other pods until done




  //how many stones should be drooped in pods increment by 1 in manacalaboard array from original choice

  return userPodChoice;
}//userChoice

  /*
    int[] mancalaBoard = new int[12];




public static void displayMancalaBoard()
{

for (int counter=0;counter<mancalaBoard.length;counter++)
{
  System.out.println("<"+mancalaBoard[counter]+">");

  }


}//end displayMancalaBoard
*/

  public static void main(String[] args) {
    //create an array called mancalaBoard with 12 elements each can store an integer
int[] mancalaBoard = new int[14];
int leftBin=0;
int rightBin=0;

    System.out.println("Welcome to Mancala!");

//initialize mancalaBoard

/*
set counter variable to 0; it increases by 1 each time through for loop; is 1 lt than 12; repeat loop; is 12 lt 12 break out of loop
*/

mancalaBoard[0]=mancalaBoard[13]=0;
for (int counter=1;counter<13;counter++)
{
mancalaBoard[counter]=counter;// short cut to set each circle on the board to equal to 4 stones

  };//for

  //diplay the displayMancalaBoard

int stonesOnBoard=60;
while(stonesOnBoard>0)
{

drawBoardForUser(mancalaBoard);

//USING the method
userChoice(mancalaBoard);

for(int counter=0;counter<14;counter++)
stonesOnBoard+=mancalaBoard[counter];
};//while

}//main



}//mancalaBoard


// now player is playing against computer player 1 user player 2 cp

// prompt forn your turn and user chooses a pod from array 0 - 5 aka pod 1 - 6