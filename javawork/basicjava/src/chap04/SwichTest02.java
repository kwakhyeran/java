package chap04;

import java.util.Scanner;

// Switch ���� - �⺻����
// Switch���� Ư���� Ȱ�� 
public class SwichTest02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.print("�ֹι�ȣ�� �Է��Ͻÿ� : ");
		int ssn = key.nextInt();

		switch (ssn) {
		// switch���� true of false�� �ƴ϶� ���� ���� ����� ����
		case 1:
		case 3:
			System.out.println("����");
			break;
	
		case 2:
		case 4:
			System.out.println("����");
			break;
	
		default:
			System.out.println("��Ÿ");
			break;
		}

	}

}