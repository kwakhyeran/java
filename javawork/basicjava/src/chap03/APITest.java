package chap03;  //chap03 폴더를 생성하고 이 안에 APITest.class를 저장한다.

// java.lang패키지만 기본으로 인식하므로
import java.io.File;
import java.util.Random;

				 //다른 패키지의 존재하는 클래스를 사용하는 경우 어떤 패키지에 있는지
				 //인식시키는 작업을 해야한다
					//이건 io클래스 모든걸 인식시킨거
//import java.util.*;//* 이건 모든 클래스 인식시키기
//API사용하기 - 참조형 변수선언


public class APITest {
	
	public static void main(String[] args) {
		//1.API에서 제공하는 클래스를 자바 프로그램 안에서 사용하기 위해 메모리에
		//	올리는 작업 - JVM이 인식하는 작업 공간에 할당
		
		//사용할 글래스명 변수 = new 사용할 클래스명();
		//----------
		// 타입으로 사용된다.
		
		//new를 사용해 메모리에 저장을 시키고 
		String str = new String();  //str같은경우에는 아무거나 써도됨
		StringBuffer sb = new StringBuffer();
		File file = new File("test.txt");
		Random rand = new Random();
		//ArrayList list = new ArrayList();
		
		//2. 객체(클래스를 사용하기 위해 메모리에 올려 놓은것)의 매소드 사용하기
		//		->인스턴스라고함
		String str2 = new String("java programming");
		char returnVal = str2.charAt(1); //charAt의 실행결과가 char타입이므로
		System.out.println("실행결과=>"+returnVal); //같은 타입의 변수를 선언해서 저장

		String str3 = new String("i love you");
		int returnVa2 = str3.length(); //method명은 length..
		System.out.println("문자열 길이=>"+returnVa2); //같은 타입의 변수를 선언해서 저장

		//String()에 
	}

}