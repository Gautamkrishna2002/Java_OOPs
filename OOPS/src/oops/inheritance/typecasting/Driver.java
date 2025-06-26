package oops.inheritance.typecasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting
		Animal animal = new Animal();
		System.out.println(animal.type);
	
		//downcasting
		Animal animal1 = new Dog();
		Dog dog = (Dog) animal1;
		System.out.println(dog.type);
		
		
		Animal animal2 = new Cat();
		Cat cat = (Cat) animal2;
		System.out.println(cat.type);
		
		

	}

}
