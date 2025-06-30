package oops.Object.equals;

public class Equals {
	int id;
	String name;
	
	public Equals(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		Equals ref1 = new Equals(1,"Qsp");
		System.out.println("ref1: "+ref1);
		
		Equals ref2 = new Equals(1, "Qsp");
		System.out.println("ref2: "+ref2);
		
		System.out.println(ref1 == ref2);
		System.out.println(ref1.equals(ref2));
		System.out.println("End of Main");
		

	}

}
