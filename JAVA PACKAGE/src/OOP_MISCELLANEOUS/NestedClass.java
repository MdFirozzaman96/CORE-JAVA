
package OOP_MISCELLANEOUS;


public class NestedClass {
    
    int x=10;
    void position()
    {
        System.out.println("This is outer class.");
    }
    
    public class Inner{
        
        int y=13;
        void position1()
        {
            System.out.println("This is inner class.");
        }
    }
    
}

class TestNestedClass{
    
    public static void main(String[] args) {
        
        NestedClass outer = new NestedClass();
        outer.position();
        //obj.position1();
        
        NestedClass.Inner n = outer.new Inner();
        n.position1();
        System.out.println("Multiplication of "+outer.x+" and "+n.y+" is : "+(outer.x*n.y));
    }
}
