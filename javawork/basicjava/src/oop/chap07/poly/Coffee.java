package oop.chap07.poly;

public class Coffee extends Beverage {
	static int amount;

	public Coffee() {
	}

	public Coffee(String name) { // 생성자 형성
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

	// static멤버를 엑세스하기 위해서 static메소드를 정의해서 엑세스한다.
	public static int getAmount() {
		return amount;
	}

}