package chap08;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("�����Է�:");
		int num = key.nextInt();
		try {
			if (num % 2 == 1) {
				// ����ڰ� ������ �������� ������Ȳ
				throw new MyException("Ȧ���� �Է��߽��ϴ�.");  // 
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}