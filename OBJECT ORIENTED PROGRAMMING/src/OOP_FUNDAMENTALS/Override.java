
package OOP_FUNDAMENTALS;


class Override {
    
    protected void msg()
    {
        System.out.println("The default modefier is more restrictive than protected.That is why there is compile time error.");
    }
    
}
class Access extends Override{
    
    void msg()
    {
        System.out.println("The default modefier is more restrictive than protected.That is why there is compile time error.");
    }
    
    public static void main(String[] args) {
        
        Access obj = new Access();
        obj.msg();
        
    }
}
