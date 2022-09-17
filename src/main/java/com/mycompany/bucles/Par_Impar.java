
package com.mycompany.bucles;

import java.util.Scanner;

public class Par_Impar {
 
    public static void main(String[] args) {
        
        Scanner pi = new Scanner(System.in);
        
            System.out.println("INGRESE UN NUMERO: \n");
            int num = pi.nextInt();
            
                while(num !=0){
                    
                    if(num%2==0){
                         System.out.println("EL NUMERO ES PAR: "+num);
                    }
                    else{
                        System.out.println("EL NUMERO ES IMPAR: "+num);
                    }
                   
                    System.out.println("INGRESE UN NUMERO: \n");
                    num = pi.nextInt();
                }
    }
}
