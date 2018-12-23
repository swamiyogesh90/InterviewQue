package inheritance;

public class Child extends Parent{
	
	public void print() {
		System.out.println("Child -> print()");
	}
	
	public void print1() {
		System.out.println("Child -> print1()");
	}
	
	//Child overridden method should not be restrictive than parent
	/*private void print() {
		System.out.println("Child -> print()");
	}*/

}
