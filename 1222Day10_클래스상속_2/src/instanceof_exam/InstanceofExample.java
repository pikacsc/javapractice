package instanceof_exam;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceofExample {

	public static void main(String[] args) {
		Person Jee = new Student();
		Person Kim = new Professor();
		Person Lee = new Researcher();
		
		if(Jee instanceof Student)
			System.out.println("Jee는 Student 타입"); 
		if(Jee instanceof Researcher)
			System.out.println("Jee는 Researcher 타입");
		if(Kim instanceof Student)
			System.out.println("Kim은 Student 타입");
		if(Kim instanceof Professor)
			System.out.println("Kim는 Professor 타입");
		if(Kim instanceof Researcher)
			System.out.println("Kim는 Researcher 타입");
		if(Kim instanceof Person)
			System.out.println("Kim는 Person 타입");
		if(Lee instanceof Professor)
			System.out.println("Lee는 Professor 타입");
		if("Java" instanceof String)
			System.out.println("\"java\"는 String 타입");
		
	}

}
