package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {

		int[] firstArr = new int[5];
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = 10 + i;

			System.out.print(firstArr[i] + " ");
		}

		System.out.println();
		// firstArr�� ������ �迭�� ����
		int[] secondArr = new int[firstArr.length * 2]; // secondArr�� �迭���� 2���Ͽ� ����
		// firstArr�迭�� 0������ fistArr�� ����Ҹ� secondArr�� 0����ġ���� copy�ؼ������ϱ�
		System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		for (int i = 0; i < secondArr.length; i++) {

			System.out.print(secondArr[i] + " ");
		}
		System.out.println();
	}

}
