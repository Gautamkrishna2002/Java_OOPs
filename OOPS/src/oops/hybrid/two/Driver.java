package oops.hybrid.two;

public class Driver {
	
//Write a Java program to achieve Hybrid inheritance

	public static void main(String[] args) {
		
			Father ref1 = new Father();
			Father ref4 = new Son();
			Son ref5 = (Son) ref4;
			System.out.println(ref5.gfather());
			System.out.println(ref1.name);
			System.out.println(ref1.gmother());
			System.out.println(ref1.name);
		// TODO Auto-generated method stub
			
			Son ref2 = new Son();
			System.out.println(ref2.gfather());
//			System.out.println(ref2.name);
			
			Daughter ref3 = new Daughter();
			System.out.println(ref3.name);
			

	}

}
