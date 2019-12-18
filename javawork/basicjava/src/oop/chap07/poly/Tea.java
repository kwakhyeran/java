package oop.chap07.poly;

public class Tea extends Beverage {
	 static int amount;

	public Tea() {
	}
	public Tea(String name) { // 생성자 형성
		super(name);
		amount++;
		//주문되는 음료의 가격을 계산
		calcPrice();
	}

	public void calcPrice() {
		if (getName().equals("lemonTea")) {
			setPrice(1500);
		}
		if (getName().equals("ginsengTea")) {
			setPrice(2000);
		}
		if (getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}