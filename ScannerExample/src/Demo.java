import java.util.Scanner;

class Demo1
{
	
	Scanner h=new Scanner(System.in);
	int a;
	
   void get1()
   {
	   System.out.println("Enter the value is:\n");
	   a=h.nextInt();
	   
   }
   void get2()
   {
	  if(a%2==0)
	  {
		  System.out.println("Even"+a);
	  }
	  else
	  {
		  System.out.println("Odd"+a);
	  }
   }
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo1 g=new Demo1();
		g.get1();
		g.get2();
	}

}
