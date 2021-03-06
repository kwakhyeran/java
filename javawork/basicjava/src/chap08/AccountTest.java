package chap08;

public class AccountTest {
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		account.setAccount("441-0290-1203");      //account메소드.  setAccount클래스
		account.setBalance(500000);
		account.setInterestRate(7.3);
		System.out.println("계좌정보:"+account.getAccount()
					+" 현재잔액:"+account.getBalance());
	
		try {
		account.deposit(-5);			 //try에서 문제발생시 catch on
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		account.withdraw(10000);
		}catch(Exception e) {
			
			System.out.println("금액이 0보다 적거나 현재잔액보다 많습니다.");
		}
		
		System.out.println("계좌정보:"+account.getAccount()
		+" 현재잔액:"+account.getBalance());
		System.out.println("이자:"+account.calculateInterest());
	}
}
