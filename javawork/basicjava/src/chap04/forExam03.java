package chap04;

public class forExam03 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 100; i++) {
			sum = i + sum;

			if (i % 2 == 0) {
				sum1 = i + sum1;
			} else {
				sum2 = i + sum2;
			}

		}
		System.out.println(" 1���� 100���� �� :" + sum);
		System.out.println(" 1���� 100���� Ȧ���� :" + sum1);
		System.out.println(" 1���� 100���� ¦���� :" + sum2);

	}

}