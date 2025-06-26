package oops.multilevel;

public class FamilyDriver {

	public static void main(String[] args) {
		GrandChild refOfGrandChild = new GrandChild();
		System.out.println(refOfGrandChild.firstName);
		System.out.println(refOfGrandChild.lastName);
		System.out.println(refOfGrandChild.GrandChildName);
	}

}


