import java.util.Scanner;

public class TicketExample 
{
  String cname[]=new String[10];
  String movie[]=new String[10];
  int ticketid[]=new int[10];
  int count,i;
  Scanner g=new Scanner(System.in);
  void bookingTicket()
  {
	  System.out.println("Enter the customer count..");
	  count=g.nextInt();
	  for(i=0;i<=count;i++)
	  {
		  System.out.println("Enter the customer name:");
		  cname[i]=g.next();
		  System.out.println("Enter the Movie name:");
		  movie[i]=g.next();
		  System.out.println("Enter the ticketId name:");
		  ticketid[i]=g.nextInt();
	  }
	  
  }
  void displayCustomer()
  {
	  for(i=0;i<=count;i++)
	  {
	  System.out.println("Your Booking Sucess!!!");
	  System.out.println("Your TicketId is:"+ticketid[i]);
	  System.out.println("Your MovieName is:"+movie[i]);
	  }
  }
}
class Demo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      TicketExample te=new TicketExample();
      te.bookingTicket();
      te.displayCustomer();
	}

}
