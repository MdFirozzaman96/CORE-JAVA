
package OOP_MISCELLANEOUS;


public class Enums {
    
    static void enumInfo()
    {
        System.out.println("An enum is a special \"class\" that represents a group of constants (unchangeable variables, like final variables) : \n");
        System.out.println("i) An enum can, just like a class, have attributes and methods.");
        System.out.println("ii) The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).");
        System.out.println("iii) An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).");
    }
    
    enum Level{
        
        LOW,
        MEDIUM,
        HEIGH
    }
    
    public static void main(String[] args) {
        
        Enums.enumInfo();
        
        Level e1 = Level.LOW;
        Level e2 = Level.HEIGH;
        Level e3 = Level.MEDIUM;
        
        System.out.println(e1);
        System.out.println(e3);
        System.out.println(e2);
        
        System.out.print("Loop Through an Enum : ");
        
        for(Level var : Level.values())
        {
            System.out.print(var+" ");
        }
        System.out.println();
    }
    
}
