//program to left shift in array
package Arrays;
import java.util.*;
public class Leftshiftarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
System.out.println("Enter elements in array");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
DisplayLeftShift(a);
	}

	
	public static void DisplayLeftShift(int ar[]) {
		int temp;
		System.out.println("Array elements before left shift");
		for(int x:ar) {
			System.out.print(x+ " ");
		}
		System.out.println();

		System.out.println("Array elements after left shift");
temp=ar[0];
for(int i=1;i<ar.length;i++) {
	ar[i-1]=ar[i];
}
ar[ar.length-1]=temp;
for(int x:ar) {
	System.out.print(x+ " ");

}
	}
	
}
