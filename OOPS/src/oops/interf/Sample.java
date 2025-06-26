package oops.interf;

interface I{
	static int a = 20;
	int b = 10;
	public static void test() {
		System.out.println("Static Method");
	}
	abstract public void demo();
}

class A implements I{
	@Override
	public void demo() {
		System.out.println("Abstract Method");
	}
	
	public static void test() {
		System.out.println("Class A static method");
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I ref = new A();
		System.out.println("---using non static way---");
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println("---using static way---");
		System.out.println(I.a);
		System.out.println(I.b);
		
		I.test();
		ref.demo();
		
		//ref.test();
		
		A obj = (A) ref;
		obj.test();
	}

}
