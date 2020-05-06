package practiseproject;

public class B extends A{
	public void display()
	{
		System.out.println("B is executed");
	}

	public static void main(String[] args) {
		B b=new B();
		b.display();
		System.out.println("B object created");
		A a=new A();
		a.display();
		
		

	}

}
