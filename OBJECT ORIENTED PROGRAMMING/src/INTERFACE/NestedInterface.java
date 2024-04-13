
package INTERFACE;


public interface NestedInterface {
    
    void show();
    
    public interface Message{
        
        void msg();
    }  
}

class BodyNestedInterface implements NestedInterface.Message{
    
    public void msg()
    {
        System.out.println("This method within the nested interface.");
    }
}
class NestedInterfacTest{
    
    public static void main(String[] args) {
        
        NestedInterface.Message  obj = new BodyNestedInterface();//upcasting here
        obj.msg();
    }
}
