package poly;

public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	//Base 1 Condition
	public static double addition(double n1, double n2) {
		return n1 + n2;
	}
	
	//MO wrt no. of arguments
	public static double addition(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	//MO wrt data types of arguments
	//Base 2 Condtion
	public static double addition(double n1, float n2) {
		return n1 + n2;
	}
	
	//MO wrt sequence of arguments
	public static double addition(float n1, double n2) {
		return n1 + n2;
	}

}
