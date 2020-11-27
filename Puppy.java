public class Puppy {
	int age;

	public Puppy(String name){
		System.out.println("The Puppy Name is :" + name);
	}

	puplic void setAge (int age){
		this.age = age ;
	}

	public void getAge (){
		return this.age;
	} 

	public static void main (String []args){
		Puppy myPuppy = new Puppy("Ammar");
		myPuppy.setAge(78);
		myPuppy.getAge();
	}
}