


class Addnum{
	int a,b;
	public void add() {
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println("Sum = "+sum);
	}
}
class Multiply extends Addnum{
	int a, b;
	public 	void mul() {
	a = 2;
	b= 4;
System.out.println("Mul="+(a*b));

		}
}
class dividinum extends Multiply{
	int a, b;
	public 	void div() {
	a = 12;
	b= 4;
System.out.println("div="+(a/b));

		}

}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Display multiple operations:");
		dividinum d = new dividinum();
		d.add();
		d.mul();
		d.div();

	}

}
