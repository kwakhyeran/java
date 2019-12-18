package workbook77p;

public abstract class Car {

	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distace;
	
	public Car() {
	
	}
	
	public Car(String name, String engine, int oilTank, int oilSize, int distace) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distace = distace;
	}
	

	public abstract void go(int distance);
		
	
	public abstract void setOil(int oilSize);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistace() {
		return distace;
	}

	public void setDistace(int distace) {
		this.distace = distace;
	}
	
}
