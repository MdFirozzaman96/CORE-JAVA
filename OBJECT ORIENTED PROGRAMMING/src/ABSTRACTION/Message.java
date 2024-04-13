
package ABSTRACTION;



public abstract class Message {
    
    abstract void sendMessage();
    
}

class Implement{
    
    void sendMessage()
    {
        System.out.println("This message is implemented here.");
    }
}

class MessageTest{
    
    public static void main(String[] args) {
        
        Implement obj = new Implement();
        obj.sendMessage();
    }
}
