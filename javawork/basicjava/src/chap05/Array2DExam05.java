package chap05;

import java.util.Random;

public class Array2DExam05 {

	public static void main(String[] args) {

		int[] arr3 = new int[5];

		Random rnd = new Random();
		int sum = 0;
		float avg = 0;
		int count = 0;

		for (int i = 0; i < 5; i++) {

			int a = rnd.nextInt(10) + 1;
			System.out.print(a + "\t");

			count++;
			sum = sum + a;
		}
		System.out.print("\n");
		System.out.print("sum = " + sum + "\n");

		avg = (float) sum / count;

		System.out.print("avg = " + avg);

	}

}
