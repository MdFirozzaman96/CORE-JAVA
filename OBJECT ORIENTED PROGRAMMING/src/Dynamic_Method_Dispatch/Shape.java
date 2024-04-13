
package Dynamic_Method_Dispatch;


public class Shape {
    
    void draw()
    {
        System.out.println("Drawing...");
    }
    
}
class Rectangle extends Shape{
    
    void draw()
    {
        System.out.println("Drawing Rectangle...");
    }
}
class Triangle extends Shape{
    
    void draw()
    {
        System.out.println("Drawing Triangle...");
    }
}
class Circle extends Shape{
    
    void draw()
    {
        System.out.println("Drawing Circle...");
    }
}

class TestShape{
    
    public static void main(String[] args) {
        
        Shape s;
        s = new Rectangle();
        s.draw();
        
        s = new Triangle();
        s.draw();
        
        s = new Circle();
        s.draw();
    }
    
}
