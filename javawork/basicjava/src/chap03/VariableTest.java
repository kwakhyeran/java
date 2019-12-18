package chap03;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본형 변수
		int i = 10;
		int j = 10;
		System.out.println("===========기본형==========");
		if(i==j) {
			System.out.println("기본형같다.");
		}else {
			System.out.println("기본형 다르다.");
		
		}
		//참조형 변수
	
		String str1 = new String("java");
		String str2 = new String("java");
		if(str1 == str2) {
			System.out.println("참조형같다.");
		}else {
			System.out.println("참조형다르다.");
		}
		
		//문자열비교- String클래스 메소드로 처리
		
		if(str1.equals(str2)) {              //equals는 2개의 문자열을 비교
			System.out.println("문자열같다");
		}else {
			System.out.println("문자열 다르다");
		}
		}
		
		
	}


