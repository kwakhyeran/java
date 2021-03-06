package WorkBook;

public class Account {

	private String account; // 계좌번호
	private int balance; // 잔액
	private double interestRate; // 이자율

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

	public void deposit(int money) { // deposit은 return 받지 않기때문에 void로 해준다
		balance = balance + money;
	}

	public void withdraw(int money) { // return 받지 않기때문에 void로 해준다
		balance = balance - money;
	}

	public void print() {
		System.out.println("계좌정보 : " + getAccount() + "현재잔액 : " + getBalance());
		System.out.println("계좌정보 : " + getAccount() + "현재잔액 : " + getBalance());
		System.out.println("이자 : " + getInterestRate());
	}
	
}
