
package com.mycompany.actividaddosmiercoles;

import java.util.Scanner;

public class actividaddos {

    public static void main(String[] args) {
        int numeroUno,numeroDos,numeroTres,suma,resta;
        double multiplicacion, division;
        Scanner valorIngresado= new Scanner(System.in);
        System.out.print("Deme un primer numero entero: ");
        numeroUno=valorIngresado.nextInt();
        System.out.print("Deme un segundo numero entero: ");
        numeroDos=valorIngresado.nextInt();
        System.out.print("Deme un tercer numero entero: ");
        numeroTres=valorIngresado.nextInt();
        
        suma=numeroUno+numeroDos+numeroTres;
        resta=numeroUno-numeroDos-numeroTres;
        multiplicacion=numeroUno*numeroDos*numeroTres; 
        division= (double)numeroUno/numeroDos/numeroTres;
        
        if(numeroUno==numeroDos){
            if(numeroUno==numeroTres){
                if(numeroDos==numeroTres){
                    System.out.println("Los tres numeros son iguales");
                    System.out.println("La suma es: "+(suma));
                    System.out.println("La resta es: "+(resta));
                }
            }
        }
        if(numeroUno>numeroDos){
            if(numeroUno>numeroTres){
                System.out.println("La multiplicacion es: "+multiplicacion);
            }
        }
        if(numeroDos>numeroUno){
            if(numeroDos>numeroTres){
                System.out.println("La division es: "+division);
            }
        }
        if(numeroTres>numeroUno){
            if(numeroTres>numeroDos){
                System.out.println("La multiplicacion es: "+multiplicacion);
                System.out.println("La suma es: "+suma);
                System.out.println("La division de los dos resultados anteriores es: "+(multiplicacion)/(suma));
            }
        }

        
    }
}