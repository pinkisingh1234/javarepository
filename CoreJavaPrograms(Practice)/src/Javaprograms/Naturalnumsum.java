//program to sum of natural number
package Javaprograms;
import java.util.*;
public class Naturalnumsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit of number to display sum of natural number:");
int num=sc.nextInt();
Naturalnumsum ns=new Naturalnumsum();
int result=ns.displaysumofNaturalnumber(num);
System.out.println("sum of natural  number="+result);
}
int  displaysumofNaturalnumber(int num) {
	int sum=0;
	/*for(int i=1;i<=num;i++) {
		sum=sum+i;
	}
	//System.out.println("Sum opf natural  numbers:"+sum);
	return sum;
	*/
	//using while loop
	
	int n=0;
	while(n<=num) {
		sum=sum+n;
		n=n+1;
	}
	return sum;
}
	
	
	
}
