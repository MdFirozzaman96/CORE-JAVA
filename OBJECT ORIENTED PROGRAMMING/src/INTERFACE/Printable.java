
package INTERFACE;


public interface Printable {
    
    void message();
    
}

class A4 implements Printable{
    
    public void message()
    {
        System.out.println("Interface is used to achive 100% abstruction.");
    }
}

class TestInterface{
    
    public static void main(String[] args) {
        
        Printable obj = new A4();
        obj.message();
    }
}


