package tnsif.dayeight.interfaces.extendinginterfaces;

public interface ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}
