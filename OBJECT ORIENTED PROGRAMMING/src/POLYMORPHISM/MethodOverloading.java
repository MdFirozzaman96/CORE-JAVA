
package POLYMORPHISM;


public class MethodOverloading {
    
    static void add()
    {
        System.out.println("Nothing element to add.");
    }
    static int add(int x,int y)
    {
        return x+y;
    }
    static int add(int x,int y,int z)
    {
        return x+y+z;
    } 
}

class TestMethodOverloading{
    
    public static void main(String[] args) {
        
        MethodOverloading.add();
        System.out.println(MethodOverloading.add(10,7));
        System.out.println(MethodOverloading.add(100,100,100));
    }
}
