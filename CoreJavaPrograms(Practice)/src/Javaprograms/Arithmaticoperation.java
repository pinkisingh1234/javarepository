package Javaprograms;
import java.util.Scanner;
public class Arithmaticoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
sc.nextLine();//this is for taking string in next step
System.out.println("Enter options to find result:");
String options = sc.nextLine();
Arithmaticoperation ap=new Arithmaticoperation();
 ap.switchArithmaticOperations(a, b, options);
	}
public int switchArithmaticOperations(int a,int b,String option) {
	
	switch(option) {
	case "Add":
		System.out.println(a+b);
		break;
	case "SUB":
		System.out.println(a-b);
		break;
	case "MUL":
		System.out.println(a*b);
		break;
	case "DIV":
		System.out.println(a/b);
		break;
	default:
		System.out.println("Invalid data");
break;
	
	}
	return 0;

}
}
