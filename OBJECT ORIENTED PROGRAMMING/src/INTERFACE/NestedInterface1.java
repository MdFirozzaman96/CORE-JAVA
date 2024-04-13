
package INTERFACE;

public class NestedInterface1 {
    
    void show()
    {
        System.out.println("This is a class named NestedInterface1 contains an interface as nested.");
    }
    interface Message{
        
        void msg();
    }
    
}

class BodyNestedInterface1 implements NestedInterface1.Message{
    
    public void msg()
    {
        System.out.println("This method belongs to a nested interface inside the class NestedInterface1");
    }
}
class TestNestedInterface1{
    
    public static void main(String[] args) {
        
        NestedInterface1.Message obj = new BodyNestedInterface1();
        obj.msg();
        
         //NestedInterface1 obj1 = new BodyNestedInterface1();
         BodyNestedInterface1 obj2 = new BodyNestedInterface1();
         NestedInterface1 obj3 = new NestedInterface1();
         //obj2.show();
         obj3.show();
        
    }
}

