package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java","oracle","jdbc","html5","css","java"};
		ArrayList<String> list = changeData(arr);
		//��ȯ�Ǿ� ���ϵ� ArrayList�� ����� ���� ������ ����ϱ�]
		/*
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		int size = list.size();
		for(int i =0;i<size;i++) {
			System.out.println("���: "+list.get(i));
		}
		System.out.println("=========================");
		for(String data:list) {
			System.out.println("���: "+data);
		}
	}
	public static ArrayList<String> changeData(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		//String st =null;
		for(int i = 0;i<arr.length;i++) {
			//st = arr[i];
			//list.add(st);	
			list.add(arr[i]);
		}
		return list;
	}
}
