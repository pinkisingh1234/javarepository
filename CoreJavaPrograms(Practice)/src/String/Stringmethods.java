//progam to display methods of string
package String;
import java.util.*;
public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create string using new keyword
String str=new String("JavaString");
int len=str.length();
System.out.println(len);
str=str.toUpperCase();
System.out.println(str);
String str2= new String("      Programming     ");
System.out.println(str2);
str2=str2.trim();//trim removed extra spaces
System.out.println(str2);
String substring=str.substring(3);
System.out.println(substring);
String startend=str2.substring(5, 9);
System.out.println(startend);
String replace=str2.replace('r', 'k');
System.out.println(replace);
	}

}
