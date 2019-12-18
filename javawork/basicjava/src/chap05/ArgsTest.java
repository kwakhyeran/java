package chap05;

public class ArgsTest {

	public static void main(String[] args) {
	/*
	 	args = new String[2]
	 			-----
	 			명령행 매개변수의 갯수만큼 설정
	 	args[0] = "100"
		args[1] = "200"
	 */
		System.out.println("명령행 매개변수 ->"+args[0]);
		System.out.println("명령행 매개변수 ->"+args[1]);  //명령행 매개변수를 2개받겠다는 의미
		
		for (int i = 0; i <args.length;i++) {
			
			System.out.println(args[i]);
		}

		System.out.println("합 - > "+args[0]+args[1]); //String은 그냥 문자표현만 하지 덧셈은 안된다. 그래서 300이 아닌 100200이 됨
		
		int num1 = Integer.parseInt(args[0]);       //String으로 정의된 
		int num2 = Integer.parseInt(args[1]);		//args를 int형으로 변환하는 과정
		System.out.println("합 - > "+(num1 + num2));  // int 형으로 변환된 args 끼리 더하면 300이 나온다.
		
	}


}
