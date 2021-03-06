package oop.chap06;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//   public
//   default
//   protected
//   private
//클래스를 정의할때 멤버변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
//public메소드를 통해서 접근할 수 있도록 구현한다.
public class Person { //person 이라는 클라스를 생성 : 인사관리 시스템
	
	private String name; //문자열 - String                   //클래스의 특성(이름 주소 나이)를 나타내는 데이터 
	private String addr; //문자 + 숫자 - String					   // - 멤버변수
	private int age; //숫자 - int

	//name은 public -> 접근 제한이 없다 = 다가능
	//addr은 default -> 같은 패키지만 가능
	//age는 private -> 같은 클래스만 가능               //이를 모드 private으로 선언하면 같은 클래스에서만 가능
	
	//모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정는 메소드와 값을 가져올 수 있는 메소드가 필요하다.
	//이런 역량을 하는 메소드를 정의하는 경우
	
	
	//name변수에 값을 설정하는 메소드(set의 리턴값은 void)
	//메소드명 : set + 멤버변수명(첫 글자를 대문자로 바꾼)
	// 			setName
	
	public Person(String name, String addr, int age) { // 이게 멤버변수-> test의 장동긴어 여기로 전달
		//System.out.println("매개변수 3개 생성자");	// 맴버변수(인스턴스변수, 객체변수)를 초기화
		this.name = name;
		this.addr = addr;
		this.age = age;
		
	}

	
	public void setName(String name) {  //setter메소드
		this.name = name;
	}
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	//메소드명 : get + 멤버변수명(첫 글자를 대문자로 바꾼)
	//		 getName
	public String getName() {
		return this.name;
	}

	public void setAddr(String addr) {  
		this.addr = addr;
	
	}
	public String getAddr() {
		return this.addr;
	}

	public void setAge(int age) {  
		this.age = age;
	
	}
	public int getAge(){
		return this.age;
	}
}
