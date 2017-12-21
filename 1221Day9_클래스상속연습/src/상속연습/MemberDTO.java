package 상속연습;

public class MemberDTO extends 사람{
	private String id;
	private String pw;
	
	private long money;
	private int joinDate;
	private int scn;
	
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
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public int getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(int joinDate) {
		this.joinDate = joinDate;
	}
	public int getScn() {
		return scn;
	}
	public void setScn(int scn) {
		this.scn = scn;
	}
	

	String Cleaning() {
		return "청소를했다";
	}
	
	String 주문받기() {
		return "손님에게 주문을 받았다";
	}
	
}
