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
			setOilSize(getOilSize()-1);      //���� �������� getOilSize()���� -1�� ���ҽ�Ű�� �̸� setOilSize()���� �������Ѵ�.         
		}
		
	}
	
	@Override
	public void setOil(int oilSize) {
	
		setOilSize(getOilSize()+ oilSize);
			// ���� �������� (getOilSize())��  �������� ����(oilSize)���Ѽ�  setOilSize()�� �����Ѵ�.
	}
	@Override
	public int getTempGage() {
		
		return (getDistace()/10);                  //�������� �ؾ��Ѵ�.       
	}

	}


//get�� �������°�
//set�� �������ϴ°�