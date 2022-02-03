package Bin2Dec;

import java.io.IOException;
import java.util.Scanner;

public class Bin2Dec {
    
    public static void main(String[] args) throws IOException{
        int charIngresados = 0;
        int acumulador = 0;
        boolean enterKey = false;

        System.out.print("Inserte un numero binario\n");{
        
        
        int byteValue = System.in.read();
        charIngresados++;
        Character charIngresado = (Character) ((char) byteValue);
        int intIngresado = Character.getNumericValue(charIngresado);
        boolean esBit = intIngresado == 1 || intIngresado == 0;
        boolean inputValido = charIngresados <= 8 && esBit; 

        while (inputValido){
            
            acumulador = (2 * acumulador) +  intIngresado; 
            byteValue = System.in.read();
            charIngresados++;
            enterKey = (byteValue == 13 || byteValue == 10);
            if (enterKey) 
                break;
            charIngresado = (Character) ((char) byteValue);
            intIngresado = Character.getNumericValue(charIngresado);
            esBit = intIngresado == 1 || intIngresado == 0;
            inputValido = charIngresados <=8 && esBit;
        }

        if (enterKey){
            System.out.print("Res: " + acumulador);
        }else if (!esBit){
            System.out.print("No ha ingresado un numero en binario - " + intIngresado + " no es un bit" );}
        else {
            System.out.print("Ha superado el limite. El largo de su numero es mayor a 8 (" + charIngresados + ")");
        }


            
        };

        
    }

}
