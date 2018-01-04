package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Example1 {
	Scanner sc = new Scanner(System.in);
	
	public Example1() {
		Vector<Integer> vInteger = new Vector<Integer>();
		for(int i=0;i<4;i++) {
			System.out.print("정수를 입력하세요");
			vInteger.add(sc.nextInt());
		}
		printElement(vInteger);
		setElement(vInteger);
		printElement(vInteger);
		System.out.println("총합은"+sum(vInteger));
	}
	
	void setElement(Vector<Integer> x) {
		System.out.print("벡터에서 변경할 숫자의 인덱스와 element를 입력하시오");
		int index = sc.nextInt();
		int element = sc.nextInt();
		x.set(index, element);
	}
	
	void printElement(Vector<Integer> x) {
		for(int i=0;i<x.size();i++) {
			System.out.println(i+"번째 element : "+x.get(i));
		}
		
	}
	
	int sum(Vector<Integer> x) {
		int sum=0;
		for(int i=0;i<x.size();i++) {
			sum += x.get(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//정수 3개 삽입
		//정수 값만 다루는 제네릭 벡터 생성
		//벡터 중간에 삽입하기
		//모든 요소 정수 출력하기
		//벡터 속의 모든 정수 더하기
		//출력
		new Example1();
	}

}
