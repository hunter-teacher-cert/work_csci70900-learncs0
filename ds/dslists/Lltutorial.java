import java.io.*;
import java.util.*;
import java.util.LinkedList;


public class Lltutorial{
  public static void main(String[] args){
    LinkedList<String> Lltutorial = new LinkedList<String>();
    Lltutorial.add("aster");
    Lltutorial.add("sedge");
    Lltutorial.add("grass");
System.out.println("items in ll" + Lltutorial);
//items in ll[aster, sedge, grass]
Lltutorial.remove();
System.out.println("items in ll after remove" + Lltutorial);
System.out.println("getFirst: " + Lltutorial.getFirst());

/*
Iterator it = Lltutorial.iterator();
while(it.hasNext()){
  if((String) it.next() == "grass") {
    System.out.println(Lltutorial.it);
  }
}
*/
  }
}
/*output
items in ll[aster, sedge, grass]
items in ll after remove[sedge, grass]
getFirst: sedge
*/
