/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author PC
 */
public class hurufZ {
 public static void main(String[] args) {
     int z=4;
      for(int a=1; a<=5; a++) {
          if( a==1 || a==5) {
              for(int b=1; b<=5; b++) {
                  System.out.print("z");
              }
          }
          else{
              for(int b=1; b<=5; b++){
                  if(b==z){
                      System.out.print("z");                     
                  }
                  else{System.out.print(" ");                  
                  }
              }
              z--;
              System.out.println(" ");
          }
          
      }       
 }
}

