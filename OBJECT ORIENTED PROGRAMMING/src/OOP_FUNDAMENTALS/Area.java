
package OOP_FUNDAMENTALS;

public class Area {
    
    int height,width;
    double area;
    
    // Parameterized Method
    void set_dim(int h,int w)
    {
        height=h;
        width=w;
    }
    
    // Non Parameterized Method
    void area()
    {
        area=height*width;
        System.out.println("Area : "+area);
    }
    
    public static void main(String[] args){
        
        Area obj = new Area();
        
        obj.set_dim(4,5);
        obj.area();
    }
}
