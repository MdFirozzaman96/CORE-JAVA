
package Student_File;

public class Student {
    String Name;
    int ID;
    double CGPA;
    void set(String name,int id,double cgpa)
    {
        this.Name = name;
        this.ID = id;
        this.CGPA = cgpa;
    }
    void show()
    {
        System.out.println("Name : "+Name);
        System.out.println("ID : "+ID);
        System.out.println("CGPA : "+CGPA);
        System.out.println();
    }
    
}
