package workbook74p;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[7]; // ShapeŸ���� ��ü�� ������ �� �ִ� ��ü 6���� �迭�� ����
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

		System.out.println("�⺻����");
		for (int i = 0; i < shape.length; i++) {
			/*
			 * System.out.println( shape[i].getClass().getName() + "\t" + shape[i].getArea()
			 * + "\t" + shape[i].getArea() + "\t");
			 */

			// �迭�� ����� ��ü�� Ÿ���� �˻�

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
		

		System.out.println("������� �� ����");
		// ���� for��
		// �迭�̳� Collection�� �ٷ� �� ���
		// for���� �� �� ����ɶ����� Shape �迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		for (Shape obj : shape) {
			//System.out.println(obj.getColors()); // obj = shape[i]
			// ��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
			// ��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�.
			String name = "";
			if (obj instanceof Rectangle) {
				((Rectangle) obj).setResize(5); // obj�� Rectangle�� ��ȯ�ϰ�..
				name = "Rectangle";
			} else if (obj instanceof Triangle) {
				((Triangle) obj).setResize(5); // obj�� Rectangle�� ��ȯ�ϰ�..
				name = "Triangle";

			} else {
				name = "Circle";
			}
			System.out.println(name + "\t" + obj.getArea() + "\t" + obj.getArea() );
		}
	}

}