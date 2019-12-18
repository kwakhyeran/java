package workbook74p;

public abstract class Shape { // 조상클래스

	private int width;              //private로 3개 변수를 정의
	private int height;
	private String colors;

	public Shape() {           //메소드의 초기화

	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;            //super의 의미는  이 메소드가 조상클래스란말
		this.height = height;
		this.colors = colors;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public abstract double getArea();         //넓이 구하기 - 자식클래스에서 바꿀예정 - 오버레이딩 

}
