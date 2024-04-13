
package MODIFIERS;

public class StaticProperties {
    
    static void cat_talk()
    {
        System.out.println("Meoo Meoo Meoo");
        duck_talk();
    }
    static void duck_talk()
    {
        System.out.println("Pack Pack Pack Pack Pack");
        cat_talk();
    }
    static
    {
        duck_talk();
    }
    
    public static void main(String[] args) {
        
        cat_talk();
    }
    
}
