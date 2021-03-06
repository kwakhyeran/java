package workbook74p;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[7]; // Shape타입의 객체를 참조할 수 있는 객체 6개를 배열로 생성
		// Shape obj = null;

		// System.out.println(shape[0].getArea()); shape[0] = obj
		// System.out.println(obj);

		shape[0] = new Triangle(7, 5, "blue");
		shape[1] = new Rectangle(4, 6, "blue");
		shape[2] = new Triangle(6, 7, "red");
		shape[3] = new Rectangle(8, 3, "red");
		shape[4] = new Triangle(9, 8, "white");
		shape[5] = new Rectangle(5, 7, "white");
		shape[6] = new Circle(0, 0, "white", 5);

		System.out.println("기본정보");
		for (int i = 0; i < shape.length; i++) {
			/*
			 * System.out.println( shape[i].getClass().getName() + "\t" + shape[i].getArea()
			 * + "\t" + shape[i].getArea() + "\t");
			 */

			// 배열에 저장된 객체의 타입을 검사

			String name = "";
			if (shape[i] instanceof Rectangle) {
				name = "Rectangle";
			} else if (shape[i] instanceof Triangle) {
				name = "Triangle";
			} else {
				name = "Circle";

			}
			System.out.println(name + "\t" + shape[i].getArea() + "\t" + shape[i].getColors() );
		}
		

		System.out.println("사이즈변경 후 정보");
		// 향상된 for문
		// 배열이나 Collection을 다룰 때 사용
		// for문이 한 번 실행될때마다 Shape 배열에서 요소 하나씩 꺼내서 obj에 전달 후 작업
		for (Shape obj : shape) {
			//System.out.println(obj.getColors()); // obj = shape[i]
			// 객체의 타입을 변경하는 경우 무조건 변경하는 것이 아니라
			// 객체의 타입을 체크한 후에 변경한다.
			String name = "";
			if (obj instanceof Rectangle) {
				((Rectangle) obj).setResize(5); // obj를 Rectangle로 변환하고..
				name = "Rectangle";
			} else if (obj instanceof Triangle) {
				((Triangle) obj).setResize(5); // obj를 Rectangle로 변환하고..
				name = "Triangle";

			} else {
				name = "Circle";
			}
			System.out.println(name + "\t" + obj.getArea() + "\t" + obj.getArea() );
		}
	}

}
