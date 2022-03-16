package Question6;

//Creating Employee class  
class EmployeeDetails {  
  //Creating properties of Employee class  
int emp_id;  
String name, address;  

//Getter and setters for getting and setting properties  
public int getEmp_id() {  
  return emp_id;  
}  
public void setEmp_id(int emp_id) {  
  this.emp_id = emp_id;  
}  
 
public String getName() {  
  return name;  
}  
public void setName(String name) {  
  this.name = name;  
}  
public String getAddress() {  
  return address;  
}  
public void setAddress(String address) {  
  this.address = address;  
}
@Override
public String toString() {
	return "EmployeeDetails [emp_id=" + emp_id + ", name=" + name + ", address=" + address + "]";
}  

    
}  
//Creating main class  
public class Employee{  
  //main() method start  
  public static void main(String args[]) {  
        
      //Creating object of EmployeeDetails class  
      EmployeeDetails emp = new EmployeeDetails();  
      //Setting values to the properties  
      emp.setEmp_id(101);  
      emp.setName("Ram");  
      emp.setAddress("New Delhi"); 
      System.out.println(emp); 
      emp.setEmp_id(102);  
      emp.setName("Shayam");  
      emp.setAddress("Jamtara"); 
      System.out.println(emp);  
        
        
  }  
}  