package chap03;
// 지역변수 - {}(블럭)안에서 선언된 변수
//			선언된 블럭이 종료되면 메모리에서 해체
//			1)선언된 블럭 내부에서만 사용이 가능
//			2)반드시 초기화 작업을 해야한다.
public class localVarialeTest {

	public static void main(String[] args) {
		
		int num =90;
		int sum;           //이렇게 초기화하면 sum이 에러뜸 int sum = 0 ; 확실히 초기화!
		if(num >-90) {	
			String str = new String("합격");
	
		}
		
		System.out.println(); //str변수는 if블럭에 선언되었으므로 if 블럭밖에서는 접근할수 없다.

	}

}
