package WorkBook;

public class Test05 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);

		Calc calc = new Calc(); // Clac클래스를 생성후 이 클래스를 calc라 명명

		int sum = calc.calcSum(num1, num2, num3, num4); // 명명된 calc의 함수를 이용
		double avg = (double) sum / args.length;

		System.out.println("합 - > " + sum);
		System.out.println("평균 - > " + avg);
		if (avg > 100 | avg < 0) {
			System.out.println("잘못입력");
		} else {
			if (avg >= 90) {
				System.out.println("A학점");
			} else if (avg >= 70) {
				System.out.println("B학점");
			} else if (avg >= 50) {
				System.out.println("C학점");
			} else if (avg >= 30) {
				System.out.println("D학점");
			} else {
				System.out.println("F학점");
			}
		}
	}
}
