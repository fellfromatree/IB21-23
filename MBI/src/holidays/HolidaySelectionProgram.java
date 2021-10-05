package holidays;

import java.util.Scanner;

public class HolidaySelectionProgram 
{
	/** public String userName;
	// public int age;
	// public double height;
	// public boolean onlyChild;
	**/
	//public int userChoice;
	
	public static void main(String[] args) 
	{
		HolidaySelectionProgram runMe = new HolidaySelectionProgram();
		
		// TODO Auto-generated method stub
		
		// Welcome message explaining first 2 choices
		
		// Ask user for relaxing or adventure
		
		// Check entry is valid
		// While entry is <1 or entry > 2
		// Ask for another entry
		
		// Ask for summer or winter
		
		// Check entry is valid
		
		// Ask user for cheap or expensive
		
		// Check entry is valid
		
		// Calculate their destination

	}
	
	
	public HolidaySelectionProgram()
	{
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int base = 0;
		
		String[] choices = new String[] {"Option 1","Option 2","Option 3","Option 4","Option 5","Option 6","Option 7","Option 8"};
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome. Pleaser enter 1 for adventure or 2 for relaxing holidays.");
		
		c1 = kb.nextInt();
		
		while(c1!=1 && c1!=2)
		{
			System.out.println("You've not read the instructions correctly, enter 1 or 2.");
			c1 = kb.nextInt();
		}
		
		System.out.println("Great, now please choose 1 for a summer break or 2 for a winter break.");
		

		c2 = kb.nextInt();
		
		while(c2!=1 && c2!=2)
		{
			System.out.println("You've not read the instructions correctly, enter 1 or 2.");
			c2 = kb.nextInt();
		}
		
		
		System.out.println("Great, now please choose 1 for an expensive break or 2 for a cheap break.");
		

		c3 = kb.nextInt();
		
		while(c3!=1 && c3!=2)
		{
			System.out.println("You've not read the instructions correctly, enter 1 or 2.");
			c3 = kb.nextInt();
		}
		

		if(c1==1 && c2==1) 
		{
			base = 0;
		}
		
		else if(c1==1 && c2==2)
		{
			base = 2;
		}
		
		else if(c1==2 && c2==1)
		{
			base = 4;
		}
		
		else if(c1==2 && c2==2)
		{
			base = 6;
		}
		
		base = base+(c3-1);
		System.out.println("You are going on holiday to " + choices[base]);
		
	}
	

}
