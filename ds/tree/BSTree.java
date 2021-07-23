import java.io.*;
import java.util.*;

public class BSTree { //start with constructor
    private TreeNode root;

    public BSTree(){
	root = null; //make the root null
    }

    public int search(int key){
	TreeNode current = root;

	while (current != null){
	    int currentValue = current.getValue();
	    if (currentValue == key){
		// do something
        return key;
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
  throw new NullPointerException();
    }

    public void seed(){ //manually building the tree
	TreeNode t; //start with tree node t

	t = new TreeNode(10); //make a new node with a 10 in it; it's left and right are null
	root = t; //root points to t
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);

	}


}
