package first;
//3. Vector�� 1���� 10���� ���� ��� ¦���� ����Ͻÿ�.
//
//

import java.util.Iterator;
import java.util.Vector;

public class Exam2 {
	
	public static void main(String[] args) {
		Vector<Integer> num = new Vector<Integer>();
		
		int printNum;
		for(int i=1;i<11;i++) {
			num.add(i);
			if(num.get(i-1)%2==0) {
				printNum = num.get(i-1);
				System.out.println(printNum);
			}
		}
	}

}
