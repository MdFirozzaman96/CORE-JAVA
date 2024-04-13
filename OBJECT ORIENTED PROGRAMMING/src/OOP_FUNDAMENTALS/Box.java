
package OOP_FUNDAMENTALS;


public class Box {
    
    int height,width;
    double area;
    
    Box(){}// A Default/Non Parameterized Constructor
    // Variable Initialization Through Constructor
    Box(int h,int w)
    {
        height=h;
        width=w;
    }
    
    // Variable Initialization Through Method
    void set_dim(int h,int w)
    {
        height=h;
        width=w;
    }
    
    void area()
    {
        System.out.println("Area : "+height*width);
    }
    
    public static void main(String[] args){
        
        // Variable Initialization Through Constructor : 
        
        System.out.println("Variable Initialization Through Constructor : ");
        Box obj1 = new Box(20,20);
        obj1.area();
        
        Box obj2 = new Box(3,3);
        obj2.area();
        
        Box obj3 = new Box(4,4);
        obj3.area();
        
        // Variable Initialization Through Method :
        
        System.out.println("Variable Initialization Through Method : ");
        Box obj4 = new Box();
        obj4.set_dim(5,7); 
        obj4.area();
        
        // Variable Initialization Through Dot(.) Operator :
        
        System.out.println("Variable Initialization Through Dot(.) Operator : ");
        Box obj5 = new Box();
        obj5.height=100;
        obj5.width=200;
        obj5.area();
    }
}
