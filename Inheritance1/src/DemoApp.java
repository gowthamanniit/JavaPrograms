import java.util.Scanner;

class b1
{
  int age;
  Scanner h=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the BaseClass value is:\n");
	  age=h.nextInt();
	  System.out.println("BaseClassValue is:"+age);
  }
}
class d1 extends b1
{
	void get2()
	{
		System.out.println("Derived class is:"+age);
	}
}
class d2 extends d1//multilevel syntax
{
	
}
public class DemoApp 
{

	public static void main(String[] args)
	{
		
          d1 g=new d1();
          g.get1();
          g.get2();
	}

}