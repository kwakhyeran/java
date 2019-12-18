package workbook74p;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {

	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);

	}

	@Override
	public void setResize(int size) {
		setWidth(getWidth() + size);

	}

	@Override
	public double getArea() {
		double area = 0.0;
		return ((double)getWidth()) * getHeight();
		
	}

}
