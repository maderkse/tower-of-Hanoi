import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Hanoi {
   final static String[] EMPTY = null;
   private static Location locationA;
   private static Location locationB;
   private static Location locationC;

   public static void main (String[] args) 
   {
      if (args.length > 0 ) {
	 System.out.println("Tower height: " + args.length);

      } else {
	 System.out.println("Exception in program call. Syntax: java Hanoi.java n n-1 n-2 ... Where n is an integer.");
      }

      locationA = new Location("A",args);
      locationB = new Location("B",EMPTY);
      locationC = new Location("C",EMPTY);
      showLocations();

      solve(locationA
	    ,locationC
	    ,locationB,
	     args.length);
   }

   public static void solve(Location towerOldLocation
	 ,Location towerDestination
	 ,Location towerParking 
	 ,int towerHeight)
   {
      int parkingTowerHeight = 0;

      //move tower to temporary place, except the base element
      if (towerHeight > 1) 
      {
	 parkingTowerHeight = towerHeight - 1;
	 solve(towerOldLocation
	       ,towerParking
	       ,towerDestination
	       ,parkingTowerHeight);
      } 

      // move tower base element to destination
      towerDestination.push(towerOldLocation.pop());
      showLocations();

      //move parked tower to destination
      if (parkingTowerHeight > 0)
      {
	 solve(towerParking
	       ,towerDestination
	       ,towerOldLocation
	       ,parkingTowerHeight);
      }
   }

   public static void showLocations()
   {
      System.out.println(locationA);
      System.out.println(locationB);
      System.out.println(locationC);
      System.out.println("\n");
   }
}

class Location {
   private String name;
   private ArrayDeque<String> stack;

   public Location(String p_name, String[] p_stack)
   {
      this.name = p_name;
      if (p_stack != null )
      {
	 this.stack = new ArrayDeque<String>(Arrays.asList(p_stack));
      } else {
	 this.stack = new ArrayDeque<String>();
      }
   }

   public String toString()
   {
      return this.name + ": " + this.stack.toString();
   }

   public String pop()
   {
      return this.stack.pop();
   }

   public void push(String p_element)
   {
      this.stack.push(p_element);
   }
}
