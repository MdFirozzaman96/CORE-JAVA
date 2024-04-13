
package Access_Modifiers;

import MODIFIERS.Default;


public class DefaultAccess {
    
    public static void main(String[] args) {
        
        Default obj = new Default();
        obj.height=10;
        obj.width=30;//height and width is not public in default. it can not be accessed from outside the class
        
    }
    
}
