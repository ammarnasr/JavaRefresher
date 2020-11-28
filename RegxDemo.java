import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegxDemo{
	public static void main(String []args){
		String inputString = args.length == 0 ? "An order for QT30000? Okay." : args[0];
		String inputRegexp = "(.*)(\\d+)(.*)";

		Pattern myPattern = Pattern.compile(inputRegexp);
		Matcher myMatcher = myPattern.matcher(inputString);

		if (myMatcher.find()){
			System.out.println("Number of values found:" + myMatcher.groupCount());

			for (int i = 0 ; i<= myMatcher.groupCount() ; i++){
				System.out.println("Found Value at: " + myMatcher.group(i));
			}
		}else{
			System.out.println ("No matches found.");
		}

	}
}