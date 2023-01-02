import java.util.ArrayDeque;
import java.util.Arrays;

class Hanoi {
   final static int EMPTY = 0;
   private static Location locationA;
   private static Location locationB;
   private static Location locationC;
   private static int towerHeight;

   public static void main (String[] args) 
   {
      validateArgs(args);

      System.out.println("Tower height: " + args[0]);

      locationA = new Location("A",towerHeight);
      locationB = new Location("B",EMPTY);
      locationC = new Location("C",EMPTY);
      showLocations();

      solve(locationA
	    ,locationC
	    ,locationB,
	    Hanoi.towerHeight);

      System.exit(0);
   }

   public static void validateArgs(String[] args)
   {
      boolean valid = true;

      try
      {
	 if (args.length != 1 ) 
	 {
	    throw new IllegalArgumentException("One program argument expected instead of: " + args.length);
	 }

	 Hanoi.towerHeight = Integer.parseInt(args[0]);

      }
      catch (IllegalArgumentException ex) 
      {
	 System.err.println("Error in program call. " + ex.getMessage());
	 System.err.println("Correct syntax: java Hanoi.java <tower height>");
	 System.err.println("Where tower height is an integer representing the height of the starting tower.");
	 System.exit(1);
      }
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
      System.out.println();
   }
}

class Location {
   private String name;
   private ArrayDeque<Integer> stack = new ArrayDeque<>();

   public Location(String name, int towerHeight)
   {
      this.name = name;
      if (towerHeight > 0 )
      {
	 initStack(towerHeight);
      }
   }

   public String toString()
   {
      return this.name + ": " + this.stack.toString();
   }

   public int pop()
   {
      return this.stack.pop();
   }

   public void push(int element)
   {
      this.stack.push(element);
   }

   private void initStack(int stackHeight)
   {
      for (int i = stackHeight; i > 0 ; i--)
      {
	 this.stack.push(i);
      }
   }
}
