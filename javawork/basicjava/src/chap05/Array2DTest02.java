package chap05;

//2차원 배열의 선언과 생성
public class Array2DTest02 {

	public static void main(String[] args) {
		// 2차원 배열부터 배열이 참조하는 배열의 요소를 가각 다르게 정의할 수 있다.

		int[][] myarr = new int[3][]; // 3개의 행을 생성 (0 1 2) 생성
		myarr[0] = new int[3]; // 1행에는 4열의 배열을 생성
		myarr[1] = new int[2]; // 2행에는 3열의 배열을 생성
		myarr[2] = new int[1]; // 3행에는 2열의 배열을 생성

		for (int outer = 0; outer < myarr.length; outer++) {
			for (int i = 0; i < myarr[outer].length; i++) {
				System.out.print(myarr[outer][i] + "\t");
			}
		System.out.println();
		}

	}

}
