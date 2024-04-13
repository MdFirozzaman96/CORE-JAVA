
package Miscellaneous;


public class Downcasting {
    
}
class DogA extends Downcasting{
    
    public static void main(String[] args) {
        
        //DogA obj = new Downcasting();//Compilation Error
        DogA obj = (DogA)new Downcasting();// Compiles successfully but ClassCastException is thrown at runtime.
        
    }
    
}
