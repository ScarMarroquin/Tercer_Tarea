
package com.mycompany.bucles;

import java.util.Scanner;

public class Adivinar_Numero {

    public static void main(String[] args) {
        Scanner An = new Scanner(System.in);
        
        int aleatorio, num, contador =0;
                    
        aleatorio = (int)(Math.random()*100);      //ES DE TIPO DOUBLE      --GENERA UN NUMERO ALEATORIO ENTRE 0 Y 100
        
            //System.out.println(aleatorio);
        
            do{
                System.out.println("INGRESE UN NUMERO");
                 num = An.nextInt();
                    if(aleatorio>num){
                        System.out.println("DIGITE UN NUMERO MAYOR: ");
                    }
                    else{
                        System.out.println("DIGITE UN NUMERO MENOR: ");
                    }
               contador++;
                    
            }while(num != aleatorio);
            
                System.out.println("**GENIAL ADIVINO EL NUMERO**");
                System.out.println("**EL NUMERO DE INTENTOS FUE: "+contador+" **");
    }
}
