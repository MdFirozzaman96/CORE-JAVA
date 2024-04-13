
package SUPER_KEYWORD;

public class Info {
    
    String name="Md.Firozzaman";
    int id=130;
    
}

class Spy extends Info{
    
    String name="Md. Rakib";
    int id=140;
    
    void showInfo()
    {
        System.out.println("Name : "+name+"  Id : "+id);
        System.out.println("Name1 : "+super.name+"  Id1 : "+super.id);// Here name and id are hidden.
    }
    
}

class SuperTest{
    
    public static void main(String[] args) {
        
        Spy obj = new Spy();
        obj.showInfo();
    }
}
