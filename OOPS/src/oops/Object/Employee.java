package oops.Object;

public class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
	this.id = id;
	this.name = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		Employee e1 = new Employee(1, "Qsp");
		System.out.println(e1);
		
		Employee e2 = new Employee(2,"Jsp");
		System.out.println(e2);
		System.out.println("Main end");
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
