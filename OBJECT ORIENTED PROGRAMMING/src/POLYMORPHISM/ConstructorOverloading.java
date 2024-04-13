
package POLYMORPHISM;


public class ConstructorOverloading {
    
    ConstructorOverloading()
    {
        System.out.println("A constructor is a special method that is automatically called when an object is created."
                +"In this Constructor having no arguament.");
    }
    ConstructorOverloading(String msg)
    {
        System.out.println(msg);
    }
    ConstructorOverloading(String msg1,int x,String msg2,int y,String msg3)
    {
        System.out.println(msg1+x+msg2+y+msg3);
    }
    
}
class TestConstructorOverloading{
    
    public static void main(String[] args) {
        
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("This constructor method contains one string arguremnt.");
        ConstructorOverloading obj3 = new ConstructorOverloading("In this constructor having ",2," integer and ",3," string arguments." );
        
    }
}
