package company;

public class Company {

//������� ����
	private double salary;						//�⺻��
	private double annualIncome;                //���ҵ�
	private double afterTaxAnnualIncome;		//���� ������ �⺻���� ��
	private double bonus;						//���ʽ�
	private double afterTaxBonus;				//���� ������ �� ���ʽ�����
	
	
	public Company(){
	}
	
	public Company(double salary) {            //�ܺο��� salary�� �޾Ƽ� �����ϰڴ�..
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