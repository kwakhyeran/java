package workbook67p;



public class Calulator {

	public double divide(int a, int b) {
		double result = 0.0;
	
		try {
			if(b==0) {
				throw new Exception("Exception�� �߻��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
			result = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;

	}
}
