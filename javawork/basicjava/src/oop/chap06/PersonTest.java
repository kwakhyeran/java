package oop.chap06;
//Person 클래스를 사용하는 클래스
public class PersonTest {

	public static void main(String[] args) {
	
		Person p1 = new Person("이은재","안산",27);     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다
				
		System.out.println("성명 :" + p1.getName()); //get작업
		System.out.println("주소 :" + p1.getAddr());
		System.out.println("나이 :" + p1.getAge());
		
		Person p2 = new Person("전성영","시흥",28);     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다
			
		System.out.println("성명 :" + p2.getName());
		System.out.println("주소 :" + p2.getAddr());
		System.out.println("나이 :" + p2.getAge());
	
	}
}
