package oops.hybrid;

public class FamilyDriver {

	public static void main(String[] args) {
		ChildOfParent_Two refOfChild = new ChildOfParent_Two();
		Parent_One refOfParentOne = new Parent_One();
		System.out.println(refOfChild.GreatGrandFather);
		System.out.println(refOfChild.GrandFather);
		System.out.println(refOfParentOne.ParentOne);
		System.out.println(refOfChild.ParentTwo);
		System.out.println(refOfChild.Child);
		

	}

}
