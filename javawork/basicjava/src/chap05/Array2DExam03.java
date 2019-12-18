package chap05;

public class Array2DExam03 {
	public static void main(String[] args) {

		System.out.println("입력 예1 : " + args[0]);
		int num1 = Integer.parseInt(args[0]);
		// args를 int형으로 변환하는 과정

		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			
			if (i % num1 == 0) {
				sum += i;
			}
			if (i % num1 == 0) {
				System.out.print("+" + i);
			}

		}

		System.out.println("=" + sum);
	}

}
