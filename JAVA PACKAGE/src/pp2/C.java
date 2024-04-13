
package pp2;

import pp1.B;

import pp1.A;

public class C {
    
    void msg3()
    {
        System.out.println("This method inside class A which belongs to package pp2");
    }
    
}
class D {
    
    void msg4()
    {
        System.out.println("This method inside class B which belongs to package pp2");
    }  
}

class TestPackage{
    
    public static void main(String[] args) {
        
         B b = new B(); 
         b.msg1();
         
         A a = new A();
         a.msg();
    }
}