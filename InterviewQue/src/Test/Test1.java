package Test;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println(test());
	}

	private static int test() {
		return (true ? null : 0);
	}
}
