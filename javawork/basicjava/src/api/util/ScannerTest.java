package api.util;

import java.util.Scanner;

//scannerŬ����(API)�� �����
//=> ���α׷� ���� �߰��� ���� �Է¹��� �� �ִ� ��ɵ��� �����ϴ� Ŭ����

public class ScannerTest {

	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);     //Scanner Ŭ������ �����ϰ� �̸� key�� �Ҵ��Ѵ�
	//��ĳ�ʴ� Ű���带 �ޱ����� �޼ҵ�
	System.out.println("���ڿ��� �Է��ϼ��� : ");
	
	String data = key.next();  //next�� �ܼ�Ű����� �޴°�,
	//key�� ��ĳ�� Ŭ������ �Ҵ��߱⶧���� �� �ȿ� �޼ҵ��� next�� Ȱ���ϴ�..
	// next�� �������͵��� �ҷ�����Ű�� �޼ҵ�
	System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);
	
	System.out.print("���ڸ� �Է��ϼ��� :");
	
	int intVal = key.nextInt();
	
	System.out.println("�Է¹�������"+intVal);
	}
}
