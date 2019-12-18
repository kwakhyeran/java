package oop.chap07.poly;

/*�߻�Ŭ���� - abstract�� �ǹ�
 * 
 * �̿ϼ��� Ŭ����, ��� ������ ������ �Ǿ����� ���� Ŭ������ �ϼ����� �ʾ����Ƿ� ��ü������ �Ҽ�����.
 * --------------------
 * �޼ҵ��� body�� �������� �ʴ� �޼ҵ带 �������� ���� Ŭ����(�߻�޼ҵ�)
 * 
 * 1)�߻�޼ҵ带 �����ϴ� ���
 *		���������� abstract ����Ÿ�� �޼ҵ��(�Ű����� list....);
 *		=>�߻�޼ҵ尡 ���ǵ� Ŭ������ �̿ϼ��� �߻�Ŭ������ �ǹǷ� �Ϲ�Ŭ������ �ٸ���
 *		  �߻� Ŭ������ �����ϴ� ��� Ŭ���� ����ο��� abstract�� �߰��ؾ��Ѵ�.
 * 2)�߻�Ŭ������ Ư¡
 * 		-�Ϲݸ޼ҵ�� �߻�޼ҵ� ��� ������ �� �ִ�.
 * 		-�߻�޼ҵ尡 �� ���� ���ǵǾ� �ִ� Ŭ������ �ݵ�� abstract�� �߰��ؾ��Ѵ�.
 * 		-�߻�Ŭ������ �ν��Ͻ�ȭ �� �� ����.
 * 		-�߻�Ŭ������ ����ϸ� ������ �߻��Ѵ�
 * 			=>AbstractSubŬ�������� abstract�޼ҵ带 �����ִ� AbstractSuperŬ������ ����ϸ鼭
 *			  AbstractSubŬ������ �߻�Ŭ������ �ȴ�.
 *
 *			[�ذ���]
 *			1.����Ŭ������ ����� �������� ������� Ŭ������� Ŭ���� ����ο� abstract�߰��Ѵ�.
 *			2.��� �߻�޼ҵ带 �ݵ�� �������̵��ؾ��Ѵ�.
 *
 *3)�߻�Ŭ������ �߻�޼ҵ带 �ۼ��ϴ� ����
 *	-����Ŭ������ ����ϱ� ���� ����(��ü������ ���������� �����ϱ����ؼ�)
 *	-����Ŭ�������� �ݵ�� �������ؾ��ϴ� �޼ҵ�Ѥ� �������� �����Ͽ� �ݵ�� �������ϵ��� �ϱ� ���ؼ�
 *
 */		


abstract class AbstractSuper {            //�߻�Ŭ����

	public abstract void show();

	public void display() { // �Ϲݸ޼ҵ�
		System.out.println("display");
	}

}

class AbstractSub extends AbstractSuper{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	}

public class AbstractTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			AbstractSuper obj = new AbstractSuper();
		}
	}

