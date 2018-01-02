package first;
//3. Vector로 1에서 10까지 수를 담고 짝수만 출력하시오.
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
