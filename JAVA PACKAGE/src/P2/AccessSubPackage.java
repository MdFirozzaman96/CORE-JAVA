
package P2;

// import P1.*;
 //import P1.sp.*;

public class AccessSubPackage {
    
    public static void main(String[] args) {
        
        //A a = new A();
        //P1.A a = new P1.A();
        //a.msg();
        
        //SubPackage s = new SubPackage();
        P1.sp.SubPackage s = new P1.sp.SubPackage();
        s.sub();
    }
    
}
