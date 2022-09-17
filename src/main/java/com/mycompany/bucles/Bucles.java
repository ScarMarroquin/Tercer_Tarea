
package com.mycompany.bucles;

import java.util.Scanner;


public class Bucles {

    public static void main(String[] args) {
        
        Scanner cd = new Scanner(System.in);
        
        
        System.out.println("INGRESE UN NUMERO PARA SACAR SU CUADRADO: \n");
        int num1 = cd.nextInt();
        
            while(num1 >=0 ){           //MIENTRAS EL NUMERO SEA 0 O POSITIVO
             int cuadrado = (int)Math.pow(num1, 2);
             
                System.out.println("EL NÚMERO "+num1+" ELEVADO AL CUADRADO ES: "+cuadrado);
                
               
                
                System.out.println("DIFITE OTRO NUMERO");
                    num1 = cd.nextInt();
            }
        
    }
}
