
package Miscellaneous;



public class ExtendInstanceOf {
    
}

class Dog extends ExtendInstanceOf{
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        System.out.println(d instanceof ExtendInstanceOf);
        System.out.println(d instanceof Dog);
    }
 
}
