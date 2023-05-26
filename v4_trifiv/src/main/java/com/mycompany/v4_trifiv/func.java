
package com.mycompany.v4_trifiv;


class func {
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
