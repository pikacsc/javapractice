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
			System.out.println("������" + a + "��������ϴ�");
	       if(a==10) {
	    	  System.out.println("���� �Ѿ� ���ϴ�");
	    	  System.out.println("������ �߰��� �����Դϴ�");
	       }
		}
	}
}
