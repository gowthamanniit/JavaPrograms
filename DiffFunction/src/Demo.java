
public class Demo
{
	int a=100;
  void g1()
  {
	  int b=200;
	  System.out.println("welcome to method-1"+b+""+a);
  }
  void g2()
  {
	  System.out.println("welcome to method-2"+a);
  }
}
class Sample
{
	public static void main(String as[])
	{
		Demo g1=new Demo();
		g1.g1();
		g1.g2();
	}
}
