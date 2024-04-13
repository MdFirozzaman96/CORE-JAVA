
package VAIRABLES;



public class DynInit {
    
    double a=5.0,b=4.0,c=10.0,d=15.0,result;
    
    void Sqrt()
    {
        result= Math.sqrt(a*b+(c+d));
    }
    public static void main(String[] args) {
        
        DynInit obj = new DynInit();
        obj.Sqrt();
        System.out.println(obj.result);
    }
}
