
package ARRAYS;

import java.util.Scanner;

public class UnequalSecondDimension {
    
    public static void main(String[] args) {
        
        // Since multidimensional arrays are actually arrays of arrays, the length of each array is under our control.
        System.out.println("Since multidimensional arrays are actually arrays of arrays, the length of each array is under our control.\n");
        
        int SecondDim[][]=new int[5][];
        
        SecondDim[0]=new int [5];
        SecondDim[1]=new int [4];
        SecondDim[2]=new int [3];
        SecondDim[3]=new int [2];
        SecondDim[4]=new int [1];
        
        Scanner element = new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter "+(5-i)+" elements for SecondDim["+i+"] : ");
            for(int j=0;j<(5-i);j++)
            {
                SecondDim[i][j]=element.nextInt();
            }
        }
        System.out.println("\nThe Eelemnts of Array SecondDim[5][] : ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<(5-i);j++)
            {
                System.out.print(SecondDim[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
