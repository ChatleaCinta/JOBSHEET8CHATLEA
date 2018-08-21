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
public class HurufH {
    public static void main(String[] args){
        int i,j,k;
        for(i=0; i<=11; i++)
        {
        for(j=0; j<2; j++)    
        {
        System.out.print("h");
        }
        for(k=1; k<=5; k++)
        {
        if(i>4 && i<7)    
        {
        System.out.print("hh");
        }
        else
        {
        System.out.print("  ");
        }
        }
        for(j=0; j<2; j++)
        {
        System.out.print("h");
        }
        System.out.print("\n");
        }
    }
}