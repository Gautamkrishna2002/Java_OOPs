package oops.abstractClass;


abstract class A{
	abstract public void test();
}

class B extends A{
	@Override
	public void test() {
		System.out.println("Abstract Class");
	}
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref = new B();
		ref.test();

	}

}
