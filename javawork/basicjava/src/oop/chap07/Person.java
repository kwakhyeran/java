package oop.chap07;

public class Person {
	 String name;
	 int age;
	 
	 public Person() {
}			//�⺻�����ڴ� ���������
	 
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
		System.out.println("���� : " + getName() + "���� : " + getAge());
	}

}