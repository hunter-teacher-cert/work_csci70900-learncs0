import java.io.*;
import java.util.*;

public class BSTree { //start with constructor
    private TreeNode root;

    public BSTree(){
	root = null; //make the root null
    }

    public int search(int key){
          //start current node at the root
	TreeNode current = root; //start with a temporary node called current

	while (current != null){ //while not null keep searching until value is found
	    int currentValue = current.getData(); //should not be getValue
	    if (currentValue == key){
        return currentValue;
		// do something
        //return key; //return the value in the tree;
	    } else if (currentValue < key){
        current = current.getRight();
		// do something else
	    } else {
		// do yet another thing
    current = current.getLeft();
		}
	}
	// do we really want to return -1?
	//return -1;
  //throw an exception if it is not found
  throw new NullPointerException();
    }

    public void seed(){ //manually building the tree
	TreeNode t; //start with tree node t

	t = new TreeNode(10); //make a new node with a 10 in it; it's left and right are null
	root = t; //root points to t
	t = new TreeNode(5); //t points to a new node which has a data of 5
	root.setLeft(t); //connect-link 10 to 5
	t = new TreeNode(20); //t assigned a new node; t has a new node with a 20 in it
	root.setRight(t); //point the root's right to it

	root.getLeft().setRight( new TreeNode(8)); //root get left set right has 8

	t = new TreeNode(15); //make  a new node with 15 in it
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);//root, get right, set right; make node with 22

	}


}
//
//in this tree given any node
//every node in left subtree has a lower/lesservalue less;
//every node in right subtree has a greater value
//tree has an ordering
//        10
//    5         20
//      8     15    22
