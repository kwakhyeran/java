package Test;

import java.util.Scanner;

public class CustomerUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	public void insert(){
		System.out.println("*******°í°´µî·Ï********");
		System.out.print("¾ÆÀÌµð:");
		String id = key.next();
		System.out.print("ÆÐ½º¿öµå:");
		String pass = key.next();
		System.out.print("ÀÌ¸§:");
		String name = key.next();
		System.out.print("ÁÖ¼Ò:");
		String addr = key.next();
		CustomerDTO customer = new CustomerDTO(id, pass, name, addr);
		int result = dao.insert(customer);
		if(result>0) {
			System.out.println("°í°´ µî·Ï ¼º°ø!");
		}else {
			System.out.println("°í°´ µî·Ï ½ÇÆÐ¤Ð");
		}
	}
	public void update(){
		System.out.println("*******°í°´Á¤º¸¼öÁ¤********");
		System.out.print("ÁÖ¼Ò:");
		String id = key.next();
		System.out.print("¾ÆÀÌµð:");
		String addr = key.next();
		int result = dao.update(addr,id );
		if(result>0) {
			System.out.println("°í°´Á¤º¸ ¼öÁ¤ ¼º°ø!");
		}else {
			System.out.println("°í°´Á¤º¸ ¼öÁ¤ ½ÇÆÐ¤Ð");
		}
	}
	public void delete(){
		System.out.println("*******°í°´Å»Åð********");
		System.out.print("¾ÆÀÌµð:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("°í°´ Å»Åð ¼º°ø!");
		}else {
			System.out.println("°í°´ Å»Åð ½ÇÆÐ¤Ð");	
		}
		
	}
	
}


















