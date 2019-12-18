package oop.chap07;

public class Dessert {
	private String productName;
	private int price;
	private int count;
	private int TotalPrice;

	public Dessert() {
	}

	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}

	public int TotalPrice(int price, int count) {
		TotalPrice = price * count;
		return TotalPrice;
	}

	public static void print() {

		System.out.println("============================");
		System.out.println("�ֹ��׸� " +"\t" + "���� " +"\t" + "���� ");
		System.out.println("============================");

	}

	public void printProductInfo() {				//void�� �ִ� ������ ���ϰ��� �������� �ʾƼ�
		System.out.println(getProductName()+"\t" + getPrice() +"\t" + getCount());

	}
	
	public int getTotalPrice(){
		return price*count;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

}
