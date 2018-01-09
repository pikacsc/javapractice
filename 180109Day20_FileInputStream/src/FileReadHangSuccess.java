import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\tmp\\hangul.txt");
			in = new InputStreamReader(fin, "MS949");
			int c;
			
			System.out.println("���ڵ� ���� ������ " + in.getEncoding());
			while((c = in.read()) != -1){
				System.out.println((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("����� ����");
		}
	}

}
