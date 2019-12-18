package chap05;

//2차원 배열의 작성연습
public class Array2DTest01 {

	public static void main(String[] args) {
		// 2차원 배열의 선언과 생성
		int[][] myarr = new int[2][3];

		myarr[0][0] = 100;
		myarr[1][1] = 200;
		// myarr[2][2] = 300;

		System.out.println("myarr의 2번째 요소가 참조하는 배열의 0번요소의 값->" + myarr[1][0]);
		System.out.println("myarr의 2번째 요소가 참조하는 배열의 0번요소의 값->" + myarr[0][0]);

		//다차원 배열의 요소의 갯수
		System.out.println("배열의 요소의 갯수 ->" + myarr.length);
		System.out.println("myarr의 0번째 요소가 참조하는 배열의 갯수" + myarr[0].length);
		System.out.println("myarr의 1번째 요소가 참조하는 배열의 갯수" + myarr[1].length);
		
		// 전체 배열의 요소룰 엑세스한다
		
	
		for (int outer = 0; outer < 2; outer++){
			for (int i = 0; i < 3; i++){
				System.out.print(myarr[outer][i]+"\t"); // 맨끝에것이 i로 들어간다
	
			}
			System.out.print("\n");
		}
		
		//전체 배열의 요소를 엑세스 하기 - 배열의 length변수를 이용해서 접근
		
	}
}
