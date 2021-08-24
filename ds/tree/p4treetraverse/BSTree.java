import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }
    //make a recursive call that gives us node in tree in question
    //use a private function
    private void traverse(TreeNode *current){
      if (current ==null)
      return;
      //process the current Node
      System.out.print(current.getData()+",");
      //recursively print out the left subtree
      traverse(current.getLeft());
      //recursively print out the right subtree
      traverse(current.getRight());
    }
    public void traverse(){
      traverse(root); //public function calls traverse with root;  use this to make parameter
      System.out.println();

      //video min 46
      //int[] a = new int[10];
      //fill the array
      //Node current = front; //code for a linked list
      //while (current != null){//code for a linked list
      //  System.out.println(current.getData());//code for a linked list
      //  current = current.getNext(); //code for a linked list
      }

      //for (int i =0; i < 10; i++){
        //System.out.println(a[i]);
      }
    }



    private void preorderTraverse(TreeNode current){
	if (current == null)
	    return;

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the left subtree
	preorderTraverse(current.getLeft());

	// recursively print out the right subtree
	preorderTraverse(current.getRight());
    }

    public void preorderTraverse(){
	preorderTraverse(root);
	System.out.println();
    }

    private void postorderTraverse(TreeNode current){
	if (current == null)
	    return;

	// recursively print out the left subtree
	postorderTraverse(current.getLeft());

	// recursively print out the right subtree
	postorderTraverse(current.getRight());

	//process the current node
	System.out.print(current.getData()+", ");



    }

    public void postorderTraverse(){
	postorderTraverse(root);
	System.out.println();
    }

    private void inorderTraverse(TreeNode current){
	if (current == null)
	    return;


	// recursively print out the left subtree
	inorderTraverse(current.getLeft());

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the right subtree
	inorderTraverse(current.getRight());
    }

    public void inorderTraverse(){
	inorderTraverse(root);
	System.out.println();
    }


    public void insert(int key){

	TreeNode newNode = new TreeNode(key);

	// if the tree is empty
	// manually insert the new node as the root
	if (root==null){
	    root = newNode;
	    return;
	}

	TreeNode front = root;
	TreeNode trailer = root;

	while (front != null){
	    int frontValue = front.getData();
	    if (frontValue == key){
		// if we're here, it means the key is
		// already in the tree so we can
		// update this node in some way
		// and then return
		return;
	    } else if (frontValue < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}
	if (key > trailer.getData()){
	    // insert on the right
	    trailer.setRight(newNode);
	} else {
	    // insert on left
	    trailer.setLeft(newNode);

	}



    }


    public int search(int key){
	TreeNode current = root;

	while (current != null){
	    int currentValue = current.getData();
	    if (currentValue == key){
		return currentValue;
	    } else if (currentValue < key){
		current = current.getRight();
	    } else {
		current = current.getLeft();
	    }
	}
	throw new NullPointerException();

    }

    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
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
/* original output
10, 5, 3, 7, 8, 20, 25,
3, 8, 7, 5, 25, 20, 10,
3, 5, 7, 8, 10, 20, 25,
*/
