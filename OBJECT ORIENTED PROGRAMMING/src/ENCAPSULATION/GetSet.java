
package ENCAPSULATION;


public class GetSet {
    
    private String name;
    private int id;
    String getName()
    {
        return name;
    }
    int getId()
    {
        return id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    void setId(int id)
    {
        this.id=id;
    }
    
}

class TestGetSet{
    
    public static void main(String[] args) {
        
        GetSet obj = new GetSet();
        obj.setName("Md.Firozzaman");
        obj.setId(180201130);
        System.out.println("Name : "+obj.getName());
        System.out.println("Id : "+obj.getId());
    }
}


