package chap08;

public class AccountTest {
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		account.setAccount("441-0290-1203");      //account�޼ҵ�.  setAccountŬ����
		account.setBalance(500000);
		account.setInterestRate(7.3);
		System.out.println("��������:"+account.getAccount()
					+" �����ܾ�:"+account.getBalance());
	
		try {
		account.deposit(-5);			 //try���� �����߻��� catch on
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		account.withdraw(10000);
		}catch(Exception e) {
			
			System.out.println("�ݾ��� 0���� ���ų� �����ܾ׺��� �����ϴ�.");
		}
		
		System.out.println("��������:"+account.getAccount()
		+" �����ܾ�:"+account.getBalance());
		System.out.println("����:"+account.calculateInterest());
	}
}