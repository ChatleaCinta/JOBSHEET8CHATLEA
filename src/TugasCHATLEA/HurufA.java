/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasCHATLEA;

/**
 *
 * @author PC
 */
public class HurufA {
 public static void main(String[] args){
     int i,j,k,l;
     for(i=0; i<=11; i++)
     {
         for(j=10; j>=i; j--)
         {
             System.out.print(" ");
         }
         for(k=0; k<=2; k++)
         {
             System.out.print("a");
         }
         for(l=1; l<=i; l++)
         {
            if(i>4 && i<7)
            {
                System.out.print("aa");
            }
            else{
                System.out.print("  ");
            }
         }
         for(k=0; k<=2; k++)
         {
             System.out.print("a");
         }
         for(j=10; j>=i; j--)
         {
             System.out.print(" ");
         }
         System.out.print("\n");
     }
 }   
}
