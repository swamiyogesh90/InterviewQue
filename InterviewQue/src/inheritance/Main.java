package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.print();
		
		//Compilation error
		//Child ch = new Parent();
		
		Child ch = new Child();
		Parent pa = (Parent) ch; //Explicitly you have done upcasting. Actually no need, we can directly type cast like Parent pa = ch; compiler now treat Child as Parent but still it is Child even after upcasting
		ch.print();
		pa.print(); // It calls Child's method even though we use Parent reference.
		((Child) pa).print1(); // Downcasting: Compiler does know Parent it is, In order to use Child methods, we have to do typecast explicitly.
		// Internally if it is not a Child object it throws ClassCastException		
		
		List<Parent> pArray = new ArrayList<>();
		List<Child> cArray = new ArrayList<>();
		
		//Compilation Error
		//pArray = cArray;
		
	}
	
}