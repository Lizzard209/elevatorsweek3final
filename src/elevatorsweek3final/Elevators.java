package elevatorsweek3final;

import java.util.Scanner;

public class Elevators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int floors[]= {0,1,2};
		int currentFloor = 0; //initialize my floor to 0
		int desiredFloor = 0; //initialize my floor to 0
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("What floor are you on?"); 
		System.out.println ("Press \"0\" for Basement");
		System.out.println ("Press \"1\" for for the First Floor");
		System.out.println ("Press \"2\" for the Second Floor");
		
		currentFloor = scan.nextInt(); 

		System.out.println("What floor are you going to?");
		{
			 desiredFloor = scan.nextInt();
			 
			 for (int i = 0; i<floors.length; i++)
			 {
			 if (currentFloor == floors[i]) {
				 System.out.println ("Elevator moves " +currentFloor+ " floors");
				 System.out.println ("Elevator door opens");
				 System.out.println ("*Person walks in*");
				 System.out.println ("Elevator door closes");
				 System.out.println ("Elevator moves " +(desiredFloor-currentFloor)+ " floors");
				 System.out.println ("Elevator door opens");
				 System.out.println ("*Person walks out*");
				 System.out.println ("Elevator door closes");
				 System.out.println ("Elevator moves " +(0- desiredFloor)+ " floors");}	 
			 }
		}
	}

}
