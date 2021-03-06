package oop.chap6.constructor;

public class MyConstructor {
	// 멤버변수 선언
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;

	public MyConstructor() {
		System.out.println("기본생성자");
	}

	// 로그인용
	public MyConstructor(String name, String id, String pass) { // 이게 멤버변수-> test의 장동긴어 여기로 전달
		System.out.println("매개변수 3개 생성자");
		// 맴버변수(인스턴스변수, 객체변수)를 초기화
		this.name = name;
		this.id = id;
		this.pass = pass;
	}

	// 수정용
	public MyConstructor(String name, String id, String pass, // 이게 멤버변수-> test의 장동긴어 여기로 전달
			String nickname) {
		this(name,id,pass);  //기존에 작성해 놓은 매개변수 3개생성자를 호출
							//생성자간 호출이 가능함.
		System.out.println("매개변수 4개 생성자");
		
		this.nickname = nickname;

	}

	// 조회용
	public MyConstructor(String name, String id, String pass, // 이게 멤버변수
			String nickname, String addr) {
		this(name,id,pass,nickname);
		this.addr = addr;
		System.out.println("매개변수 5개 생성자");
	}
//삽입용
	public MyConstructor(String name, String id, String pass, // 이게 멤버변수
			String nickname, String addr, int point) {
		this(name,id,pass,nickname,addr);

		this.point = point;
		System.out.println("매개변수 6개 생성자");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 변수를 선언하고 셋겟메소드를 추가
}
