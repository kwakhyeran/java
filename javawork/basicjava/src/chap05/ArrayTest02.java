package chap05;

import java.util.Random;
import java.util.Scanner;

//������ �迭���� ����ϱ�
public class ArrayTest02 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] randArr = new Random[5]; //randArr�� �迭�� 5���� ���� 
		Scanner[] keyArr = new Scanner[100];

		// ������ �迭������ �ʱⰪ�� null
		// null�� �ƹ��͵� �������� �ʴ´ٴ� �ǹ� -> �׷��� �������� ���� �����ؾ���
		System.out.println(strArr[0]);
		System.out.println(randArr[0]);
		System.out.println(keyArr[0]);

		// ������ �迭�� ����� ������ �ʱ�ȭ , �⺻���� ���� ������ְ� �������� �ּҰ� ������ִ�.
		// �� ��� ������ �ּҿ� ���� ���� �����ؾ��Ѵ�
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HRML5");
		System.out.println(arr[0]);
		// randArr�� �ʱ�ȭ
		randArr[0] = new Random();       //randArr�� �迭 0�� 1�� ���������� ����->null���� �ƴ� ���� ���´�.
		randArr[1] = new Random();
	
		for(int i=0;i<randArr.length;i++) {//randArr.length������ randArr�� �迭���̸� �˼��ִ�.
			System.out.println(randArr[i]);
		}
	}

}
