
package INTERFACE;


public interface StaticDrawable {
    
    void draw();
    static int cube(int x)
    {
        return x*x*x;
    }
    
}

class DrawCircle implements StaticDrawable{
    
    public void draw()
    {
        System.out.println("Drawing Circle...");
    }
}

class TestStaticDrawable{
    
    public static void main(String[] args) {
        
        StaticDrawable d = new DrawCircle();
        d.draw();
        System.out.println(StaticDrawable.cube(5));
    }
}
