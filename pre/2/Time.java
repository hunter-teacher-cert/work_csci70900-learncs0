import java.io.*;
import java.util.*;
public class Time {
  public static void main(String[] args){

    //2. Create variables named hour, minute, and second
    //Assign values that are roughly the current time 4:30:22 or 16:30:22
    int hour = 16;
    int minute = 30;
    int second = 20;

    //3. Calculate and display the number of seconds since midnight
    int secSinceMidnight = ((hour * 60 * 60) + (minute * 60) + 20);

    System.out.print("Number of seconds since midnight: ");
    System.out.println (secSinceMidnight);


//figure out seconds in a day
int hoursDay = 24; //hours in a day
int minHour = 60; //minutes in an hour
int secHour = minHour * 60; //seconds in an hour
int secDay = hoursDay * secHour; //seconds in a day

//4. Calculate and display the number of seconds remaining in the day
//Number of seconds in a day minus number of seconds since midnight
int secRemDay = secDay - secSinceMidnight;

System.out.print("Number of seconds in a day: ");
System.out.println (secDay);


System.out.print("Number of seconds remaining in the day: ");
System.out.println (secRemDay);

//5. Calculate and display the percentage of the day that has passed
int pctDayPass = secSinceMidnight * 100 / secDay;
System.out.print("Percentage of day that has passed:   ");
System.out.println (pctDayPass);

//6.  Change the values of hour, minute, and second
//to reflect the current time
// write code to compute the elapsed time since
//you started working on this exercise.

int endHour = 17;
int endMinute = 47;
int endSecond = 44;

String ElapsTime = ((endHour - hour) + ":" + (endMinute - minute) + ":" + (endSecond - second));
System.out.print("Elapsed time since working on exercise:  ");
System.out.println(ElapsTime);
  }
}
