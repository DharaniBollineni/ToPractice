import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryAndFinally {

	static DataInputStream dis=null;// static variable to access in static method and it is useful in finally block
	static FileOutputStream fos=null;
	
	public static void main(String[] args) throws IOException {// interface throws exceptions.
		/*try {
			dis=new DataInputStream(System.in);  // binary string data
			fos=new FileOutputStream("Dtext.txt",true);  // true is for appending
			
			char ch1;
			System.out.println("Enter the data(end by @");
			while((ch1=(char)dis.read())!='@')  // read, convert,assign and validate
			{
				fos.write(ch1);
			}
		
		}
		finally {
			dis.close();
			fos.close();
		}*/
			
		System.out.println(new TryAndFinally());	
		String s = "This class is created to practice Exceptions";
		System.out.println(s);
		System.out.println(s.toString());

	}

	@Override
	public String toString() {
		return "This class is created to practice Exceptions";
	}
	
	

}
