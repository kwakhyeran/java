package chap04;

//while�� ����
public class whileTest01 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		while (i <= 100) {
			sum = sum + i;

			if (i % 2 == 0) {
				sum1 = sum1 + i;

			} else {
				sum2 = sum2 + i;
			}
			i++;
		}
		System.out.println("�������� : " + sum);
		System.out.println("¦������ : " + sum1);
		System.out.println("Ȧ������ : " + sum2);
	}

}