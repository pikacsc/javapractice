package 스트링객체;

public class Exam {

	public static void main(String[] args) {
		String s = "홍길동";
		String str = new String("이순신");
		
		System.out.println(s);
		System.out.println(str);
		
		String a = "         hello World                  ";
		System.out.println(a.length());// String.length 문자열의 갯수(공백포함)
		
		String s1 = a.trim(); // 앞뒤 공백 제거
		System.out.printf("%s %s \n",s1,s1.length());
		
		String filename ="movie.jpg";
		for(int i =0; i<filename.length();i++) {    //문자의 위치를 문자열에서 구하기
			if(filename.charAt(i)=='.') {
				System.out.println("점의 위치: "+i);
			}
		}
		
		//상품코드, f00001(f: food) e001(e:electronic)
		
		String goodsCode = "f0001";
		if(goodsCode.charAt(0)=='f') {
			System.out.println("food입니다.");
		}
		else if(goodsCode.charAt(0)=='e') {
			System.out.println("electronic 입니다");
		}
		
		String goodsCode2 = goodsCode.replace("f", "l"); //String.replace("a","b") String의 문자열 a를 b로 바꿔줌
		System.out.println(goodsCode2);
		
		System.out.println();
		System.out.println(filename.replace("jpg", "gif")); //이런식으로 하면 원본은 바뀌지 않음
		System.out.println(filename);//원본
		
		System.out.println();
		String id ="hkd";
		String name ="홍길동";
		String job = "의적";
		String data = id+","+name+","+job;
		System.out.println(data);
		
		String result[] = data.split(","); //String.split("x")문자열안에 x가 있다면 x로 구분하여 짜르고 result[]배열에 넣기 
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println();
		
		 String result2[] = filename.split("\\."); // 콤마는 상관없지만 . 점은 백슬래쉬 \\를 붙여줘야함
		 for(int i=0;i<result2.length;i++) {
			 System.out.println(result2[i]);
		 }
		
		 System.out.println();
		 
		 //주민등록번호에서 뒷부분 구하기
		 String 주민번호 = "8029341187510";
		 System.out.println(주민번호.substring(6));//문자열.substring(숫자),문자열에서 첫글자를 0으로 시작해 숫자만큼의 자리에서 부터 
		 										//문자열을 가져오기
		 System.out.println(주민번호.substring(0,6));//문자열.substring(숫자1,숫자2),문자열에서 첫글자를 숫자1로 시작해 숫자2만큼의 자리까지 가져옴 
			//문자열을 가져오기
		 
		 
		 String text = "abcd";
		 System.out.println(text.toUpperCase());//String.toUppercase소문자를 대문자로 
		 String text2 = "ABCD";
		 System.out.println(text2.toLowerCase());//String.toLowercase대문자를 소문자로
		 
		 //문자열 역순으로 출력하기
		 StringBuffer text3 = new StringBuffer("abcd"); //StringBuffer 객체로 생성한뒤
		 System.out.println(text3.reverse());       //StringBuffer.reverse()로 하면 역순으로 리턴함
		 											//reverse();는 StringBuffer 객체만 쓸수 있음
	}

}
