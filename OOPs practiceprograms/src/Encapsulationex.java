
class EncapsulationDemo{
     int empid;
     String empName;
     int empAge;

    //Getter and Setter methods
    public int getEmpid(){
        return empid;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpid(int newValue){
        empid = newValue;
    }
}
public class Encapsulationex{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("pinki");
         obj.setEmpAge(23);
         obj.setEmpid(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee id: " + obj.getEmpid());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}