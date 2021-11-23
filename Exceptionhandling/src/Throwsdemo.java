
public class Throwsdemo {  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
    	Throwsdemo obj = new Throwsdemo();  
        try {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("Number cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code");  
    }  
}  