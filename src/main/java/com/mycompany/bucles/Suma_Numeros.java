
package com.mycompany.bucles;

import java.util.Scanner;


public class Suma_Numeros {
    
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        
        int num; 
        int suma=0;
            
                do{
                    System.out.println("INGRESE UN NUMERO: ");
                    num = sm.nextByte();
                    
                    suma= suma+num;
                }while(num!=0);
                System.out.println("LA SUMA DE LOS NUMERO ES: "+suma);
    }
}
