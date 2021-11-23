
public class finalexceptiondemo {  
    //declaring final variable  
    final int age = 18;  
    void display() {  
      
    age = 55;  
    }  
      
    public static void main(String[] args) {  
      
    	finalexceptiondemo obj = new finalexceptiondemo();  
    obj.display();  //compile time error
    }  
}  