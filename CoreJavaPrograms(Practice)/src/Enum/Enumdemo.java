package Enum;




enum dept{
	CS,IT,CIVIL,EC;
	private dept() {//enum constructor
		System.out.println(this.name());
		
	}
}
public class Enumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dept d =dept.CIVIL;
System.out.println(d.ordinal());//this method find index
System.out.println(d.name());// 
switch(d){
case CS: System.out.println("Student have CS branch");
break;
case IT: System.out.println("Student have IT branch");
break;
case CIVIL:System.out.println("Student have CIVIL branch");
break;
case EC:System.out.println("Student have EC branch");
break;

}

	}

}
