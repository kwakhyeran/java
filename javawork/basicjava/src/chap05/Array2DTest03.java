package chap05;

//2���� �迭�� ����� ������ �ʱ�ȭ�ϱ�
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
				};// int[][] myarr2 = new int[3][] ����
				// ������ �� �ٸ���.

		// myarr�� myarr2�� �迭�� �迭�� ����� ���� ����ϱ�

		for (int outer = 0; outer < myarr.length; outer++) {  
			for (int i = 0; i < 5; i++) {
				System.out.print(myarr[outer][i] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");

		for (int outer = 0; outer < myarr2.length; outer++) {   //[3][5]
			for (int i = 0; i < myarr2[outer].length; i++) {	// ��(outer)�� ���� �ٸ��� ������ �̸� ���� myarr2[outer].length�� �̿� 
			System.out.print(myarr2[outer][i] + "\t");
			}
			System.out.println("");
		}

	}
}