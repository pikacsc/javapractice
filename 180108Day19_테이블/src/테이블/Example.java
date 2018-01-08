package 테이블;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Example extends JFrame{

	public Example() {
		setTitle("테이블예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		String header[] = {"학생이름","국어","영어","수학"};
		String contents[][] = {
				{"박영수","90","87","98"},
				{"홍길동","100","37","48"},
				{"최성찬","30","27","38"},
				{"이순신","50","67","98"}	
		};
		
		JTable table = new JTable(contents,header);
		JScrollPane scrollpane = new JScrollPane(table);
		
		
		table.setValueAt("200", 1, 1); //값을 바꾸고 가져오기 table.setValueAt("대체할 값", 행, 열); 
		System.out.println(table.getValueAt(1, 1));  //table.getValueAt(행, 열)
 		
		System.out.println(table.getRowCount());  //행의수
		System.out.println(table.getColumnCount()); //열의수
		
		System.out.println(table.getColumnName(0)); //컬럼이름 가져오기 (header)
		System.out.println(table.getColumnName(1));
		
		
		
		
		add(scrollpane);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Example();
	}

}
