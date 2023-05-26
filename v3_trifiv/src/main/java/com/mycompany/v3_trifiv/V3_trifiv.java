

package com.mycompany.v3_trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3_trifiv {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero; 
        float mult3;
        float mult5;
      
     
        
       System.out .println("Dame el numero: ");
        numero = Integer.parseInt(bufEntrada.readLine());
       

        
      mult3 = numero%3;
      mult5 = numero%5;
        
                System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo (int num)
    {
        if (num % 3 == 0 && num % 5 == 0)
        {
            return "TRIFIV";
        }
        if (num%3 == 0)
        {
            return "TRI";
    }
        if(num%5 == 0)
        {
            return "FIV";
        }
    return "NO ES MULTIPLO DE NINGUNO" ;
        
     
    }
}
