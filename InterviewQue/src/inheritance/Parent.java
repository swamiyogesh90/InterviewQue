package inheritance;

public class Parent {
	
	public void print() {
		System.out.println("Parent -> print()");
	}
	
	//static methods are instance class so child overridden method gives compilation error.
	
	/*public static void print() {
		System.out.println("Parent -> print()");
	}*/

}
