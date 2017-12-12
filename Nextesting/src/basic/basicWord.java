package basic;

public class basicWord {
	public static void main(String []args) {
	basicWord bw = new basicWord();
	int a = 1;
	bw.breakingWood(a);
	}
	public void breakingWood(int a){
		while(a<10) {
			a++;
			System.out.println("나무를" + a + "번찍었습니다");
	       if(a==10) {
	    	  System.out.println("나무 넘어 갑니다");
	    	  System.out.println("집에서 추가한 문구입니다");
	       }
		}
	}
}
