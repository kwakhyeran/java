package chap05;

public class Array2DExam02 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 },
				{ 30, 30, 30, 30, 30 }
				};
		int sum = 0;
		float avg = 0;
		int count = 0;
		for (int row = 0; row < arr2.length; row++) {
			for (int i = 0; i < arr2[row].length; i++) {
				sum = sum + arr2[row][i];
				count++;
			}
		}
		System.out.println(sum);
		avg = sum / (float) count;
		System.out.println(avg);
	}

}