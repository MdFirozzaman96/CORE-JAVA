
package ENCAPSULATION;


public class WriteOnly {
    
    private int Id;
    
    void setId(int id)
    {
        this.Id=id;
    }
    
}

class TestWriteId{
    
    public static void main(String[] args) {
        
        WriteOnly obj = new WriteOnly();
        obj.setId(130);
    }
}
