package oops.Objext.hash;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of Main");
		Hash ref = new Hash();
		System.out.println(ref);
		System.out.println(ref.hashCode());
		System.out.println(Integer.toHexString(ref.hashCode()));
		
		Hash ref2 = new Hash();
		System.out.println(ref2);
		System.out.println(ref2.hashCode());
		System.out.println(Integer.toHexString(ref2.hashCode()));
		System.out.println("End of Main");

	}

}
