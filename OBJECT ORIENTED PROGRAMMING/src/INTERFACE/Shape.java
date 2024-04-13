
package INTERFACE;


public interface Shape {
    
    void area();   
}

class Circle implements Shape{
    
    public void area()
    {
        System.out.println("This is circle area.");
    }
}

class Rectangle implements Shape{
    
    public void area()
    {
        System.out.println("This is rectangle area.");
    }
}

class Triangle implements Shape{
    
    public void area()
    {
        System.out.println("This is triangle area.");
    }
}

class TestShape{
    
    public static void main(String[] args) {
        
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();
        
        c.area();
        r.area();
        t.area();
    }
}
