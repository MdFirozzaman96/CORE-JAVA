
package INTERFACE;


public interface AbstractClassAndInterface {
    
    void a();
    void b();
    void c();
    void d();   
}

/*class B implements AbstractClassAndInterface{
    
    public void a()
    {
        System.out.println("Method a");
    }
    public void b()
    {
        System.out.println("Method b");
    }
    public void c()
    {
        System.out.println("Method c");
    }
}*/

abstract class B implements AbstractClassAndInterface{
    
    public void d()
    {
        System.out.println("Method d");
    }
}

class C extends B{
    
    public void a()
    {
        System.out.println("Method a");
    }
    public void b()
    {
        System.out.println("Method b");
    }
    public void c()
    {
        System.out.println("Method c");
    }
}

class TestAbstractInterface{
    
    public static void main(String[] args) {
        
        AbstractClassAndInterface obj = new C();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }

}
