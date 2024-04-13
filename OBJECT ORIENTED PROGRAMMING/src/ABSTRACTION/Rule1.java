
package ABSTRACTION;

public class Rule1 {
    
    abstract void Method();
}
class Body{
    
    void Method()
    {
        System.out.println("If there is an abstract method in a class, that class must be abstract.");
    }
    
    public static void main(String[] args) {
        
        Body obj = new Body();
        obj.Method();
    }
}
