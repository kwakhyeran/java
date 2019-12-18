package chap04;

//while문 연습
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
		System.out.println("모든수의합 : " + sum);
		System.out.println("짝수의합 : " + sum1);
		System.out.println("홀수의합 : " + sum2);
	}

}