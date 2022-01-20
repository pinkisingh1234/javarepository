//program to check year is lleap or not
package Javaprograms;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
Leapyear lp=new Leapyear();
lp.leapYearcheck(year);
	}

	public void  leapYearcheck(int y) {
		if((y%4==0)&&(y%400==0)||(y%100!=0))
	
	{
			System.out.println("Year is leap year");
			}
		else{
			System.out.println("year is not leap year");
			
		}
	}
	
	
}