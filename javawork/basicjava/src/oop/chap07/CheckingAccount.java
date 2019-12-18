package oop.chap07;

public class CheckingAccount extends Account {
	private String account; // ���¹�ȣ
	private int balance;
	private String ownername;
	private String cardNo;

	public CheckingAccount() {
	}

	public CheckingAccount(String account, int balance, String ownername, String cardNo) {
		super(account, balance, ownername); // �θ�Ŭ�������� �����°�
		this.cardNo = cardNo;
	}

	public void pay(int amount, String cardNo) {
		if (this.cardNo.equals(cardNo) & this.getBalance() >= amount) { // ���ڿ��񱳴� ������equals�� �̿�
			// �������� ����
			this.withdraw(amount);
		} else {
			System.out.println("������ �Ұ��մϴ�");

		}
	}

}