package company;

public class CompanyTest {

	public static void main(String[] args) {	
		
		//Company의 salary가 double이고 입력받은 salary가 int형이므로 자동 casting된다.

		int salary = Integer.parseInt(args[0]);
		Company com = new Company(salary);
				
				System.out.println("연 기본급합 : "+ com.getIncome());
				
				System.out.println("세후 : "+ com.getafterTaxAnnualIncome());
				
				System.out.println("보너스 : "+ com.getBonus());
				
				System.out.println("보너스 세후 : "+ com.getAfterTaxBonus());

				System.out.println("연 지급액  합 : "+(com.getafterTaxAnnualIncome() + com.getAfterTaxBonus()));
		
	}
	

}