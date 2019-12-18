package oop.chap07.poly;

/*인터페이스 연습
 * <<인터페이스>>
 * 
 * =>추상메소드(상수도 포함)만 정의하는 특별한 클래스
 * 
 * 1.인터페이스튼 interface키워드를 이용해서 정의
 * 2.인터페이스는 추상메소드만 정의하는 특별한 클래스
 * 	-public abstract이 생략가능
 * 	-상속을 받으면 자동으로 추가된다.
 * 3.인터페이스가 인터페이스로 상속할수 있다.(extends 이용)
 * 4.클래스가 인터페이스를 상속할 수 있다.
 * 	-인터페이스를 상속받는 클래스가 이미 다른클래스를 상속하는 경우에 extends를 먼저 정의하고 implements로 정의해야한다
 * 
 * 5.인터페이스는 여러개를 상속할 수 있다. 즉, 다중상속이 가능하다.
 * 	implements 뒤에서 인터페이스를 정의할 때   ,로 구분해서 나열
 * 
 * 6. 클래스와 인터페이스들을 상속받는 하위클래스는 모든 클래스와 인터페이스의
 *    하위로 인식된다.(상속받는 모든 클래스, 인터페이스의 하위타입이 된다.)
 *    
 *    
 */


interface InterA{
	public abstract void test(); 
		void display(int num);
		
}
interface InterB extends InterA{
	void show();
}

interface InterC{
	
}

class SuperA{
	
}

//SubA는 SuperA, InterB, InterC의 하위
class SubA extends SuperA implements InterB,InterC{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	} 
	
}

public class InterfaceTest01 {
	public static void main(String[] args) {
	SuperA obj1 = new SubA();
	InterA obj2 = new SubA();
	InterB obj3 = new SubA();
	InterC obj4 = new SubA();          //SubA는 가장 밑의 자손이다... 그래서 SuperA 
									   //등등 총 4가지 부모를 이용해 참조변수를 생성할수있다.
	
	
	}

}
