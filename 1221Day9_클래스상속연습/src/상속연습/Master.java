package 상속연습;

public class Master extends MemberDTO {
	private String adminID;
	private String securePW;
	private int 매출;
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getSecurePW() {
		return securePW;
	}
	public void setSecurePW(String securePW) {
		this.securePW = securePW;
	}
	
	
	String 월급주기() {
		return "직원들에게 월급을 줬다";
		
	}
	
	String 쪼인트까기() {
		return "직원들 쪼인트를 깠다";
	}
	
	
	int 매출조회() {
		return 매출;
	}
}
