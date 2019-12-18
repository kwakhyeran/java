package chap05;

//2차원 배열의 선언과 생성과 초기화하기
public class Array2DTest03 {

	public static void main(String[] args) {

		int[][] myarr = {
					{ 1, 2, 3, 4, 5 }, 
					{ 6, 7, 8, 9, 10 },
					{ 11, 12, 13, 14, 15 }, 
							};// int[][] myarr = new
																							// int[3][5]

		int[][] myarr2 = {
				{ 1, 2, 3 }, 
				{ 6, 7, 8, 9 }, 
				{ 11, 12, 13, 14, 15 }, 
				};// int[][] myarr2 = new int[3][] 열의
				// 갯수는 다 다르다.

		// myarr와 myarr2의 배열의 배열에 저장된 값을 출력하기

		for (int outer = 0; outer < myarr.length; outer++) {  
			for (int i = 0; i < 5; i++) {
				System.out.print(myarr[outer][i] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");

		for (int outer = 0; outer < myarr2.length; outer++) {   //[3][5]
			for (int i = 0; i < myarr2[outer].length; i++) {	// 열(outer)이 각각 다르기 때문에 이를 위하 myarr2[outer].length를 이용 
			System.out.print(myarr2[outer][i] + "\t");
			}
			System.out.println("");
		}

	}
}
