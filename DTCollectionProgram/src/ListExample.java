import java.util.ArrayList;

public class ListExample 
{

	public static void main(String[] args) 
	{
		ArrayList f=new ArrayList();
		f.add("niit");
		f.add("azar");
		
		f.add(101);
		f.add(102);
		
		Object obj=f.get(2);
		String str=obj.toString();
		//String str=(String) obj;
		System.out.println(str);
		

	}

}
