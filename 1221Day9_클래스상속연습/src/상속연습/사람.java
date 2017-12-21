package 상속연습;

public class 사람 {
	int GeustNumb;
	int visitDate;
	public int getGeustNumb() {
		return GeustNumb;
	}
	public void setGeustNumb(int geustNumb) {
		GeustNumb = geustNumb;
	}
	public int getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(int visitDate) {
		this.visitDate = visitDate;
	}
	

	String Watching() {
		return "둘러보았다";
	}
	
	String ordering() {
		return "주문을 했다";
	}
	
	
}
