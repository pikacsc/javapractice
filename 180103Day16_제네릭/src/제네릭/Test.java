package Á¦³×¸¯;

class MyClass<T>{
	T val;
	void set(T a) {
		val = a;
	}
	
	T get() {
		return val;
	}
}

public class Test {

	public static void main(String[] args) {
		MyClass<Integer> s = new MyClass<Integer>();
		s.set(1);
		
		System.out.println(s.get());
	}

}
