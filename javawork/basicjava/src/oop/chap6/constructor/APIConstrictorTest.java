//[������]
//�����ڴ� �޼ҵ��. ��ü�� �����ɶ� ȣ��Ǵ� Ư���� �޼ҵ��̸� �ַ� �ڿ��� �������ϰų� 
//�ڿ��� ����ϱ� ���ؼ� �ʱ�ȭ�ϰų� �ڿ������۾��� �ϰų� ��ü�� ������ �ִ� ��� ������ �ʱ�ȭ �ϴ� �۾��� �����Ѵ�.

//[��ü ����]
//Ŭ����Ÿ�� ���� = new ������ �޼ҵ�()
//-------			---------
//����� Ŭ����			Ŭ���� �ȿ� �̸� ���ǵǾ� �ִ� ������ �޼ҵ带 ȣ��
//					�Ϲ� �޼ҵ� ó�� ������ �޼ҵ嵵 �Ű������� �ܺο��� ���� ���� �޾� ����� �� �ִ�.

//[��Ģ]

package oop.chap6.constructor;

import java.io.File;
import java.io.FileInputStream;

public class APIConstrictorTest {

	public static void main(String[] args) throws Exception {

		byte[] data1 = { 65, 66, 67, 68, 69 };
		char[] data2 = { 'a', 'b', 'c', 'd', 'e' };

		String str = new String();
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);// String(byte[] bytes, int offset,int length)
		String str4 = new String(data2);
		String str5 = new String(data2, 2, 3);

		System.out.println(str1 + ":" + str1.length());
		System.out.println(str2 + ":" + str2.length());
		System.out.println(str3 + ":" + str3.length());
		System.out.println(str4 + ":" + str4.length());
		System.out.println(str5 + ":" + str5.length());

		File f = new File("test.txt");
		System.out.println(f.getName());

		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println((char)fs.read());

	}
}
