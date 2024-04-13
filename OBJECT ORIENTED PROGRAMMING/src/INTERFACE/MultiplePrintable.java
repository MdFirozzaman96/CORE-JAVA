
package INTERFACE;



public interface MultiplePrintable {
    
    void print();  // compiler converts this method into --> public abstract void print();
    
}

interface MultipleShowable {
    
    void show(); // compiler converts this method into --> public abstract void show(); 
}

class A7 implements MultiplePrintable,MultipleShowable{
    
    public void print()
    {
        System.out.println("This method belongs to the MultiplePrintable class.");
    }
    public void show()
    {
        System.out.println("This method belongs to the MultipleShowable class.");
    }
    
}
class TestA7{
    
    public static void main(String[] args) {
        
        MultiplePrintable p = new A7();
        MultipleShowable s = new A7();
        s.show();
        p.print();
    }
}
