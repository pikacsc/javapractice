package ��ӿ���;

public class Master extends MemberDTO {
	private String adminID;
	private String securePW;
	private int ����;
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
	
	
	String �����ֱ�() {
		return "�����鿡�� ������ ���";
		
	}
	
	String ����Ʈ���() {
		return "������ ����Ʈ�� ����";
	}
	
	
	int ������ȸ() {
		return ����;
	}
}
