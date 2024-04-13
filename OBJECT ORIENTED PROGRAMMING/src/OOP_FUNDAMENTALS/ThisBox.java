
package OOP_FUNDAMENTALS;

public class ThisBox {
    
    int height,width;
    double area;
    
    void set_dim(int height,int width)
    {
        this.height=height;
        this.width=width;
    }
    void area()
    {
        System.out.println("The area is : "+height*width);
    }
    
    public static void main(String[] args) {
        
        ThisBox obj1 = new ThisBox();
        obj1.set_dim(10, 7);
        obj1.area();
        
        ThisBox obj2 = new ThisBox();
        obj2.set_dim(9, 9);
        obj2.area();
    }
    
}

