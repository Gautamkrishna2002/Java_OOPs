package oops.hybrid.two;

public class Father implements GrandFather, GrandMother {
	
	
@Override
	public String gfather() {
	String name = "My GrandFather";
	return name;
}
	public String gmother() {
		String name = "My GrandMother";
		return name;
	}
	String name = "Father";
}
