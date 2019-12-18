package oop.chap07;

public class IceCream extends Dessert {

	private int cal;

	public IceCream() {
	}

	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);   //�θ�Ŭ�������� �޾ƿ�
		this.cal = cal;    					//���ο� 1���� �߰� > �������̵�
	}

	public static void print() {				//�׽�Ʈ���� IceCream.print(); 
												//IceCreamŬ�������� print()�޼ҵ带 ���
		System.out.println("============================");
		System.out.println("�ֹ��׸� " + "\t" +"���� " + "\t" +"���� " + "\t" +"Į�θ�");
		System.out.println("============================");

	}
	public void printProductInfo() {
		System.out.println(getProductName() +"\t" + getPrice() + "\t" +getCount() + "\t" +getCal() + "Kcal+");
	}
	
	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

}