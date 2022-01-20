//program to find number is binary,octal,decimal
package Javaprograms;
import java.util.*;

public class Radixfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
String num=sc.nextLine();
Radixfind r=new Radixfind();
r.findRadixnumber(num);

	}
public void findRadixnumber(String n) {
	if(n.matches("[01]+")) {
		System.out.println("Binary Redix=2");
		
	}
	else if(n.matches("[0-8]+")) {
		System.out.println("Octal Redix= 8");
		
	}
	else if(n.matches("[0-9]+")) {
		System.out.println("Decimal Redix=10");
		
	}
	else if(n.matches("[0-10A-F]+")) {
		System.out.println("Hexa-decimal Redix=16");
		
	}
	else {
		System.out.println("Not a number");
	}
}
}
