
package MODIFIERS;

public class StaticStudentAccess {
    
    public static void main(String[] args) {
        
        StaticStudent obj1 = new StaticStudent();
        obj1.info("Md.Firozzaman", "CSE", 130, 2.70);
        
        StaticStudent obj2 = new StaticStudent();
        obj1.info("Rageeb Intisar Polok", "CSE", 100, 2.90);
        
        StaticStudent obj3 = new StaticStudent();
        obj1.info("Md. Munir", "ME", 47, 3.75);
    }
    
}
