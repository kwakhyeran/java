package chap08;

public class Test {

	public static void main(String[] args) {

		ThrowsTest02 obj = new ThrowsTest02();
		int num = obj.test(100, 0);
		System.out.println("��� :" + num);

		ThrowsTest02 obj2 = new ThrowsTest02();
		int num2 = 0;
		int inputnum = 0;
		try {
			num2 = obj2.test(100, 0);
		} catch (ArithmeticException e) {
			if (inputnum % 2 == 0) {
				num2 = 100000;
			} else {
				num2 = 0;
			}

		}

		System.out.println("��� :" + num);

	}

}
