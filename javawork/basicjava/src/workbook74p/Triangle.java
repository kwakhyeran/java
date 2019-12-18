package workbook74p;

public class Triangle extends Shape implements Resize{
	
	public Triangle() {
		
	}

	public Triangle(int width, int height, String colors) {
		super(width,height,colors);
		
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);       //set
	}

	@Override
	public double getArea() {
		double area=0.0;
		return ((double)getWidth()*getHeight())/2; 
	}	
	
	
}


