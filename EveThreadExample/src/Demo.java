
public class Demo extends Thread
{
 public void run()
  {
	 System.out.println("ThreadName is::"+Thread.currentThread().getName());
	 System.out.println("Priority is::"+getPriority());
	  
  }
}
class Sample
{
	public static void main(String[] args) 
	{
	   Demo t1=new Demo();
	   Demo t2=new Demo();
	   
	   
	   try
	   {
		   System.out.println("JoinIN");
		   t1.join(6000);
		   System.out.println("JoinOUT");
	   }
	   catch(InterruptedException y)
	   {
		   
	   }
	   t1.setName("NIIT");
	   t1.start();
	   t2.setPriority(Thread.MIN_PRIORITY);
	   t2.start();

	}

}
