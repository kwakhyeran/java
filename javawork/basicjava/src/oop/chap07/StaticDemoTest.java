package oop.chap07;
//static으로 선언한 변수는 인스턴스의 고유값을 저장하는 인스턴스 변수가 아니므로
//인스턴스변수로 접근할 수 없다.
//클래스 명으로 접근해야합니다.
public class StaticDemoTest {

	public static void main(String[] args) {
		
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num + ","+StaticDemo.staticNum); //클래스명인 StaticDemo로 접근
	
		StaticDemo obj2 = new StaticDemo("obj2");          
		obj2.display();
		System.out.println(obj2.num + ","+StaticDemo.staticNum);
	
		StaticDemo obj3 = new StaticDemo("obj3");
		obj3.display();
		System.out.println(obj3.num + ","+StaticDemo.staticNum);
	
	}

}
