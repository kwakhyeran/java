package workbook77p;

public class CarTest {

	public static void main(String[] args) {

		Car[] ca = new Car[2];

		ca[0] = new L3("L3", "1500", 50, 25, 0);
		ca[1] = new L5("L5", "2000", 70, 35, 0);

		System.out.println("vehicleName" + "\t" + "engineSize" + "\t" + "oilTack" + "\t" + "oilSize" + "\t" + "distace"
				+ "\t" + "temperature");

		String name = "";
		for (int i = 0; i < ca.length; i++) {

			if (ca[i] instanceof L3) {
				name = "L3";
				System.out.println(name + "\t" + ca[i].getEngine() + "\t" + ca[i].getOilTank() + "\t"
						+ ca[i].getOilSize() + "\t" + ca[i].getDistace() + "\t" + ((L3) ca[i]).getTempGage());
			}else {
			name = "L5";

			System.out.println(name + "\t" + ca[i].getEngine() + "\t" + ca[i].getOilTank() + "\t" + ca[i].getOilSize()
					+ "\t" + ca[i].getDistace() + "\t" + ((L5) ca[i]).getTempGage());
		}

		for (Car obj : ca) {
			if (obj instanceof L3) {
				((L3) obj).setOilSize(25);
				System.out.println(name + "\t" + obj.getEngine() + "\t" + obj.getOilTank() + "\t" + obj.getOilSize()
						+ "\t" + obj.getDistace() + "\t" + ((L3) obj).getTempGage());
			} else if (obj instanceof L5) {
				((L5) obj).setOilSize(25);
				System.out.println(name + "\t" + obj.getEngine() + "\t" + obj.getOilTank() + "\t" + obj.getOilSize()
						+ "\t" + obj.getDistace() + "\t" + ((L5) obj).getTempGage());
			}

		}
	}
}}
