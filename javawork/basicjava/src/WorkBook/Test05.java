package WorkBook;

public class Test05 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);

		Calc calc = new Calc(); // ClacŬ������ ������ �� Ŭ������ calc�� ���

		int sum = calc.calcSum(num1, num2, num3, num4); // ���� calc�� �Լ��� �̿�
		double avg = (double) sum / args.length;

		System.out.println("�� - > " + sum);
		System.out.println("��� - > " + avg);
		if (avg > 100 | avg < 0) {
			System.out.println("�߸��Է�");
		} else {
			if (avg >= 90) {
				System.out.println("A����");
			} else if (avg >= 70) {
				System.out.println("B����");
			} else if (avg >= 50) {
				System.out.println("C����");
			} else if (avg >= 30) {
				System.out.println("D����");
			} else {
				System.out.println("F����");
			}
		}
	}
}
