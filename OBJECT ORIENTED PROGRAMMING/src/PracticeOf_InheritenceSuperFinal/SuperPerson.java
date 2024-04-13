
package PracticeOf_InheritenceSuperFinal;


public class SuperPerson {
    
    String name;
    int id;
    SuperPerson(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
}

class Employee extends SuperPerson{
    
    int salary;
     Employee(String name,int id,int salary)// Call to super first statement must be constructor.
    {
         super(id,name);
         this.salary=salary;
    }
    void Display()
    {
        System.out.println("Name : "+name+"\nId : "+id+"\nSalary : "+salary);
    }
}
class EmployeeTest{
    
    public static void main(String[] args) {
        
        Employee obj = new Employee("Abdur Rahman", 1045, 45000);
        obj.Display();
    }
}
