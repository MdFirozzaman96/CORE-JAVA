
package Miscellaneous;


public class InstanceOf {
    
    String name="Md.Firozzaman"; 
    void act()
    {
        System.out.println("The java instanceof operator is used to test whether the object is an instance of the specified type"
                + " (class or subclass or interface).");
    }
}

class Student{
  
    public static void main(String[] args) {
        
        Student s = new Student();
        InstanceOf obj = new InstanceOf();
        
        obj.act();
        System.out.println(s instanceof Student);
        ///System.out.println(s instanceof InstanceOf);
    }
    
}
