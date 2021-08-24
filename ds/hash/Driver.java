//Mr. H chaouiki hadjaahmed
//Eduardo
//Mamudu
//Michele
/*Resources we used
https://www.geeksforgeeks.org/hashtable-remove-method-in-java/

https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/

https://stackoverflow.com/questions/19535584/remove-method-in-hashtable

https://chortle.ccsu.edu/java5/Notes/chap54/ch54_22.html

https://beginnersbook.com/2014/07/java-add-element-at-specific-index-in-linkedlist-example/

https://stackoverflow.com/questions/49087466/how-to-properly-update-linked-list


https://www.geeksforgeeks.org/hashtable-put-method-in-java/

https://beginnersbook.com/2014/07/hashtable-iterator-example-java/
https://www.javacodeexamples.com/print-hashtable-in-java-example/3154
https://www.educative.io/edpresso/what-is-a-hash-code-in-java
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Driver{
  public static void main(String[] args) {
  PhoneBook s = new PhoneBook();
  Customer c = new Customer();

  Data d = new Data();
  Data d1 = new Data();
  Data d2 = new Data();

  // testing adding object to linked list customer
  d.add("Flanagan","Elen","9174780750");
  c.add(d);
  //Data d1 = new Data();
  //Data d2 = new Data();

  //System.out.println(c);
  //c.printCustomer();

  // ad another customer
  //d.clear();
  d1.add("Hadjahmed", "Chaouiki", "9174780756");
  c.add(d1);
  // print customer with two linked element
  //System.out.println(c);

  //c.printCustomer();
  // add to PhoneBook
  s.add(0,c);


  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer of two element added without hashCode");

  //heaading
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  // phonebook list
   s.printPhoneBookList();


  // testing hashcode method
  System.out.println();
  System.out.println("Print hashCode of two element customer");
  System.out.println("hashcode Flanagan: "+ c.hashCode("Flanagan"));
  System.out.println("hashcode Haadjahmed: "+ c.hashCode("Hadjahmed"));

  // remove Flanagan from linked list
  //c=s.get(0);
  c.removeCustomer("Flanagan");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Flanagan ");
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");

  s.printPhoneBookList();

  // remove Hadjahmed from linked list
  //c=s.get(0);
  c.removeCustomer("Hadjahmed");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Hadjahmed empty customer");

  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  //if (c.peekLast() == null)
  //c = new Customer();


  s.printPhoneBookList();

  // add Customer with hashcode
  Customer c1 = new Customer();
  c1.add(d);
  if (s.get(c.hashCode("Flanagan")) == null) {
    s.add(c.hashCode("Flanagan"),c1);
  }
  //s.printPhoneBookList();
  // add Customer with hashcode
  Customer c2 = new Customer();

  c1.add(d1);
  if (s.get(c2.hashCode("Hadjahmed")) == null) {
    s.set(c.hashCode("Hadjahmed"),c2);
  }
  // add Customer with hashcode
  Customer c3 = new Customer();

  d2.add("Persaud","michele","2121234567");
  c3.add(d2);
  if (s.get(c3.hashCode("Persaud")) == null) {
   s.set(c.hashCode("Persaud"),c3);
  }

  // printing PhoneBook list
    System.out.println();
  System.out.println("Print linked customer  after adding 3 customer with hashcode");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();
/*
  //remove Flanagan
  s.set(c.hashCode("Hadjahmed"),null);
  // printing PhoneBook lisSystem.out.println();
  System.out.println("Print linked customer  after removing Flanagan");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();*/
  }
}
/*
Print linked customer of two element added without hashCode
----------------------------------------------------------------
Last Name                 First Name                Phone Number
----------------------------------------------------------------
Flanagan                  Elen                     (917)-478-0750
Hadjahmed                 Chaouiki                 (917)-478-0756

Print hashCode of two element customer
hashcode Flanagan: 86
hashcode Haadjahmed: 66

Print linked customer  after remove Flanagan
----------------------------------------------------------------
Last Name                 First Name                Phone Number
----------------------------------------------------------------
Hadjahmed                 Chaouiki                 (917)-478-0756

Print linked customer  after remove Hadjahmed empty customer
----------------------------------------------------------------
Last Name                 First Name                Phone Number
----------------------------------------------------------------

Print linked customer  after adding 3 customer with hashcode

----------------------------------------------------------------
Last Name                 First Name                Phone Number
----------------------------------------------------------------
Persaud                   michele                  (212)-123-4567
Flanagan                  Elen                     (917)-478-0750
Hadjahmed                 Chaouiki                 (917)-478-0756
*/
