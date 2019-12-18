package WorkBook;

public class AccountTest {
	public static void main(String[] args) {

		Account account = new Account("442-4657132",500000,10);

		System.out.println("계좌정보 : " + account.getAccount() + "현재잔액" + account.getBalance());
		account.deposit(20000);

		System.out.println("계좌정보 : " + account.getAccount() + "현재잔액" + account.getBalance());

		System.out.println("이자 : " + account.calculatelnterest());

	}
}
