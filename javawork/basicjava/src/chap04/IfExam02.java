package chap04;

import java.util.Scanner;

//������ ���̸� �޾Ƽ� ������ ���� ����ϱ�
//�Է°� :1,3������ 2,4�¿��� 
// 		���� - 1~19�� û�ҳ� 
//			  20�� ����
public class IfExam02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int score = key.nextInt(); // ����

		System.out.println("���̸� �Է��ϼ��� : ");
		int age = key.nextInt(); // ����

		if (score == 1 || score == 3) {
			if (age < 20) {
				System.out.println("û�ҳ� ����");
			} else {
				System.out.println("���� ����");
			}
		} else {
			if ((score == 2) || (score == 4)) {
				if (age < 20) {
					System.out.println("û�ҳ� ����");
				} else {
					System.out.println("���� ����");
				}
			}
		}
	}
} // Ctrl + shift + f �� ������ �ڵ��� ����ϰ� �������ش�.