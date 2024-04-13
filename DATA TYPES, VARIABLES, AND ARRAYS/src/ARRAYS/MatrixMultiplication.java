
package ARRAYS;

import java.util.Scanner;


public class MatrixMultiplication {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int r1,c1;
        System.out.print("Enter row and column number of the first matrix : ");
        r1=obj.nextInt();
        c1=obj.nextInt();
        
        // Defining the first 2D matrix with size (r1 X c1):
        int [][] M1 = new int[r1][c1];
        
        System.out.println("Enter elements of the first 2D matrix : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                M1[i][j]=obj.nextInt();
            }
        }
        
        int r2,c2;
        System.out.print("Enter row(must be equal to c1) and column number of the first matrix : ");
        r2=obj.nextInt();
        c2=obj.nextInt();
        // Defining the second 2D matrix with size (r2 X c2):
        int [][] M2 = new int [r2][c2];
        
        System.out.println("Enter elements of the first 2D matrix : ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                M2[i][j]=obj.nextInt();
            }
        }
        
        // Matrix Multiplication Operation : 
        
        // Defining another 2D matrix for assining with size (r1 X c2) :
        int [][] Mul=new int[r1][c2];
        
        for(int k=0;k<r1;k++)
        {
            for(int i=0;i<c2;i++)
            {
                int x=0;
                for(int j=0;j<r2;j++)
                {
                    x+=M1[k][j]*M2[j][i];
                }
                Mul[k][i]=x;
            }
        }
        System.out.println("\nThe resulting multiplicated matrix between Matrix M1 and M2 is : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(Mul[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
}
