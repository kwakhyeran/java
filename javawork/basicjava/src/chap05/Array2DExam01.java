package chap05;

public class Array2DExam01 {

	public static void main(String[] args) {
		int[][] myarr = new int[5][5]; // 2���� �迭 ����
		int value = 1;
		for (int outer = 0; outer < myarr.length; outer++) { // myarr.lengtg�� ��
			for (int i = 0; i < myarr[outer].length; i++) { // myarr[outer].length�� ��
				myarr[outer][i] = value;
				value++;
			}
		}

		for (int outer = 0; outer < myarr.length; outer++) { // myarr.lengtg�� ��
			for (int i = 0; i < myarr[outer].length; i++) { // myarr[outer].length�� ��
						if(i==outer) {
							System.out.print("*" +"\t");
						}
				System.out.print(myarr[outer][i] + "\t");

			}
			System.out.println();
		}
	}
}
