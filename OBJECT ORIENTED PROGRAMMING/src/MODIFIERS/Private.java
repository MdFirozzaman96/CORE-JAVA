
package MODIFIERS;


public class Private {
    
    int height,width;
    private Private()
    {
        System.out.println("Constructor");
    }
    public void area()
    {
        System.out.println("Area : "+height*width);
    }

}
