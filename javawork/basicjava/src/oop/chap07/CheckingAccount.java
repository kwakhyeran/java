package oop.chap07;

public class CheckingAccount extends Account {
	private String account; // 계좌번호
	private int balance;
	private String ownername;
	private String cardNo;

	public CheckingAccount() {
	}

	public CheckingAccount(String account, int balance, String ownername, String cardNo) {
		super(account, balance, ownername); // 부모클래스에서 가져온거
		this.cardNo = cardNo;
	}

	public void pay(int amount, String cardNo) {
		if (this.cardNo.equals(cardNo) & this.getBalance() >= amount) { // 문자열비교는 무조건equals를 이용
			// 지블가능 조건
			this.withdraw(amount);
		} else {
			System.out.println("지불이 불가합니다");

		}
	}

}
