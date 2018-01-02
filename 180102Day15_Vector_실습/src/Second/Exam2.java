package Second;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam2 {
	Vector<Student> a = new Vector<Student>();
	
	class Student{
		Student(String name,int StudentNum){
			this.name = name;
			this.StudentNum = StudentNum;
		}
		
		private String name;
		private int StudentNum;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStudentNum() {
			return StudentNum;
		}
		public void setStudentNum(int studentNum) {
			StudentNum = studentNum;
		}
		
	}
	
	public static void main(String[] args) {
			Exam2 main = new Exam2(); 
			main.inputMain();
	}
	void inputMain() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�л����� ���α׷� 1.0 made by �ּ���");
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.���");
			System.out.println("4.�˻�");
			System.out.println("5.����");
			System.out.println("6.����");
			System.out.println("7.����");
			System.out.print("���ϴ� �۾��� ��ȣ�� �Է��ϼ���");
			switch(sc.nextInt()) {
				case 1:
					addStudent();
					break;
				case 2:
					
				case 3:
					printStudent();
					break;
				case 4:
					searchStudent();
					break;
				case 5:
				case 6:
					editStudent();
					break;
				case 7:
					break;
				default:
					inputMain();
			}
		}catch(Exception e){
			System.out.println("���� �ٽ� �Է��ϼ���");
			inputMain();
		}finally {
			sc.close();
		}
		
	}
	
	void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л� �̸��� �Է��ϼ���: ");
		String j = sc.next();
		System.out.print("�й��� �Է��ϼ���: ");
		int k = sc.nextInt();
		a.add(new Student(j,k));
		System.out.println("�߰��Ǿ����ϴ�");
		inputMain();
		sc.close();
	}
	
	void deleteStudent() {
		System.out.println("������ �л��� ��ȣ�� �Է��ϼ���");
	}
	
	void printStudent() {
		Iterator it = a.iterator();
		Student s;
		while(it.hasNext()) {
			s = (Student)it.next();
			System.out.printf("�л��̸�: %s \n",s.getName());
			System.out.printf("�й�: %d \n",s.getStudentNum());
			System.out.println();
		}
		inputMain();
	}
	
	void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �л��� �̸��� �Է��ϼ���: ");
		String searchName = sc.next();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getName().equals(searchName)) {
				System.out.printf("�й� : %d",(int)a.get(i).getStudentNum());
				System.out.println();
				break;
			}
		}
		inputMain();
	}
	
	void editStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �л��� �̸��� �Է��ϼ���: ");
		String searchName = sc.next();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getName().equals(searchName)) {
				Iterator it = a.iterator();
				Student s;
				while(it.hasNext()) {
					s = (Student)it.next();
					System.out.printf("�л��̸�: %s \n",s.getName());
					System.out.printf("�й�: %d \n",s.getStudentNum());
					System.out.println();
				}
				System.out.print("������ �й��� �Է��ϼ��� :");
				int editNumb = sc.nextInt();
				a.get(i).setStudentNum(editNumb);
				System.out.println("�����Ϸ� �Ǿ����ϴ�");
				break;
			}
		}
		inputMain();
	}

}
