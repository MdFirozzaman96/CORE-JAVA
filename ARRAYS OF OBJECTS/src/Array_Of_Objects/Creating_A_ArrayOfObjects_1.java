
package Array_Of_Objects;

public class Creating_A_ArrayOfObjects_1 {
    String Name;
    int ID;
    double GPA;
    void set(String name,int id,double gpa)
    {
        this.Name = name;
        this.ID = id;
        this.GPA = gpa;
    }
    void show()
    {
        System.out.println("Name : "+Name);
        System.out.println("ID : "+ID);
        System.out.println("GPA : "+GPA);
        System.out.println();
    }
    
}
