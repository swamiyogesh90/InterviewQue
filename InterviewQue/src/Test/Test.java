package Test;

public class Test {
	
	static int x = 0;

	public static void main(String[] args) {
		System.out.println(f(x) == f(x) ? "f" : "#");
		System.out.println(g(x) == g(x) ? "g" : "#");
	}
	
	public static int f(int x) {
		return ++x;
	}
	
	public static int g(int x) {
		return x++;
	}

}
