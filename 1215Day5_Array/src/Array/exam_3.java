package Array;

public class exam_3 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		
		//생성된 하나의 배열을 다수의 레퍼런스가 참조 가능
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		
		// 배열을 통째로 대입, myArray[]가 intArray를 통째로 참조
		int myArray[] = intArray;
		
		//myArray[1] 값만 초기화
		myArray[1] = 10;
		
		
		//그러나 intArray 값또한 바뀐걸 알수 있음
		//결론 myArray[] = intArray; 할때부터 myArray[] 와 intArray 는  동기화가된것 
		System.out.println("myArray[1]="+myArray[1]);
		System.out.println("intArray[1]="+intArray[1]);
		System.out.println("myArray[4]="+myArray[4]);
		
		
		
		int a[] = {1,2,3};
		int b[] = new int[3];
		
		//배열을 단일값만 대입
		b[1] = a[1];
		
		//b[1]만 바뀐걸 알수 있음
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}

}
