package oop.chap07.poly;
/*
 * 객체의 타입을 검사하고 작업할 수 있다.
 * instanceof연산자를 이용
 * 
 */

interface IA {

}

public class InstanceOfTest {
	public static void main(String[] args) {
	
		SubA obj = new SubA();
		
		//obj가 SuperA타입이라면 if블럭을 실행해라
		//-------------------------
		//SuperA의 하위냐 ?
		if(obj instanceof SuperA){
			System.out.println("SuperA타입이다.");               //obj는 SubA의 변수기 때문에 그 부모인 SuperA타입에 속한다.
			}else {
				System.out.println("SuperA타입아니다");
						
			}
	}

}
