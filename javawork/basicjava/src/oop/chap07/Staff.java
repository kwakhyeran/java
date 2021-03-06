package oop.chap07;

public class Staff extends Person {
	private String dept;
	public Staff() {
	}

	public Staff(String name, int age, String dept) {       //메소드
		super(name,age);
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		super.print();//부모 클래스인 Person클래스의 print메소드를 출력
		System.out.println( "부서 : " + this.getDept());
	}
}
