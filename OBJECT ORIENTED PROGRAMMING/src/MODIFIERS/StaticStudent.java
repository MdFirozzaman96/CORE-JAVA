
package MODIFIERS;

public class StaticStudent {
    String Name,Dept;
    int Id;
    double cgpa;
    static String UniversityName = "Bangladesh Army University of Science and Technology";
    
    public void info(String name,String dpt,int id,double cg)
    {
        System.out.println("University Name : "+UniversityName+"\nName : "+name+"\nDepartment : "+dpt+"\nId : "+id+"\nCGPA : "+cg);
        System.out.println();
    }
    
}
l