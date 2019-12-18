package WorkBook;

import oop.chap6.constructor.Student;

public class Test06_Array {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		
		studentArr[0]=new Student();
		
		studentArr[0].setName("kim");
		studentArr[0].setKor(100);             //age가 private으로 선언되었으므로 접근할수없다.
		studentArr[0].setEng(90);
		studentArr[0].setMat(90);
		studentArr[0].setSci(95);
		
		studentArr[1] = new Student();     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다

		studentArr[1].setName("lee");
		studentArr[1].setKor(50);             //age가 private으로 선언되었으므로 접근할수없다.
		studentArr[1].setEng(40);
		studentArr[1].setMat(30);
		studentArr[1].setSci(35);
		
		studentArr[2] = new Student();     //내가 Person이라는 클래스를 생성 => API클래스 사용법과 똑같다

		studentArr[2].setName("park");
		studentArr[2].setKor(56);             //age가 private으로 선언되었으므로 접근할수없다.
		studentArr[2].setEng(10);
		studentArr[2].setMat(70);
		studentArr[2].setSci(35);
			
		for(int i = 0; i<studentArr.length;i++) {
			
			studentArr[i].print();
			
			
		}

	}

}
