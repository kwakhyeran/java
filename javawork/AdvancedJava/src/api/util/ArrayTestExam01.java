package api.util;

import java.util.ArrayList;

public class ArrayTestExam01 {

	public static void main(String[] args) {
		//79,55,100,98,99�� ArrayList�� ��� ������ ����� ����ϼ���
		//[�������]
		//���� : ___
		//��� : ___
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(79);
		list.add(55);
		list.add(100);
		list.add(98);
		list.add(99);
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		System.out.println("���� : "+sum);
		System.out.println("��� : "+(sum/list.size()));
		

	}

}
