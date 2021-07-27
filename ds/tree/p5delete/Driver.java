import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTree t = new BSTree();

		t.insert(10);
		t.insert(20);
		t.insert(5);
		t.insert(7);
		t.insert(8);
		t.insert(3);
		t.insert(25);

		t.preorderTraverse();
		t.postorderTraverse();
		t.inorderTraverse();

	}
}
/*
10, 5, 3, 7, 8, 20, 25,
3, 8, 7, 5, 25, 20, 10,
3, 5, 7, 8, 10, 20, 25,
*/
