package company;

public class CompanyTest {

	public static void main(String[] args) {	
		
		//Company�� salary�� double�̰� �Է¹��� salary�� int���̹Ƿ� �ڵ� casting�ȴ�.

		int salary = Integer.parseInt(args[0]);
		Company com = new Company(salary);
				
				System.out.println("�� �⺻���� : "+ com.getIncome());
				
				System.out.println("���� : "+ com.getafterTaxAnnualIncome());
				
				System.out.println("���ʽ� : "+ com.getBonus());
				
				System.out.println("���ʽ� ���� : "+ com.getAfterTaxBonus());

				System.out.println("�� ���޾�  �� : "+(com.getafterTaxAnnualIncome() + com.getAfterTaxBonus()));
		
	}
	

}