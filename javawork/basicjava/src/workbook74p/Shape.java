package workbook74p;

public abstract class Shape { // ����Ŭ����

	private int width;              //private�� 3�� ������ ����
	private int height;
	private String colors;

	public Shape() {           //�޼ҵ��� �ʱ�ȭ

	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;            //super�� �ǹ̴�  �� �޼ҵ尡 ����Ŭ��������
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

	public abstract double getArea();         //���� ���ϱ� - �ڽ�Ŭ�������� �ٲܿ��� - �������̵� 

}
