package oop.chap07;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
	//API의 static 메소드 접근하기
	// => static멤버는 인스턴스의 소유가 아니므로 무조건 클래스명으로 접근한다
	
		//static메소드  - new를 굳이 올리지 않아도 static은 이미 클래스에 올려져 있기 때문에 그냥 사용한다.
		System.out.println(Math.PI);                    //이경우에는 Math 클래스를 사용해 static을 올린다
 		System.out.println(Math.random());
	 
		
		//non-static메소드(일반메소스-인스턴스메소드)  - new를 올려 변수를 생성한뒤 사용한다.
		//객체생성을 한 후에 참조변수를 통해서 엑세스
 		Random rand = new Random();
		System.out.println(rand.nextInt());	
	}
	
	

}
