
package POLYMORPHISM;


public class Overload_Main_Method {
    
    public static void main()
    {
        System.out.println("This is non parameterized main method.");
    }
    public static void main(String args)
    {
        System.out.println("This is a parameterized main method with one string parameter.");
    }
    public static void main(String[] args)
    {
        System.out.println("JVM calls main() method which receives string array as arguments only.");
    }
    
}
