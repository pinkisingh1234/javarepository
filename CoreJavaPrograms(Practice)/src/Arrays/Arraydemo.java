//simple array
package Arrays;
import java.util.*;
public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
int b[]= {1,2,3,4,5};
//by default display zero
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
//for each loop
System.out.println("for each loop....");

for(int x:b) {
	System.out.println(x);
}
b[2]=15;
System.out.println("Display  befopre incremented values....");

for(int i=0;i<b.length;i++) {
	System.out.println(b[i]++);

}
System.out.println("after incremented values...");

for(int x:b) {
	System.out.println(x);

}
	}

}