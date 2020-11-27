public class ReverseArray{
	
	public static int [] reverseArray (int [] arr){
		int [] reversedArray = new int [arr.length];
		for (int i = 0 ; i < arr.length ; i++){
			reversedArray [arr.length - 1 - i] = arr[i];
		} 
		return reversedArray ;
	}

	public static void printArray (int [] arr) {
		for (int elment : arr){
			System.out.print(elment + " ");
		}
	}

	public static void main (String[]args){
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println("The orginal array is :");
		printArray(arr);
		System.out.println("\nThe reversed array is:");
		arr = reverseArray(arr);
		printArray(arr);

	}
}