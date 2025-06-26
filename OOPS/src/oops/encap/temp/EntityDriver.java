package oops.encap.temp;

public class EntityDriver {

	public static void main(String[] args) {
		Entity entity = new Entity();
		System.out.println(entity.getAttribute());
		entity.setAttribute("Gautam");
		System.out.println(entity.getAttribute());

	}

}
