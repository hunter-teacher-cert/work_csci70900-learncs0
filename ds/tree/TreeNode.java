
import java.io.*;
import java.util.*;

public class TreeNode{
    private int data; //stuff
    private TreeNode left,right; //pointers

    public TreeNode(){ //first constructor
	this(0); //calls ?
	left = null;
	right = null;
    }

    public TreeNode(int data){ //second constructor
	this.data = data;
	left = null;
	right = null;
    }
    //create getters and setters
    public void setData(int data){
	this.data = data;
    }

    public void setLeft(TreeNode left){
	this.left = left;
    }

    public void setRight(TreeNode right){
	this.right = right;
    }

    public int getData(){
	return data;
    }

    public TreeNode getLeft(){
	return left;
    }

    public TreeNode getRight(){
	return right;
    }
}
