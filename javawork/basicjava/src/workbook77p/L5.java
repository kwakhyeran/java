package workbook77p;

public class L5 extends Car implements Temp {


	public L5(){
	}
	public L5(String name, String engine, int oilTank, int oilSize, int distace){
		super(name, engine, oilTank, oilSize,distace);
	}

	@Override
	public void go(int distance) {
		if(distance%8 == 0) {
			setOilSize(getOilSize()-1);         
		}
		
	}
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+ oilSize);
	}
	@Override
	public int  getTempGage() {
		return 2*(getDistace()/10);
	}
}
