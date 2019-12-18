package chap05;

//배열 엑세스하기
public class ArrayTest03 {

	public static void main(String[] args) {
		int[] myarr = new int[5];
		// 기본형변수 타입 이름은 int , 변수 이름은 myarr, 길이(방)를 5개로 정의
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		// 배열의 요소의 크기를 출력
		// length는 배열의 사이즈를 저장하고 있는 기본 변수(자동으로 제공됨)
		System.out.println("배열의 요소의 갯수" + myarr.length);
		System.out.println("==================");

		for (int i = 0; i <= myarr.length - 1; i++) {
			System.out.println(myarr[i]);
		}
		// length에 -1을 한이유 : 0 을 포함하기 때문에

	}
}