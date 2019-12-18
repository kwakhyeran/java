package workbook77p;

public class L3 extends Car  implements Temp{

	
	public L3(){
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distace){
		super(name, engine, oilTank, oilSize,distace);
		
	
	}
	@Override
	public void go(int distance) {
		
		if(distance%10 == 0) {
			setOilSize(getOilSize()-1);      //현재 주유량인 getOilSize()에서 -1을 감소시키고 이를 setOilSize()으로 재정의한다.         
		}
		
	}
	
	@Override
	public void setOil(int oilSize) {
	
		setOilSize(getOilSize()+ oilSize);
			// 현재 주유량인 (getOilSize())에  주유량을 증가(oilSize)시켜서  setOilSize()에 저장한다.
	}
	@Override
	public int getTempGage() {
		
		return (getDistace()/10);                  //엑세스를 해야한다.       
	}

	}


//get이 가져오는거
//set은 재정의하는거