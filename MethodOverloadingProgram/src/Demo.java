
public class Demo
{
  void get(String name,int s1)
  {
	  System.out.println(""+name+""+s1);
  }
  void get(int s2)
  {
	  System.out.println(""+s2);
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.get("niit",33 );
		g.get(44);

	}

}
