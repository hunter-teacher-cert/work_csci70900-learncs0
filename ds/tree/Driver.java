import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTree t = new BSTree();

		t.seed();

		int value;
		value = t.search(10); //look for 10
		System.out.println(value);
		value = t.search(15); //look for 15
		System.out.println(value);
		try {
			value = t.search(17); //look for 17 - should throw exception
			System.out.println(value);
		} catch (NullPointerException e) {
			System.out.println("17 not in tree");
		}

	}
}
/*
10
15
17 not in tree
*/
