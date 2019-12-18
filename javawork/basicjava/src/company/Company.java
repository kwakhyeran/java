package company;

public class Company {

//멤버변수 선언
	private double salary;						//기본급
	private double annualIncome;                //연소득
	private double afterTaxAnnualIncome;		//세금 공제후 기본급의 합
	private double bonus;						//보너스
	private double afterTaxBonus;				//세금 공제후 연 보너스의합
	
	
	public Company(){
	}
	
	public Company(double salary) {            //외부에서 salary를 받아서 적용하겠다..
		this.salary =salary;
	}
	
	public double getIncome() {
	
		annualIncome=salary*12;
		return annualIncome;
	}
	
	public double getafterTaxAnnualIncome() {
		afterTaxAnnualIncome= getIncome()*0.9;
		return afterTaxAnnualIncome;
	}
	
	public double getBonus() {
		bonus=salary*0.2*4;
		return bonus;
	}

	public double getAfterTaxBonus() {
		afterTaxBonus=getBonus()*0.945;
		return afterTaxBonus;
	}
	

	
}