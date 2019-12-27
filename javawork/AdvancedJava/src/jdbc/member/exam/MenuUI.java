package jdbc.member.exam;

import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new MemberDAOImpl();
	//�Ի����� ���ó�¥, sysdate, point = 1000
	public void insertMenu(){
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("�̸�:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		MemberDTO member = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("��� ��� ����!");
		}else {
			System.out.println("��� ��� ���Ф�");
		}
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	public void updateMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("��� ���� ����!");
		}else {
			System.out.println("��� ���� ���Ф�");
		}
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("��� ���� ����!");
		}else {
			System.out.println("��� ���� ���Ф�");
			
		}
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
	}
}


















