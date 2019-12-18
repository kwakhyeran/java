package chap04;

//for문 중첩하기
public class fotTest02 {

	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {

			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}

			System.out.println(); // 맨위 *****를 밑으로 5줄 반복

		}

	}

}
