

package com.mycompany.v2_trifiv;

import java.util.Scanner;


public class V2_trifiv {

    public static void main(String[] args) {
         Scanner leer=new Scanner (System.in);
	
int  n1 = 0;

System.out.println ("Ingresa un numero entero" );

n1=leer.nextInt();



if (n1 % 3 == 0 && n1 % 5 == 0 ) {
	
	
	
	System.out.println ("TRIFIV"  );
        
}else if(n1 % 5 == 0) {

	System.out.println ("FIV" );
	
}else if(n1 % 3 == 0 ){
            
       System.out.println("TRI"); 
          
          
   }else{}
    }
}
