package oop.chap07;

public class StaticDemo{
	String name;
	
	int num;
	static int staticNum;
	
//변수를 3개 만들고 생성자한개를 만들었다

	public StaticDemo(String name) {
		this.name=name;
		num++;
		staticNum++;		
	}
	
	public void display() {  //메소 드 생성
		System.out.println("name: " + name+",num"+num+",staticnum"+staticNum);
		
	}
}
