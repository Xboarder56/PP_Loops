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
		
		/**Set the size of the applet*/
		forLoop();
		whileLoop();
		nestedLoop();
		
		
		
	}
	
	public void forLoop()
	{
		for(int i=4; i<11; i++)
			{
				print(i+" ");
			}
		
		println();
		for(int i=6; i>0; i--)
			{
				print(i+" ");
			}
		
		println();
		for(int i=2; i<18; i++)
			{
				print(i+" ");
				i++;
			}
		
		println();
		for(int i=19; i>4; i--)
			{
				print(i+" ");
				i--;
			}
		
		println();
		for(int i=7; i<40; i+=7)
			{
				print(i+" ");
				i++;
			}
		
		println();
		for(int i=2; i<65; i+=i)
			{
				print(i+" ");
				//i++;
			}
	}
	
	public void whileLoop()
	{
		println();
		int count = 1;
		int n = readInt("Enter a whole number");
		
		while(count <=n)
			{
				print(count + " ");
				count++;
			}
		
		println();

		
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