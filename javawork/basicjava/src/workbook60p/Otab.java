package workbook60p;

public class Otab extends Moblie {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize,osType);
	}
	
	
	

	public int operate(int time) {
		 setBatterySize(getBatterySize()-(time * 12));
		return getBatterySize();
	}

	public int charge(int time) {
		 setBatterySize(getBatterySize() +(time*8));
		return getBatterySize();
	}
}