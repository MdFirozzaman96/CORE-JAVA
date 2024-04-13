
package ABSTRACTION;



public abstract class Instantiate {
    
    abstract void message();
    void message1()
    {
        System.out.println("An abstract class can not be instantiated.");
    }
    
}

class Details{
    
    void message()
    {
        System.out.println("This is an abstract class can not be instantiated.");
    }
}

class InstantiateTest{
    
    public static void main(String[] args) {
          
        //Instantiate obj = new Instantiate();// Instantiate class is abstrat. can not be instantiated.
        Details obj1 = new Details();
        obj1.message();
    }
}

