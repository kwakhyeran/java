package oop.chap6.constructor;

public class Test06{

	public static void main(String[] args) {
		
		Student stu1 = new Student("kim",100,90,95,64);     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다

		Student stu2 = new Student("lee",62,43,56,31);     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다
			
		Student stu3 = new Student("park",56,24,75,87);     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다
		
		stu1.print();
		stu2.print();
		stu3.print();
		
		/*
		System.out.println("Kim의 평균 :"+ stu1.getAvg() + "학점 :"+stu1.getGrade());
		System.out.println("lee의 평균 :" + stu2.getAvg()+ "학점 :"+stu2.getGrade());
		System.out.println("park의 평균 :" + stu3.getAvg()+ "학점 :"+stu3.getGrade());
*/
		

}}
