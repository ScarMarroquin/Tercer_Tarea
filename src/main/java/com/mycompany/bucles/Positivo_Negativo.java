
package com.mycompany.bucles;

import java.util.Scanner;

public class Positivo_Negativo {
 
    public static void main(String[] args) {
         Scanner pn = new Scanner(System.in);
        
            System.out.println("INGRESE UN NUMERO: \n");
            int num = pn.nextInt();
            
                while(num !=0){         //MIENTRAS EL NUMEROS SEA DIFERENTE A CERO
                 
                    if(num>0){
                        System.out.println("EL NUMERO ES POSITVO: \n"+num);
                    }
                    else{
                        System.out.println("EL NUMERO ES NEGATIVO: \n"+num);
                    }
                    
                    System.out.println("INGRESE UN NUMERO");
                    num = pn.nextInt();
                }
        
        
        
        
    }
}
