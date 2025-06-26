package oops.abstractClass;

class C{
	static int a = 10;
	int b = 20;
	
	public static void test() {
		System.out.println("Static Method");
	}
	
	public void demo() {
		System.out.println("Non Static Method");
	}
	
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	
	public C() {
		System.out.println("Constructor");
	}
}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		System.out.println(C.a);
		C.test();
		C ref = new C();
		System.out.println(ref.b);
		ref.demo();
		System.out.println("Main End");
		
	}

}
