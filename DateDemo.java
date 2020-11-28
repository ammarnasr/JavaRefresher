import java.util.* ;
import java.text.* ;
public class DateDemo{
	public static void main (String[]args){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String inputDate = args.length == 0 ? "2000-20-02" : args[0]; 
		System.out.println("input: " + inputDate);
		try {
			Date parsedInputDate = ft.parse(inputDate);
			System.out.println("output: "+ parsedInputDate);

		}
		catch (ParseException E){
			System.out.println("Input Can not be Parrsed");
		}
		}
}