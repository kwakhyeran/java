package oop.chap07.poly;

/*
 * [Video클래스]
1. 변수    genre(String)  
2. 생성자    title 과 genre 를 매개변수로 받는 생성자  
3. 메소드  
   - setter/getter 메소드 : genre 변수  
   - totalPrice()구현  genre 의 값에 따라 다음과 같이 price 변수에 가격을 셋팅하세요.  
     “new”인 경우 : 2000  
     “comic”인 경우 : 1500 
    “child”인 경우 : 1000  
     나머지 : 500  
     힌트 : 문자열의 내용이 같은지를 비교하려면 String 클래스의 equals() 메소드를  사용
             할 수 있습니다. 
             예)  “java”.equals(“java”) : true 리턴       
                  “java”.equals(“jsp”) : false 리턴  [출처] 다형성예제1|작성자 heaves1
 */

public class Video extends Content { //상속
	private String ganre;

	public Video() {  //디폴트
	}

	public Video(String title, String ganre) { // 생성자 형성
		super(title);
		this.ganre = ganre;
	}

		//오버라이딩
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
