interface Calc{
	void sum(int a ,int b);
	void sub(int a ,int b);
	
}

public class Myinterface implements Calc {
	public void sum(int a ,int b) { //method of calc
		System.out.println("sum is : "+(a+b));
	}

	public void sub(int a ,int b) {
		System.out.println("sub is : "+(a-b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinterface mi = new Myinterface();
		
mi.sum(20, 50);
mi.sub(50,10);
	}

}
