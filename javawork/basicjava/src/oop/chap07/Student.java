package oop.chap07;

public class Student extends Person { // person에 있는거 다 student꺼

	private int kor;
	private int eng;
	private int mat;
	private int sci;

	public Student() {
	}
	public Student(String name, int age, int kor, int eng, int mat, int sci) {
		super(name,age);   //부모의 private멤버를 직접 엑세스 하지않고 생성자를 호출하며 전달한다.

		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public double getAvg() {
		double avg = (this.kor + this.eng + this.mat + this.sci) / 4;
		return avg;

	}

	public String getGrade() {
		double avg = getAvg();
		String grade = ""; // String 변수 초기화
		if (avg > 100 | avg < 0) {
			System.out.println("잘못입력");
		} else {
			if (avg >= 90) {
				grade = "A학점";
			} else if (avg >= 70) {
				grade = "B학점";
			} else if (avg >= 50) {
				grade = "C학점";
			} else if (avg >= 30) {
				grade = "D학점";
			} else {
				grade = "F학점";
			}
		}
		return grade; // get이니까 return이 있어아햔달
	}

	public void print() {
		super.print();// 부모 클래스인 Person클래스의 print메소드를 출력
		System.out.println(this.getAge() + "평균 : " + this.getAvg() + "학점 :" + this.getGrade());
	}

	public static void show() {
		System.out.println("==========================================");

	}
}