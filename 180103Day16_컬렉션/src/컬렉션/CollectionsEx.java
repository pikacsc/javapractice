package �÷���;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> i) {
		Iterator<String> iterator = i.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->";
			} else {
				separator = "\n";
			}
			System.out.print(e+separator);
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(1,"�ƹ�Ÿ");
		
		Collections.sort(myList); //�������
		printList(myList); //���ĵ� ��� ���
		
		
		Collections.reverse(myList); //����� ������ �ݴ��
		printList(myList); //������
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") +1;
		System.out.println("�ƹ�Ÿ�� "+ index + "��° ����Դϴ�");
		
	}

}
