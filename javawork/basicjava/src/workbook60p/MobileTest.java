package workbook60p;

public class MobileTest {

	public static void main(String[] args) {
	Ltab ltab =new Ltab("Ltab",500,"AP-01");
	Otab otab =new Otab("Otab",1000,"AND-20");

	System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
	System.out.println("----------------------");
	System.out.println(ltab.getMobileName()+"\t"+ltab.getBatterySize()+"\t"+ltab.getOsType());
	System.out.println(otab.getMobileName()+"\t"+otab.getBatterySize()+"\t"+otab.getOsType());

	System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
	System.out.println("10분충전");
	System.out.println("----------------------");
	System.out.println(ltab.getMobileName()+"\t"+ltab.charge(10)+"\t"+ltab.getOsType());
	System.out.println(otab.getMobileName()+"\t"+otab.charge(10)+"\t"+otab.getOsType());

	System.out.println("Mobile"+"\t"+"Battery"+"\t"+"OS");
	System.out.println("5분통화");
	System.out.println("----------------------");

	System.out.println(ltab.getMobileName()+"\t"+ltab.operate(5)+"\t"+ltab.getOsType());
	System.out.println(otab.getMobileName()+"\t"+otab.operate(5)+"\t"+otab.getOsType());
}

}
