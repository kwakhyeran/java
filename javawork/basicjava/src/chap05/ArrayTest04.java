package chap05;

import java.util.Random;

//�迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϱ�
public class ArrayTest04 {

	public static void main(String[] args) {

		int[] myarr = { 10, 20, 30, 40, 50 }; // �迭�� �����ϰ� ������ �迭�� ���� ����
		// �̰� �� ���� ������

		System.out.println("�迭�� ����� ���� : " + myarr.length);

		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		// �ڹپ�� ��� ����, ����, �ʱ�ȭ

		int[] myarr2 = { 10, 20, 30, 40, 50 };
		System.out.println("�迭����� ���� : " + myarr2.length);
		for (int i = 0; i < myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}

		// ������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		String[] strArr = { new String("java"), // strArr�� �迭�� ������ 3�� �����ϰ� ������ �ڸ��� ���� ����
				new String("servlet"), new String("spring") };
		System.out.println("�������迭����� ���� : " + strArr.length);
		// ������ �迭�̱� ������ ��ü�� �Ҵ�Ȱ��� �ּҰ��� ��µǾ�� �ϳ�
		// String�� ����
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		Random[] randArr = { new Random(), new Random() };
		// randArr��
		for (int i = 0; i < randArr.length; i++) {
			System.out.println("�迭��� =>" + randArr[i]);
		}

		String[] strArr2 = { "AAAAAAAA", "BBBBBBBBBB", "CCCCCCCCC", "DDDDDDDDDD" };
		System.out.println("���� : " + strArr2.length);

		for (int i = 0; i < strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}

	}
}
