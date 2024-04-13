
package INTERFACE;


public interface MakerTagger {
    
}

class A{
    
    void action()
    {
        System.out.println("An interface which has no member is known as a marker or tagged interface."
                + "\nThey are used to provide some essential information to the JVM so that JVM may perform some useful operation.");
    }
}
class TestA{
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.action();
    }
}
