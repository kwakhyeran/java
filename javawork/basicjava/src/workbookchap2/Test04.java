package workbookchap2;

public class Test04 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int a =0;
		int sum = 0;
		for(int i = 0;i<arr3.length;i++) {
			a = (int)(Math.random()*10)+1;
			/*
			for(int j = 0;j<i;i++) {
				if(a==arr3[j]) {
					a = (int)(Math.random()*10)+1;
				}
			}
			*/
			arr3[i] = a;
			
			
		}
		
		for(int k =0;k<arr3.length;k++) {
			System.out.print(arr3[k]+"\t");
			sum+=arr3[k];
		}
		System.out.println();
		System.out.println("sum = "+sum);
		System.out.println("avg = "+(double)(sum/5));

	}

}
