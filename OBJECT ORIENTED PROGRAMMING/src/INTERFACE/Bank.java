
package INTERFACE;


public interface Bank {
    
    public float rateOfInterest();
    
}

class SBI implements Bank{
    
    public float rateOfInterest()
    {
        return 5.7f;
    }
}

class TBI implements Bank{
    
    public float rateOfInterest()
    {
        return 7.8f;
    }
}

class TestBank{
    
    public static void main(String[] args) {
        
        Bank s = new SBI();
        Bank t = new TBI();
        
        System.out.println("Rate of Interest of SBI : "+s.rateOfInterest());
        System.out.println("Rate of Interest of TBI : "+t.rateOfInterest());
    }
}

