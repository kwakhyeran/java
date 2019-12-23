package workbookchap2;

public class Test03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
		};
		
		double b = 0.0;
		int sum = 0;
		for(int i = 0; i<arr2.length;i++) {
			
			for(int j = 0; j<arr2[i].length;j++) {
				sum+=arr2[i][j];
				System.out.print(arr2[i][j]+"\t");
				b++;
			}
			System.out.println();
		}
		System.out.println("sum = "+sum);
		System.out.println("avg = "+(sum/+b));
	}

}
