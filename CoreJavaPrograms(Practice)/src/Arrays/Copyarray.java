//program to compy array elements in another array
package Arrays;
import java.util.*;
public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int[6]; 
System.out.println("Enter elements in array ");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
DisplayCopyelement(arr);
	}
public  static void DisplayCopyelement(int a[]) {
	System.out.println("Display array elements befor copying:");
	for(int x:a) {
		System.out.print(x +" ");
	}
	System.out.println();
	System.out.println("Display array elements after copying in B");
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	for(int y:b) {
		System.out.print(y + " ");
	}
}
}
