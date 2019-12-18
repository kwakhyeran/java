package oop.chap07;

public class Person {
	 String name;
	 int age;
	 
	 public Person() {
}			//기본생성자는 만들어주자
	 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println("성명 : " + getName() + "나이 : " + getAge());
	}

}
