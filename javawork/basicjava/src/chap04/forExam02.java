package chap04;

import java.util.Scanner;

public class forExam02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		// Scanner Ŭ������ key�� �Ҵ��ϰ�
		System.out.println("�� : ");
		int a = key.nextInt(); 
		
		// ��ĳ�� Ŭ������ �Ҵ�� key����
		// ���ڸ� ������ nextInt �޼ҵ带 a�� �Ҵ��Ѵ�
		for (int i = 1; i <= 9; i++) {

			System.out.println(a + " * " + (i) + " = " + (a * i));

		}
	}
}
