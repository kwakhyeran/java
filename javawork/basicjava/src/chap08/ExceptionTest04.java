package chap08;

import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		try {
			System.out.print("�迭�� ��� ������ �Է��ϼ���:");
			int size = key.nextInt();
			String[] arr = new String[5];
			
			System.out.println("step01");
			
			if (size > 3) {
				arr[1] = new String("java");       //���ڿ��� ���� : 4 
				}System.out.println(arr[1].length());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ��Ҹ� �߸��׼���...");
		}catch (NullPointerException e) {
			System.out.println("���Դϴ�.");
		}catch (Exception e) {
			System.out.println("�����Դϴ�.");
		}finally {          //������ ����
			System.out.println("�ݵ�� ������ ���ɹ� - �����ǽ���");

		}

	}
}