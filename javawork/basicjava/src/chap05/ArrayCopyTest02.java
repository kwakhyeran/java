package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {

		int[] firstArr = new int[5];
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = 10 + i;

			System.out.print(firstArr[i] + " ");
		}

		System.out.println();
		// firstArr를 복사할 배열을 선언
		int[] secondArr = new int[firstArr.length * 2]; // secondArr의 배열수를 2배하여 선언
		// firstArr배열의 0번부터 fistArr의 모든요소를 secondArr의 0번위치부터 copy해서저장하기
		System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		for (int i = 0; i < secondArr.length; i++) {

			System.out.print(secondArr[i] + " ");
		}
		System.out.println();
	}

}
