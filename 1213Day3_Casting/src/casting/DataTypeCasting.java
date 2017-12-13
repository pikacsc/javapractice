package casting;
/*
 * 
 * 금융쪽이나 돈관련 실무쪽에서 매우중요 민감한 부분
 * 
 * 
 * 
 */
public class DataTypeCasting {

	public static void main(String[] args) {
		
		System.out.println(7/2);
		
		System.out.println((float)(7/2));

		System.out.println(7/(float)2); //정수/(float)2  =  자동으로 float으로 결과가 나옴
	}

}
