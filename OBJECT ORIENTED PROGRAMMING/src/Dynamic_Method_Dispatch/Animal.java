
package Dynamic_Method_Dispatch;



public class Animal {
    
    void eat()
    {
        System.out.println("Eating...");
    }
    
}

class Dog extends Animal{
    
    void eat()
    {
        System.out.println("The Dog Eating Bread...");
    }
}

class Cat extends Animal{
    
    void eat()
    {
        System.out.println("The Cat Eating Milk...");
    }
}

class Lion extends Animal{
    
    void eat()
    {
        System.out.println("The Lion Eating Meat...");
    }
}

class AnimalTest{
    
    public static void main(String[] args) {

        Animal obj;
        
        obj = new Lion();
        obj.eat();
        
        obj = new Dog();
        obj.eat();
        
        obj = new Cat();
        obj.eat();
        
    }
}
