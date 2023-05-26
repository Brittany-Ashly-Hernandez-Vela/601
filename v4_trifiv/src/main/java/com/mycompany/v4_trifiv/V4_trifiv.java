

package com.mycompany.v4_trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.mycompany.v4_trifiv.func;

public class V4_trifiv {

    public static void main(String[] args) throws IOException {
         
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero; 
    
      //creo objeto
      func funcion = new func();
      
      //Entrada de datos
      
     System.out.println("Dame el numero");
     numero = Integer.parseInt(bufEntrada.readLine());
     
     System.out.println(func.retornaMultiplo(numero));
    }
}
