package Products;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

interface addProduct
{
	public void addProduct();
}
public class Products implements addProduct
{
  public String pname;
  public int pid,tot;
  public int prices[]=new int[4];
  Scanner h=new Scanner(System.in);
  public static HashSet<String> hs=new HashSet<>();
  public static ArrayList<Integer> as=new ArrayList<>();
  public void addProduct()
  {
	  for(int i=0;i<2;i++)
	  {
	  System.out.println("Enter the ProductName:");
	  pname=h.next();
	  System.out.println("Enter the ProductId:");
	  pid=h.nextInt();
	  System.out.println("Enter the ProductPrices:");
	  prices[i]=h.nextInt();
	  tot=prices[i]+prices[i];
	  
	   hs.add(pname);
	   as.add(pid);
	   
	   
	  }
	   as.add(tot);
	   System.out.println("Your Name:"+hs);
	   System.out.println("Your Productid and prices"+as);
	   
  }
}