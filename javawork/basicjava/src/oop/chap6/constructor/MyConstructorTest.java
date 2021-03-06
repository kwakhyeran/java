package oop.chap6.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {

		// 기본생성자를 호출해서 객체를생성한 후 setter메소드를 이용해서 값 초기화하기
		MyConstructor obj = new MyConstructor();

		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");
		// 초기화를 시킨다.

		System.out.println(obj.getName() + "," + obj.getId() + "," + obj.getPass());
		// 매개변수가 있는ㄴ 생성자 매소드를 호출하면서 값을 초기화하기

		// MyConstructor(String,String,String)
		MyConstructor obj2 = new MyConstructor("원빈", "bin", "4421"); // 매개변수를 적으면 다른파일에 가서 정리된다음 다시 오는거
		System.out.println(obj2.getName() + "," + obj2.getId() + "," + obj2.getPass());

		MyConstructor obj3 = new MyConstructor("원빈", "bin", "4421", "짱"); // 매개변수를 적으면 다른파일에 가서 정리된다음 다시 오는거
		System.out.println(obj3.getName() + "," + obj3.getId() + "," +
		obj3.getPass() + obj3.getNickname());

		
		MyConstructor obj4 = new MyConstructor("원빈", "bin", "4421", "짱","경기도"); // 매개변수를 적으면 다른파일에 가서 정리된다음 다시 오는거
		System.out.println(obj4.getName() + "," + obj4.getId() + "," +
		obj4.getPass() + ","+obj4.getNickname() + ","+obj4.getAddr());
		
		
		MyConstructor obj5 = new MyConstructor("원빈", "bin", "4421", "짱","경기도",4); // 매개변수를 적으면 다른파일에 가서 정리된다음 다시 오는거
		System.out.println(obj5.getName() + "," + obj5.getId() + "," +
		obj5.getPass() + ","+obj5.getNickname() + ","+obj5.getAddr()+ ","+obj5.getPoint());
		
		
	}
}

/*
 * 
 * 생성자 [규칙] 1.생성자 메소드명은 클래스명과 대소문자 까지 정확하기 동일한 이름으로 정의해야한다. => 2. 생성자 메소드를 정의하지
 * 않으면 컴파일러가 기본생성자를 제공한다 => 기본생성자 : 매개변수가 없는 생성자 => 생성자 메소드를 개발자가 정의하면 컴파일러가
 * 기본생성자를 제공하지 않는다. => 처리되는 일이 없다고 하더라도 무조건 기본생성자는 정의해야 한다. << 이거중요
 * 
 * 3. 생성자 메소드도 일반 메소드 처럼 매개변수를 정의하고 외부에서 값을 전달받아 사용할 수 있다. =>주로 객체에 정의된 멤버변수의 값을
 * 초기화하는 작업 4. 생성자 매소드도 일반 메소드 처럼 오버로딩을 허용한다. 5. 생성자 메소드 내부에서 다른 생성자의 메소드를 호출할 수
 * 있다. =>this(매개변수...) => 반드시 첫 번째 문장에서 호출해야 한다.
 * 
 */