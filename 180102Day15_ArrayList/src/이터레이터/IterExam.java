package 이터레이터;

import java.util.Iterator;
import java.util.Vector;

public class IterExam {

	public IterExam() {
		Vector<Integer> vInteger = new Vector<Integer>();
		int num = 2;
		for(int i=0;i<5;i++) {
			vInteger.add(num);
			num++;
		}
		
		Iterator it = vInteger.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		new IterExam();
	}

}
