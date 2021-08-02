/*
I am practicing using these tutorials
tutorials:
https://www.geeksforgeeks.org/queue-poll-method-in-java/
 https://www.youtube.com/watch?v=91CMnJeHJVc

Queue Folder: ds/queue

Create a class that represents a queue. This class should use a linked list that you build (not the built in Java class) with at least two pointers. Your class should implement the following methods:

constructor(s)
enqueue(value) <-- add value to the end of the queue
x = dequeue() <-- remove and return the value at the front of the queue
x = front() <-- return but don't remove the value at the front
isEmpty() <-- returns true if the queue is empty
size() <-- returns the number of items in the queue


*/

import java.io.*;
import java.util.*;
import java.util.Queue; //bring in queue code to use

public class QueueTutorial{

public static void main(String[] args){
//create queue object with string elements
  Queue <String> studentLine = new LinkedList<String>();
  studentLine.add("Juan");
  studentLine.add("Lizbeth");
  studentLine.add("Charlie");
  studentLine.add("Hadeel");

//print student line
  System.out.println(studentLine); //[Juan, Lizbeth, Charlie, Hadeel]

  //print front and remove head
  System.out.println("Queue front: " + studentLine.poll());
  /*[Juan, Lizbeth, Charlie, Hadeel]
  Queue front: Juan
*/
  System.out.println(studentLine);
  /*output
  [Lizbeth, Charlie, Hadeel]
  */
  System.out.println(studentLine.peek()); /*output:  previews next removal Lizbeth*/

  System.out.println("Size:  " + studentLine.size()); //Size:  3

  System.out.println("contains Lizbeth: " + studentLine.contains("Lizbeth"));

  System.out.println("contains Marco: " + studentLine.contains("Marco"));
  /*output
  contains Lizbeth: true
  contains Marco: false
  */
  //change to an array and get an element
  System.out.println("index 1 is: " + studentLine.toArray()[1]);
  /*output index 1 is: Charlie*/


}//void
}//class
