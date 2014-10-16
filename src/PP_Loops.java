/**
 * PP_LOOPS
 * @author Garrett J. Beasley
 * 10/15/2014
 */


//Imports for the program.
import acm.program.ConsoleProgram;


public class PP_Loops extends ConsoleProgram
{
	
	public void run()
	{
		/**Set the size of the applet*/
		setSize(500,400);
		
		/**Calles the methods for the project*/
		forLoop();
		println();
		whileLoop();
		println();
		nestedLoop();
		
		
		
	}

	/**Create a public method called forLoop*/
	public void forLoop()
	{
		/**Starts counting from 4 to 10 by +1*/
		for(int i=4; i<11; i++)
			{
				print(i+" ");
			}
		
		println();
		
		/**Counts down from 6 to 0 by -1*/
		for(int i=6; i>0; i--)
			{
				print(i+" ");
			}
		
		println();
		
		/**Counts from 2 to 16 counting by twos*/
		for(int i=2; i<18; i++)
			{
				print(i+" ");
				i++;
			}
		
		println();
		
		/**Counts down from 19 to 5 by twos*/
		for(int i=19; i>4; i--)
			{
				print(i+" ");
				i--;
			}
		
		println();
		
		/**Count up by 8 start at 7 ending at 40*/
		for(int i=7; i<40; i+=7)
			{
				print(i+" ");
				i++;
			}
		
		/**Count up to 65 by i everytime*/
		println();
		for(int i=2; i<65; i+=i)
			{
				print(i+" ");
			}
	}
	
	public void whileLoop()
	{
		/**Init count to 1 and have the user enter a number to count up to. */
		println();
		int count = 1;
		int n = readInt("Enter a whole number: ");
		
		while(count <=n)
			{
				print(count + " ");
				count++;
			}
		
		println();
		
		int sum = 0;
		for (int i = 1; i <=10; i++)
			{
				
	            sum = sum + i;
	           
			}
		print("The sum is: " + sum);
		

		
	}
	
	
	public void nestedLoop()
	{
		
		println();
		/**Print 1-9 for 3 rows*/
		for(int i=1; i<=3; i++)
		{
			println();
			for(int j=1; j<10; j++)
				{
					print(j+" ");
				}
		}
		
		println();
		/**Print ***** for 5 rows*/
		for(int i=1; i<=5; i++)
		{
			println();
			println();
			for(int j=1; j<=5; j++)
				{
					print("*");
				}
		}
		
		println();
		/**Print *********** for 2 rows*/
		for(int i=1; i<=2; i++)
		{
			println();
			println();
			for(int j=1; j<=10; j++)
				{
					print("*");
				}
		}
		
		println();
		/**Print for 2 rows*/
		for(int i=1; i<=5; i++)
		{
			println();
			for(int j=1; j<=i; j++)
				{
					print("*");
				}
		}
	}
}