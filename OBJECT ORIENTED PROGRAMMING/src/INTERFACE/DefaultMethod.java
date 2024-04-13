
package INTERFACE;


public interface DefaultMethod {
    
    void print();
    default void msg()
    {
        System.out.println("Wke can have method body in interface. But we need to make it default method.");
    }
    
}

class Body implements DefaultMethod{
    
    public void print()
    {
        System.out.println("Implementation of msg() body.");
    }
    
}

class DefaultTest{
    
    public static void main(String[] args) {
         
        DefaultMethod d = new Body();
        d.msg();
        d.print();
    }
}
