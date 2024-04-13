
package PracticeOf_InheritenceSuperFinal;



public class Has_A_Relationship {
    
    String village,city,country;
    Has_A_Relationship(String vl,String ct,String cn)
    {
        village=vl;
        city=ct;
        country=cn;
    }
    
}
class Info{
    
    String name,universityName,dept,batch;
    int id;
    Has_A_Relationship add;
    
    Info(String nm,String uniName,String dpt,int d,String bt)
    {
        name=nm;
        universityName=uniName;
        dept=dpt;
        batch=bt;
        id=d;
    }
    public void ShowInfo()
    {
        System.out.println("Name : "+name+"\nUniversity Name : "+universityName+"\nDepartment : "+dept+"\nId : "+id+"\nBatch : "+batch);
        System.out.println("Village : "+add.village);
        System.out.println();
    }
}

class Has_A_RelationshipTest{
    
    public static void main(String[] args) {
        
         Has_A_Relationship obj1 = new Has_A_Relationship("Betura","Dinajpur","Bangladesh");
         
         //obj1.address("Betura", "Dinajpur", "Bangladesh");
         Info obj2 = new Info("Md.Firozaman","BAUST","CSE",180201130,"8th");
         obj2.ShowInfo();
         
         Has_A_Relationship obj3 = new Has_A_Relationship("Saidpur", "Ranpur", "Bangladesh");
         
         //obj3.address("Saidpur", "Ranpur", "Bangladesh");
         Info obj4 = new Info("Rageeb Itisar Polok","BAUST","CSE",180201100,"8th");
         obj4.ShowInfo();
    }
}