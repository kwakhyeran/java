package chap04;

public class GuGu {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				int sum = j * i;
				System.out.print(j + "*" + i + "=" + sum + "\t");

			}
			System.out.println();
		}
	}

}
