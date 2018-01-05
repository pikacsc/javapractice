package 스트림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {

	public static void main(String[] args) {
		try {
			//URL 객체 생성
			URL aURL = new URL("http://http://info.finance.naver.com/marketindex/exchangeList.nhn");
			
			//URL 객체에서 입력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			String inputLine;
			while((inputLine = in.readLine())!=null) {
				System.out.println(inputLine);
				in.close();
			}
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는중 오류가 발생 했습니다.");
		}
	}

}
