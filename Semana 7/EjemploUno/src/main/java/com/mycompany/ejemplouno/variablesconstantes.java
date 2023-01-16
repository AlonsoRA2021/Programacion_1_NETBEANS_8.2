
package com.mycompany.ejemplouno;

import javax.swing.JOptionPane;

/**
 * 
 * @author Alonso
 */

public class variablesconstantes {

    public static void main(String[] args) {
    //Datos primitivos
    byte primerValorByte; //declarar una variable tipo+nombre
    primerValorByte=127; //Dar el valor a la variable
    byte segundoValorByte=10; //SEGUNDA FORMA declarar variable tipo+nombre+valor
        //salida estandar
        System.out.println("El primer valor Byte es: "+primerValorByte);
        System.out.println("El segundo valor Byte es: "+segundoValorByte);
        System.out.println("La suma de los valores es: "+(primerValorByte+segundoValorByte));
        System.out.println("La resta de los valores es: "+(primerValorByte-segundoValorByte));
        System.out.println("La multiplicacion de los valores es: "+(primerValorByte*segundoValorByte));
        System.out.println("La division de los valores es: "+(primerValorByte/segundoValorByte));
        //ventanas
        JOptionPane.showMessageDialog(null, "El primer valor Byte es: "+primerValorByte+"\n"
                                          + "El segundo valor Byte es: "+segundoValorByte+"\n"
                                          + "La suma de los valores es: "+(primerValorByte+segundoValorByte)+"\n"
                                          + "La resta de los valores es: "+(primerValorByte-segundoValorByte)+"\n"
                                          + "La multiplicacion de los valores es: "+(primerValorByte*segundoValorByte)+"\n"
                                          + "La division de los valores es: "+(primerValorByte/segundoValorByte)+"\n");
                                        
            /* Primitivos 
        Numericos enteros 
            byte 
            short
            int +usado
            long
        numericos decimales 
            float    float dato=3.14f;
            double   3.15
        texto 
        char
            char valor = 'a';
            char valor = 88; // en codigo ASCII es: X
        */
            
        /* No primitivos 
        Numericos 
         Integer 
             Integer valor = 1;
             Integer valor = NULL;
        Texto 
          String "Cadena de texto" 
            String variable = "hola mundo";
        */
        /*Constantes
        final tipodedato nombreConstante = valor;
        
        */
        
        final String CADENA="Hola mundo"; //toda constante debe ir en MAYUSCULA
        System.out.println(CADENA);
        //LAB 01 JAVA 
        //Para todos los tipos de datos, declarar estos y mostrar por salida estandar y ventana 
        //cada uno de ellos
        
        //LAB 1
        
        short valorShort=5;
        //salida estandar
        System.out.println(valorShort);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorShort);
        
        int valorInt=32766;
        //salida estandar
        System.out.println(valorInt);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorInt);
        
        long valorLong=150000000;
        //salida estandar
        System.out.println(valorLong);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorLong);
        
        float valorFloat=150000.200f;
        //salida estandar
        System.out.println(valorFloat);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorFloat);
        
        double valorDouble=50.20;
        //salida estandar
        System.out.println(valorDouble);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorDouble);
        
        char valorCharUno='c';
        char valorCharDos=33;
        //salida estandar
        System.out.println(valorCharUno);
        System.out.println(valorCharDos);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorCharUno+"\n"
                                           +valorCharDos+"\n");
        
        Integer valorInteger;
        valorInteger = 7;
        //salida estandar
        System.out.println(valorInteger);
        //salida ventana
        JOptionPane.showMessageDialog(null, valorInteger);
        
        String LabUno;
        String nombre = "Alonso";
        //salida estandar
        System.out.println(nombre);
        //salida ventana
        JOptionPane.showMessageDialog(null, nombre);
}
}
