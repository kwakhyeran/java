package chap05;

public class ArrayExam01 {

	public static void main(String[] args) {

		int[] my = new int[10]; // 타입[] 변수이름 = new 타입[길이]
		my[2] = 100;
		my[3] = 200;
		my[5] = 300;

		for (int i = 0; i <= my.length - 1; i++) {
			System.out.println("int["+i+"] =" + my[i]);
		}

	}
}
