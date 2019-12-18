package WorkBook;

public class Account {

	private String account; // ���¹�ȣ
	private int balance; // �ܾ�
	private double interestRate; // ������

	public Account(String account, int balance, double interestRate) {

		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;

	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculatelnterest() {

		return balance * interestRate / 100;

	}

	public void deposit(int money) { // deposit�� return ���� �ʱ⶧���� void�� ���ش�
		balance = balance + money;
	}

	public void withdraw(int money) { // return ���� �ʱ⶧���� void�� ���ش�
		balance = balance - money;
	}

	public void print() {
		System.out.println("�������� : " + getAccount() + "�����ܾ� : " + getBalance());
		System.out.println("�������� : " + getAccount() + "�����ܾ� : " + getBalance());
		System.out.println("���� : " + getInterestRate());
	}
	
}