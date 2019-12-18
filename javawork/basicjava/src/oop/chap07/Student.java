package oop.chap07;

public class Student extends Person { // person�� �ִ°� �� student��

	private int kor;
	private int eng;
	private int mat;
	private int sci;

	public Student() {
	}
	public Student(String name, int age, int kor, int eng, int mat, int sci) {
		super(name,age);   //�θ��� private����� ���� ������ �����ʰ� �����ڸ� ȣ���ϸ� �����Ѵ�.

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
		String grade = ""; // String ���� �ʱ�ȭ
		if (avg > 100 | avg < 0) {
			System.out.println("�߸��Է�");
		} else {
			if (avg >= 90) {
				grade = "A����";
			} else if (avg >= 70) {
				grade = "B����";
			} else if (avg >= 50) {
				grade = "C����";
			} else if (avg >= 30) {
				grade = "D����";
			} else {
				grade = "F����";
			}
		}
		return grade; // get�̴ϱ� return�� �־���h��
	}

	public void print() {
		super.print();// �θ� Ŭ������ PersonŬ������ print�޼ҵ带 ���
		System.out.println(this.getAge() + "��� : " + this.getAvg() + "���� :" + this.getGrade());
	}

	public static void show() {
		System.out.println("==========================================");

	}
}