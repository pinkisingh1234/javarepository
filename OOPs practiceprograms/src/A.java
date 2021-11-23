



class B{
	public void show() {
		System.out.println("It is parent class");
	}
}
public class A extends B {
void display() {
	System.out.println("It is child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A();
a.show();
a.display();
	}

}
