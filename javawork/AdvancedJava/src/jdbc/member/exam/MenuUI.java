package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//�Ի����� ���ó�¥ - sysdate , point =1000�� ���Եǵ��� 
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
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
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("�Խñ� ���� ����!");
		}else {
			System.out.println("�Խñ� ���� ���Ф�");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�Խñ� ���� ����!");
		}else {
			System.out.println("�Խñ� ���� ���Ф�");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		
		int size = memberlist.size();
		for(int i = 0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+member.getName()+"\t"+
			member.getAddr()+"\t"+member.getDeptno()+"\t"+member.getHiredate()+"\t"+member.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i = 0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			System.out.println(member.getId()+"\t"+member.getPass()+"\t"+member.getName()+"\t"+
					member.getAddr()+"\t"+member.getDeptno()+"\t"+member.getHiredate()+"\t"+member.getPoint());
		}
		
	}
	public void loginMenu() {
		System.out.println("*******�α���********");
		System.out.println("���̵�: ");
		String id = key.next();
		System.out.println("��й�ȣ: ");
		String pass = key.next();
		MemberDTO member = dao.login(id, pass);
		if(member == null) {
			System.out.println("�α��� ���Ф�");
		}else {
			System.out.println("�α��� ����!");
		}
		
	}
}


















