package AllinOne;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExchangeParser {
	public ExchangeParser() throws IOException {
		Document doc = Jsoup.connect("http://info.finance.naver.com/marketindex/exchangeList.nhn").get();
		Elements usd = doc.select("USD");
		
		for(Element e:usd) {
			System.out.println("text : "+e.text());
			System.out.println("html : "+e.html());
			
		}
		
			
	}
	
	public static void main(String[] args) {
		new ExchangeParser();
	}

}
