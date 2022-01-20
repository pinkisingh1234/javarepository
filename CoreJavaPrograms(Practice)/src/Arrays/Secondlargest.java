//program to find second el
package Arrays;
import java.util.*;
public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]= {10,80,70,99,30};
Secondlargest s=new Secondlargest();
s.SearchSecondLargest(a);
	}
public void SearchSecondLargest(int a[]) {
	int max1,max2;
	max1=max2=a[0];
	for(int x:a) {
		if(x>max1) {
			max2=max1;
		max1=x;
	}
	else if(x>max2) {
		max2=x;
		
	}
}
	System.out.println("Second maximum element="+max2);
}
}