import java.io.*; 
public class ReadConsle{
	public static void main(String []args) throws IOException{
		InputStreamReader  cin = null;
		System.out.println("Enter Chracters: (press Q to exit)");

		try {
			cin  = new InputStreamReader(System.in);

			char c = 'a';

			while( c != 'q'){
				c = (char)cin.read();
				System.out.print(c);
			}
		}
		finally{
			if (cin != null)
			{
				cin.close();
			}
		}
	}
}