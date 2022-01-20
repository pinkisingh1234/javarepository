package Javaprograms;
import java.util.*;
public class Trianglearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter base number:");
int ba=sc.nextInt();
System.out.println("Enter height:");
int h=sc.nextInt();
System.out.println("Enter sides of triangle a,b,c:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Trianglearea ta=new Trianglearea();
float area=ta.areaOfTriangle(ba,h);
System.out.println("Area of rightangel triangl = "+area);
double area2=ta.areaByHerons(a, b, c);
System.out.println("Area of Triangle = "+ area2);
	}
	//area of right angle triangle
public float areaOfTriangle(int b,int h)
{
	float area;
	//simple area formula
	area=(b*h)/2;

return area;
}

//area of triangle
//Herons formula:s=a+b+c,area=s*s-a*s-b*s-c
public   double areaByHerons(int a,int b,int c) {
float s;
double area;
s=(a+b+c)/2;
area=Math.sqrt((s)*(s-a)*(s-b)*(s-c));
return area;

}

}
