package overrriding;

public class Child extends Parent {
	
	/*in overriding parent class method by default available to every child by inheritance if the child
	  is not satisfy with parent implementation then the child is allowed to redefine that method in child class. 
	*/
	
	
	@Override
	public void marry() {
		System.out.println("Married with Rinky according to you");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		c.marry();
		
		System.out.println();
		Parent p = new Parent();
		p.property();
		p.marry();
		
		System.out.println();
		Parent p1 = new Child();
		p1.property();
		p1.marry();
		
	}
}
