import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Doo 
{

	Scanner g=new Scanner(System.in);
	int a;
	void get1()
	{
		try
		{
		System.out.println("Enter the value is:\n");
		a=g.nextInt();
		
		}
		catch(InputMismatchException t)
		{
			System.out.println(t);
		}
		finally
		{
		System.out.println("****");
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Doo h=new Doo();
		h.get1();

	}

}