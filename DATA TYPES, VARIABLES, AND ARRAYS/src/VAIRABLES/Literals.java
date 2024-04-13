
package VAIRABLES;


public class Literals {
    
    void Integer()
    {
        int a=0b1010,b=0b0;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        
        int x=180_201_130;
        System.out.println("x : "+x);
        
        int r=1117__6332__17;
        System.out.println("r : "+r);
        
        //int bn=0b__1001__1000__111;
        int bn=0b1001__1000__111;
        System.out.println("bn : "+bn);
    }
    
    public static void main(String[] args) {
        
        Literals obj = new Literals();
        
        obj.Integer();
        
    }
    
}
