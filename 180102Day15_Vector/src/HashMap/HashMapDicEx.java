package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
		//���� �ܾ�� �ѱ۴ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//3���� (key, value) ���� dic �� ����
		dic.put("baby", "�Ʊ�"); //"baby"�� key, "�Ʊ�"�� value
		dic.put("love","���");
		dic.put("apple","���");
		
		
		//dic �÷��ǿ� ����ִ� ���(key,value) �� ���
		Set<String> keys = dic.keySet(); //key ���ڿ��� ���� Set ����
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		
		//���� �ܾ �Է¹ް� �ѱ۴ܾ� �˻�
		Scanner s = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = s.next();
			System.out.println(dic.get(eng));
		}
	}

}
