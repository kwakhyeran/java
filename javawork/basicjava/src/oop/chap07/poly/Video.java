package oop.chap07.poly;

/*
 * [VideoŬ����]
1. ����    genre(String)  
2. ������    title �� genre �� �Ű������� �޴� ������  
3. �޼ҵ�  
   - setter/getter �޼ҵ� : genre ����  
   - totalPrice()����  genre �� ���� ���� ������ ���� price ������ ������ �����ϼ���.  
     ��new���� ��� : 2000  
     ��comic���� ��� : 1500 
    ��child���� ��� : 1000  
     ������ : 500  
     ��Ʈ : ���ڿ��� ������ �������� ���Ϸ��� String Ŭ������ equals() �޼ҵ带  ���
             �� �� �ֽ��ϴ�. 
             ��)  ��java��.equals(��java��) : true ����       
                  ��java��.equals(��jsp��) : false ����  [��ó] ����������1|�ۼ��� heaves1
 */

public class Video extends Content { //���
	private String ganre;

	public Video() {  //����Ʈ
	}

	public Video(String title, String ganre) { // ������ ����
		super(title);
		this.ganre = ganre;
	}

		//�������̵�
	public void totalPrice() {
		if (ganre.equals("new")) {
			setPrice(2000);
		}
		if (ganre.equals("comic")) {
			setPrice(1500);
		}
		if (ganre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
		}

	}

	
	

	public String getGanre() {
		return ganre;
	}

	public void setGanre(String ganre) {
		this.ganre = ganre;
	}

	
}
