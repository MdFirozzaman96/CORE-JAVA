
package P2;
import P1.*;

public class C {
    
    void msg3()
    {
        System.out.println("This method inside class A which belongs to package P1");
    }
    
}
class D {
    
    void msg4()
    {
        System.out.println("This method inside class B which belongs to package P1");
    }  
}

class TestPackage{
    
    public static void main(String[] args) {
        
        A a = new A();
        a.msg();
        
        // B b = new B();// Here b class is not public. 
    }
}
