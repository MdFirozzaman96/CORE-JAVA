
package MODIFIERS;

public class StaticBlock {
    
    static void msg()
    {
        System.out.println("It is a static method.");
    }
    static 
    {
        System.out.println("It is a static block used to initialized the static data member which execute before the main method at the time of class loading.");
    }
    
    /*public static void main(String[] args) {
        
        System.out.println("Main method is executed after the execution of the static method.");
    }*/
    public static void main(String[] args) {
        
        System.out.println("Main method is executed after the execution of the static method.");
    }
    
}
