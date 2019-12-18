package oop.chap6.constructor;

/**
 * @author student
 *
 */
public class Student {

	private String name; // ���ڿ� - String //Ŭ������ Ư��(�̸� �ּ� ����)�� ��Ÿ���� ������

	public Student(String name, int age, int kor, int eng, int mat, int sci) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}

	
	private int age;
	private int kor;
	private int eng;
	private int mat;
	private int sci;

	public Student(String name, int kor, int eng,int mat,int sci) {

		// �ɹ�����(�ν��Ͻ�����, ��ü����)�� �ʱ�ȭ
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	System.out.println(getName()+"="+"��� : "+getAvg()+"="+ "���� :"+getGrade());

	}
	
	/*
	 * public void setname(String name) { this.name = name; } public String
	 * getname() { return this.name; }
	 * 
	 * public void setkor(int kor) { this.kor = kor; } public int getkor() { return
	 * this.kor; }
	 * 
	 * 
	 * public void seteng(int eng) { this.eng = eng; } public int geteng() { return
	 * this.eng; }
	 * 
	 * 
	 * public void setmat(int mat) { this.mat = mat; } public int getmat() { return
	 * this.mat; }
	 * 
	 * 
	 * 
	 * public void setsci(int sci) { this.sci = sci; } public int getsci() { return
	 * this.sci; }
	 * 
	 */
	 
}