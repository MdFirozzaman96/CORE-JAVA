
package ppp2;


public class C {
    
    void msg3()
    {
        System.out.println("This method inside class A which belongs to package ppp2");
    }
    
}
class D {
    
    void msg4()
    {
        System.out.println("This method inside class B which belongs to package ppp2");
    }  
}

class TestPackage{
    
    public static void main(String[] args) {
        
        ppp1.Student s = new ppp1.Student();
        s.club();
        
        ppp1.A a = new ppp1.A();
        a.msg();
    }
    
}
