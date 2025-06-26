package oops.practiceproblem;

public class Rectangle implements Resizeable {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void resizeWidth(int width) {
		this.width = width;
			
	}
	
	@Override
	public void resizeHeight(int height) {
		// TODO Auto-generated method stub
		 this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public void toPrint(int width, int height) {
	System.out.println(width);
	System.out.println(height);
	}

}
