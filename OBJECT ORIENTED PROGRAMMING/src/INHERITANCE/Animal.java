
package INHERITANCE;


class Animal {
    
    public void show1()
    {
        System.out.println("Every animal must eat to survive.");
    }
    
}
class Dog extends Animal{
    
    public void show2()
    {
        System.out.println("Barking...");
    }
    
}
class Cat extends Dog{
    
    public void show3()
    {
        System.out.println("Meaoo...");
    }
}
class TestAnimal{
    
    public static void main(String[] args) {
        
        Cat obj = new Cat();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}

