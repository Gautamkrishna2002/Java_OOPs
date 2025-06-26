package oops.heirarchial;

public class FamilyDriver {

	public static void main(String[] args) {
		OlderChild refOfOlderChild = new OlderChild();
		System.out.println(refOfOlderChild.OlderSiblingfirstName);
		System.out.println(refOfOlderChild.lastName);
		
		YoungerSibling refOfYoungerSibling = new YoungerSibling();
		System.out.println(refOfYoungerSibling.YoungerSiblingfirstName);
		System.out.println(refOfYoungerSibling.lastName);
		
	}

}


