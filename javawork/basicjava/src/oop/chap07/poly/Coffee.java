package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount;

	public Coffee() {
	}

	public Coffee(String name) { // ������ ����
		super(name);
		amount++;
	}

	@Override
	public void calcPrice() {
		if (getName().equals("Americano")) {
			setPrice(1500);
		}
		if (getName().equals("CafeLatte")) {
			setPrice(2500);
		}
		if (getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}

	// static����� �������ϱ� ���ؼ� static�޼ҵ带 �����ؼ� �������Ѵ�.
	public static int getAmount() {
		return amount;
	}

}