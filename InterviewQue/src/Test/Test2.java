package Test;

public class Test2 {

	public static void main(String[] args) {
		
		test(null);
		test("ABC");
	}

	private static void test(Object object) {
		System.out.println("Object");
	}
	
	private static void test(String object) {
		System.out.println("String");
	}
	
	private static void test(int object) {
		System.out.println("int");
	}

}
