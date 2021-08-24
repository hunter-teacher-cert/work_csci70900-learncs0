/*
live-code experience
Note:  I have not formally taught CS so I made minor modifications to
the tutorials on w3schools (these have helped me learn the material)
to write this lesson outline. https://www.w3schools.com/java/java_methods.asp
----------
Lesson objectives:
Create methods with parameters and arguments
Call methods with parameters and arguments
Practice using vocabulary method, parameter, argument

Aim:
I can create and call a method with parameters and arguments
----------
Warm up:  Time: 5 minutes
Look at the code and answer the following:
-------
public class Main {
  static void myMethod() {
    System.out.println("I just got a 100 on my test!");
  }
  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}
----------
1.  What is the method inside Main? (myMethod)
2.  What does static mean?
(static means that the method belongs to the Main class and
not an object of the Main class.)
3.  What does void mean?
(void means that this method does not have a return value)
4.  Predict the output
// I just got a 100 on my test!
// I just got a 100 on my test!
// I just got a 100 on my test!
----------

Lesson Content steps 1-6 time: 20 min from https://www.w3schools.com/java/java_methods.asp)

Notes for teacher:
Parameters and Arguments:  Information can be passed to methods as parameters.
Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.
The following example has a method that takes a String called fname as parameter.
When the method is called, we pass along a first name, which is used inside the method to print the full name:
When a parameter is passed to the method, it is called an argument.
From the example : fname is a parameter, while Brian, Johan, Lizbeth are arguments.

public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " present");
  }

  public static void main(String[] args) {
    myMethod("Brian");
    myMethod("Johan");
    myMethod("Lizbeth");
  }
}
// Brain present
// Johan present
// Lizbeth present


You can have as many parameters as you like:

public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Brian", 11);
    myMethod("Johan", 12);
    myMethod("Lizbeth", 11);
  }
}

// Brian is 11
// Johan is 12
// Lizbeth is 11

When you are working with multiple parameters, the method call must have the
same number of arguments as there are parameters, and the arguments must be passed in the same order.

*/


public class Main {
  /*1. add a String fname parameter to the method*/
  static void myMethod(____________) {
    /*display fname parameter and text "present"*/
    System.out.println(____________);
  }

  public static void main(String[] args) {
    /*2. call myMethod for any 3 students in class Brian, Johan, Lizbeth*/
    ____________
    ____________
    ____________


  }
}

/*3. Will this code compile (because it's Java Python (interpreted)?
Predict the output*/

// Brain present
// Johan present
// Lizbeth present

/*4. You can have as many parameters as you like: add a parameter for age;
what type should age be? */

public class Main {
  static void myMethod(String fname, _____________) {
    /*what will the line of code below do?*/
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    /*2. call myMethod with ages 11, 12, 11 for Brian, Johan, Lizbeth*/

    myMethod(____________);
    myMethod(____________);
    myMethod(____________);
  }
}

// Brian is 11
// Johan is 12
// Lizbeth is 11


/*5. Change any of the programs in this lesson or another lesson to do something different.
Include comments, print statements, parameters and arguments.
Try to write the code without looking at notes.
*/

/*
Closing time: 10 min
/*6.  Share your code with your group and see if they can predict the output.
*/

/*
Additional practice:
Beginner: https://www.w3schools.com/java/java_methods_param.asp
Intermediate:  https://chortle.ccsu.edu/Java5/index.html#09
Advance: https://books.trinket.io/thinkjava/chapter4.html


/*
Equity framework-Historically Responsive Literacy -need to figure out how to do this;  use current events/find diverse texts written by diverse authors
1) identity/cultural competence (who we say we are, who others say we are, and the people we desire to be)
2) skill development - see objectives
3) intellectual development - see objectives
4) criticality/socio-political consciousness (read, write, think, and speak in ways to understand power and equity and promote anti-oppression)


UDL:
visuals-images/videos/real world examples/anchor charts/reference reinforcement opportunities/pronunciation/call and response/checklists/modified reading/chunk down verbal instruction/hetero grouping/redirection/timed activities, breaks to support mental fatigue/read alouds/limited distractions/preview/frontload vocabulary/repetition; modeling; small group instruction; frequent check ins/ graphic organizers/preferential seating; translations

Standards:  need to complete
*/
