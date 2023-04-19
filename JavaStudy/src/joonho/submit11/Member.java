package joonho.submit11;

public class Member {
	private String name; 
	private String id;
	private String pw;
	private int coin=0;
	
	
//	public Member(String name, String id, String pw,int coin) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.pw = pw;
//		this.coin = coin;
//	}
	public Member(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;

	}
	
	
	public Member() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "[회원명: " + name + ",아이디: " + id + ",비밀번호: " + pw + ",보유한코인: " + coin + "]";
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	
	
	
	

	
	
}
