package WorkBook;

public class AccountTest {
	public static void main(String[] args) {

		Account account = new Account("442-4657132",500000,10);

		System.out.println("�������� : " + account.getAccount() + "�����ܾ�" + account.getBalance());
		account.deposit(20000);

		System.out.println("�������� : " + account.getAccount() + "�����ܾ�" + account.getBalance());

		System.out.println("���� : " + account.calculatelnterest());

	}
}
