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
public class HurufC {
    public static void main(String[] args){
int i,j,k;
for(i=0; i<=11; i++)
{
    for(j=0; j<=2; j++)
    {
        System.out.print("c");
    }
    for(k=1; k<=5; k++)
    {
        if(i>=0 && i<2 || i>9 && i<=11)
        {
            System.out.print("cc");
        }
        else
        {
            System.out.print("  ");
        }    
        }
System.out.print("\n");
    }
}
}
