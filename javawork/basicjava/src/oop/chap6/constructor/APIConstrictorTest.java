//[생성자]
//생성자는 메소드다. 객체가 생성될때 호출되는 특별한 메소드이며 주로 자원을 엑스스하거나 
//자원을 사용하기 위해서 초기화하거나 자원관련작업을 하거나 객체가 가지고 있는 멤버 변수를 초기화 하는 작업을 정의한다.

//[객체 생성]
//클래스타입 변수 = new 생성자 메소드()
//-------			---------
//사용할 클래스			클래스 안에 미리 정의되어 있는 생성자 메소드를 호출
//					일반 메소드 처럼 생성장 메소드도 매개변수로 외부에서 값을 전달 받아 사용할 수 있다.

//[규칙]

package oop.chap6.constructor;

import java.io.File;
import java.io.FileInputStream;

public class APIConstrictorTest {

	public static void main(String[] args) throws Exception {

		byte[] data1 = { 65, 66, 67, 68, 69 };
		char[] data2 = { 'a', 'b', 'c', 'd', 'e' };

		String str = new String();
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);// String(byte[] bytes, int offset,int length)
		String str4 = new String(data2);
		String str5 = new String(data2, 2, 3);

		System.out.println(str1 + ":" + str1.length());
		System.out.println(str2 + ":" + str2.length());
		System.out.println(str3 + ":" + str3.length());
		System.out.println(str4 + ":" + str4.length());
		System.out.println(str5 + ":" + str5.length());

		File f = new File("test.txt");
		System.out.println(f.getName());

		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println((char)fs.read());

	}
}
