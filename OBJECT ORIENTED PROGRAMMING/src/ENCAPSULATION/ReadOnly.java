
package ENCAPSULATION;



public class ReadOnly {
    
    private String universityName="Bangladesh Army University of Science and Technology";
    
    public String getUniversity()
    {
        return universityName;
    }   
}

class TestReadOnly{
    
    public static void main(String[] args) {
        
        ReadOnly obj = new ReadOnly();
        System.out.println(obj.getUniversity());
    }
}


