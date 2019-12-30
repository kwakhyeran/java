package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
		String[] arr = {"java","oracle","jdbc","html5","css","java"};
		ArrayList<String> list = changeData(arr);
		//변환되어 리턴된 ArrayList에 저장된 값을 꺼내서 출력하기]
		/*
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		*/
		int size = list.size();
		for(int i =0;i<size;i++) {
			System.out.println("요소: "+list.get(i));
		}
		System.out.println("=========================");
		for(String data:list) {
			System.out.println("요소: "+data);
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
