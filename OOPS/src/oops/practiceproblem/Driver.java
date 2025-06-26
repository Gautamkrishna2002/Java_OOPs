package oops.practiceproblem;

public class Driver {
	
//Write a Java Program to create an interface Resizeable with methods resizeWidth(int width) and resizeHeight(int height) that allow object to be resized. Create Rectangle class that implements the Resizeable Interface and implements the resize methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(12,12);
		
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		
		r.resizeWidth(30);
		r.resizeHeight(15);
		
//		System.out.println(r.getWidth());
//		System.out.println(r.getHeight());
		
		r.toPrint(0, 0);

	}

}
