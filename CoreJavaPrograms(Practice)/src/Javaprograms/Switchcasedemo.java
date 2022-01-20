//program to display name of day based on number
package Javaprograms;
import java.util.Scanner;
public class Switchcasedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to display days name: ");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Webnesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		case 7:
			System.out.print("Sunday");
		default :
			System.out.print("Days not found");
		}

	}

}

