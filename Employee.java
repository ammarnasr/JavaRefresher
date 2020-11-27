import java.io.* ;
public class Employee {
	String name;
	int age ;
	String designation;
	double salary;

	public Employee (String name){
		this.name = name ;
	}

	public void setAge (int age){
		this.age = age ;
	}

	public void setDesignation (String designation){
		this.designation = designation;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public void printEmployee (){
		System.out.println ("Name: " + this.name);
		System.out.println ("Age: " + this.age);
		System.out.println ("Designation: " + this.designation);
		System.out.println ("Salary: " + this.salary);
	}


	public static void main(String []args){
		Employee myEmployee = new Employee("Ammar");
		myEmployee.setSalary(1250.5);
		myEmployee.setDesignation("Software Developer");
		myEmployee.setAge(24);
		myEmployee.printEmployee();
	}


}