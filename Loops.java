public class Loops{

	public static void main (String []args){


		int [] x  = {10, 20, 30, 40};
		String [] names = {"ammar", "ali", "sara", "aml"};

		for (int i = 0; i < 4; i++){
			System.out.print(x[i]);
			System.out.print(", ");
		}

		for (String name: names){
			System.out.print(name + ", ");
		}
	}
}