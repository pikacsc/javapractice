package 이터레이터;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); //5삽입
		v.add(4); //4삽입

		v.add(-1); //-1삽입
		v.add(2,100); //4와 -1사이에 정수 100삽입
		
		// Iterator를 이용한 모든 점수 출력하기
		Iterator<Integer> it = v.iterator(); // Iterator 객체얻기
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		
		// Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator(); //Iterator 객체얻기
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수합:"+sum);
	}

}
