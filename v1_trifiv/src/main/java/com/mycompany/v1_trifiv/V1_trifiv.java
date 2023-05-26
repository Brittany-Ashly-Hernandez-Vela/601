
package com.mycompany.v1_trifiv;

import java.util.Scanner;


public class V1_trifiv {

    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
	

int  num;
float a;
float b;




System.out.println ("Ingresa un numero entero" ); 

num=leer.nextInt();

a= num%3;
b=num%5;


if (a==0 && b==0) {
	

	System.out.println ("TRIFIV"  );
        
}if(b == 0) {

	System.out.println ("FIV" );
	
}if(a==0){
            
       System.out.println("TRI"); 
          
          
   } 
    }
}
