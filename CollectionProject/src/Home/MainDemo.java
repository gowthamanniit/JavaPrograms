package Home;

import java.util.Scanner;

import Billing.Billing;
import Customer.Customer;
import Products.Products;

public class MainDemo
{
	public static void main(String[] args) 
	{
		Customer md=new Customer();
				
		//md.addCustomer();
		
		Products pd=new Products();
		pd.addProduct();
		pd.stock();
		Billing bl=new Billing();
		//bl.billing();

	}

}
