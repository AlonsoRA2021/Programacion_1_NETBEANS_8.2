
package com.mycompany.ejemplodoslunes;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class claseocho {

    public static void main(String[] args) {
        /*int numero;
        float numeroDecimalUno= 10.5f;
        double numeroDecimalDos;
        char caracter;
        String cadena;
        */
        //Salida estandar 
        /*System.out.print("Hola mundo"); // Mostrar sin saltar
        System.out.println("Hola mundo");// mostrar con salto de linea 
        */
        /*
        //Entrada estandar 
        Scanner valorIngresado= new Scanner(System.in);//Crear una variable para el ingreso del dato
        System.out.print("Deme un numero entero: ");
        numero=valorIngresado.nextInt();//leer 
        System.out.print("Deme un valor decimal: ");
        numeroDecimalUno=valorIngresado.nextFloat();//leer
        System.out.print("Deme un caracter ");
        caracter=valorIngresado.next().charAt(5);
        System.out.print("Deme una cadena ");
        cadena=valorIngresado.next();
        // mostramos el contenido 
        System.out.println("El numero entero ingresado es: "+ numero+"\n"
                         + "El numero decimal ingresado es: "+numeroDecimalUno+"\n"
                         + "El caracter ingresado es: "+caracter+"\n"
                         + "La cadeba de datos ingresada es: "+cadena); */
    //ventanas 
    /*
    JOptionPane.showMessageDialog(null, "Hola mundo");
    
    numero= (int)Integer.parseInt(JOptionPane.showInputDialog("Deme un valor entero: "));
    numeroDecimalDos= (double)Double.parseDouble(JOptionPane.showInputDialog("Deme un valor decimal: "));
    caracter=(char)JOptionPane.showInputDialog("Deme un caracter").charAt(0);
    cadena= (String)JOptionPane.showInputDialog("Deme una cadena de texto");
    
     JOptionPane.showMessageDialog(null,"El numero entero ingresado es: "+ numero+"\n"
                                        + "El numero decimal ingresado es: "+numeroDecimalDos+"\n"
                                        + "El caracter ingresado es: "+caracter+"\n"
                                        + "La cadeba de datos ingresada es: "+cadena );  */
    //Operadores
    int numeroUno, numeroDos, suma, resta, modulo;
    double multiplicacion, division;
    Scanner entrada= new Scanner(System.in);
        /* System.out.print("Deme un valor para el primer numero: ");
        //numeroUno= entrada.nextInt();
       // System.out.print("Deme un valor para el segundo numero: ");
       // numeroDos=entrada.nextInt();
        
        suma=numeroUno+numeroDos;
        resta=numeroUno-numeroDos;
        multiplicacion=numeroUno*numeroDos; 
        division= (double)numeroUno/numeroDos;
        modulo= numeroUno % 2;
        /*
        System.out.println("El primer valor es: "+numeroUno);
        System.out.println("El segundo valor es: "+numeroDos);
        System.out.println("La suma de "+numeroUno+" + "+numeroDos+" es: "+suma);
        System.out.println("La resta de "+numeroUno+" - "+numeroDos+" es: "+resta);
        System.out.println("La multiplicacion de "+numeroUno+" * "+numeroDos+" es: "+multiplicacion);
        System.out.println("La division de "+numeroUno+" / "+numeroDos+" es: "+division);
        System.out.println("El mod 2 de "+ numeroUno+ " es "+modulo);*/
        //Operadores de asignacion 
        //+
        numeroUno=5;
        numeroUno=numeroUno+5;//Incrementa en 5
        System.out.println(numeroUno);
        numeroUno=5;
        numeroUno+=5; //Incrementa en 5
        System.out.println(numeroUno);
        //-
        numeroUno=5;
        numeroUno=numeroUno-5;
        System.out.println(numeroUno);
        numeroUno=5;
        numeroUno-=5;
        System.out.println(numeroUno);
        // /
        numeroUno=5;
        numeroUno=numeroUno/5;
        System.out.println(numeroUno);
        numeroUno=5;
        numeroUno/=5;
        System.out.println(numeroUno);
        
        //*
        numeroUno=5;
        numeroUno=numeroUno*5;
        System.out.println(numeroUno);
        numeroUno=5;
        numeroUno*=5;
        System.out.println(numeroUno);
        
        //prefijos y sufijos 
        //+
        numeroUno=5;
        System.out.println(numeroUno);
        numeroDos=numeroUno++;
        System.out.println(numeroDos);
        
        numeroUno=5;
        numeroDos=++numeroUno;
        System.out.println(numeroUno);
        System.out.println(numeroDos);
        
        // -
        
        numeroUno=5;
        numeroDos=numeroUno--;
        System.out.println(numeroUno);
        System.out.println(numeroDos);
        
        numeroUno=5;
        numeroDos=--numeroUno;
        System.out.println(numeroUno);
        System.out.println(numeroDos);
        
    }
    
}
