package oop.chap06;

//메소드 호출과정
public class MethodCallExam {
	public void test() {
		first();
	}

	public void first() {
		second();
	}

	public void second() {
		System.out.println("second()~~~~~~~");
	}
	public static void main(String[] args) {
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}
}
