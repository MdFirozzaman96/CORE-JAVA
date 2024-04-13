
package OOP_FUNDAMENTALS;

public class Student {
    
    String Name;
    int Id;
    char Section;
    double cgpa;
    
    void info()
    {
        System.out.println("Name : "+Name+"\nId : "+Id+"\nSection : "+Section+"\ncgpa : "+cgpa);
    }
    public static void main(String[] args) {
        
        Student obj1 = new Student();
        
        obj1.Name="Md.Firozzaman";
        obj1.Id=180201130;
        obj1.Section='B';
        obj1.cgpa=2.70;
        
        Student obj2 = new Student();
        
        obj2.Name="Rageeb Intisar Polok";
        obj2.Id=180201130;
        obj2.Section='B';
        obj2.cgpa=2.90;
        
        obj1.info();
        System.out.println();
        obj2.info();
        
        System.out.println("\nAssignment of Object : ");
        
        /*Student obj3 = new Student();
        obj3=obj2;
        obj3.info();*/
        
        Student obj3 = obj1;
        obj3.info();
        
        //obj3=obj2=obj1;
        
        //obj.info("Md.Firozzaman",180201130, 'B', 2.70);
    }
}
