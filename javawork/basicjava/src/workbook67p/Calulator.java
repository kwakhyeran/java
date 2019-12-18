package workbook67p;



public class Calulator {

	public double divide(int a, int b) {
		double result = 0.0;
	
		try {
			if(b==0) {
				throw new Exception("Exception이 발생했습니다. 다시 입력해주세요.");
			}
			
			result = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;

	}
}
