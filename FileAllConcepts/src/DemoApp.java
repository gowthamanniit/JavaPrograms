import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class DemoApp 
{

  String uname;
  Scanner g=new Scanner(System.in);
  void getWrite()throws IOException
  {
	  try
	  {
		  FileInputStream fis=new FileInputStream("D:\\s1.txt");
		  FileInputStream fis1=new FileInputStream("D:\\s2.txt");
		  SequenceInputStream sis=new SequenceInputStream(fis,fis1);
		  FileOutputStream fout2=new FileOutputStream("D:\\s3.txt");
		  int i;
		  
		  while((i=sis.read())!=-1)
		  {
			 //System.out.print((char)i);  
			  //fout1.write((byte)i);
			  fout2.write((byte)i);
		  }
	  }
	  catch(FileNotFoundException t)
	  {
		  System.out.println(t);
	  }
  }
}
class Foo
{
	
	public static void main(String[] args) throws IOException
	{
		DemoApp g=new DemoApp();
		g.getWrite();

	}

}
