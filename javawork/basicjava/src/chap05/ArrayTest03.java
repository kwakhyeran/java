package chap05;

//�迭 �������ϱ�
public class ArrayTest03 {

	public static void main(String[] args) {
		int[] myarr = new int[5];
		// �⺻������ Ÿ�� �̸��� int , ���� �̸��� myarr, ����(��)�� 5���� ����
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		// �迭�� ����� ũ�⸦ ���
		// length�� �迭�� ����� �����ϰ� �ִ� �⺻ ����(�ڵ����� ������)
		System.out.println("�迭�� ����� ����" + myarr.length);
		System.out.println("==================");

		for (int i = 0; i <= myarr.length - 1; i++) {
			System.out.println(myarr[i]);
		}
		// length�� -1�� ������ : 0 �� �����ϱ� ������

	}
}