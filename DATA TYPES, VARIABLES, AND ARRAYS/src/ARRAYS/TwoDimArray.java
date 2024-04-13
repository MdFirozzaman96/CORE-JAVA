
package ARRAYS;

import java.util.Scanner;

public class TwoDimArray {
    
    public static void main(String[] args) {
        
        int TwoD[][] = new int[4][5];
        System.out.println("Enter elements of the two dimensional array : ");
        
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                TwoD[i][j]=obj.nextInt();
            }
        }
        System.out.println("\nThe elements of the two dimensional array are : ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(TwoD[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println();
    }
    
}
