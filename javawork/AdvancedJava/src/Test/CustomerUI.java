package Test;

import java.util.Scanner;

public class CustomerUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	public void insert(){
		System.out.println("*******�����********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("�̸�:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		CustomerDTO customer = new CustomerDTO(id, pass, name, addr);
		int result = dao.insert(customer);
		if(result>0) {
			System.out.println("�� ��� ����!");
		}else {
			System.out.println("�� ��� ���Ф�");
		}
	}
	public void update(){
		System.out.println("*******����������********");
		System.out.print("�ּ�:");
		String id = key.next();
		System.out.print("���̵�:");
		String addr = key.next();
		int result = dao.update(addr,id );
		if(result>0) {
			System.out.println("������ ���� ����!");
		}else {
			System.out.println("������ ���� ���Ф�");
		}
	}
	public void delete(){
		System.out.println("*******��Ż��********");
		System.out.print("���̵�:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�� Ż�� ����!");
		}else {
			System.out.println("�� Ż�� ���Ф�");	
		}
		
	}
	
}


















