import java.util.Scanner;

public class Demo 
{
	int product[]=new int[10];
	int i,j,n,m;
	Scanner g=new Scanner(System.in);
	 void get1()
	 {
		 System.out.println("Enter the n value is:\n");
		 n=g.nextInt();
		 
		 for(i=0;i<n;i++)
		 {
			
			 System.out.println("Enter the array value is:\n");
			 product[i]=g.nextInt();
			 
			
			 
		 }
	 }
	 void disp()
	 {
		 for(i=0;i<n;i++)
		 {
			 
			 System.out.println("Value is:\n"+product[i]);
			 
		 }
	 }
}
class Demo1
{
	public static void main(String[] args)
	{
	
        Demo t=new Demo();
        t.get1();
        t.disp();
	}

}
