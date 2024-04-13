
package SUPER_KEYWORD;



public class ImplicitSuper {
    
    ImplicitSuper()
    {
        System.out.println("Default constructor is provided by compiler automatically if there is no constructor."
                + " But, it also adds super()implicitly as the first statement.");
    }
    
}

class Child extends ImplicitSuper{
    
    Child()
    {
        System.out.println("super()is added in each class constructor automatically by compiler if there is no super() or this()");
    }
}
class ChildTest{
    
    public static void main(String[] args) {
        
        Child obj = new Child();
    }
}
