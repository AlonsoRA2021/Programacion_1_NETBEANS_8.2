
package com.mycompany.arreglosjava;

import static com.mycompany.arreglosjava.matrices.matriz;
import java.util.Scanner;

public class arreglos {
    
    public static int vectorClase[]=new int[100]; //se le indica la capacidad de datos []

    public static void main(String[] args) {
        //vectorUno();
        //vectorDos();
        //vectorTres();
        //vectorCargar();
        //vectorMostrar();
        //modificarVector();
        //borrarPosicionVector();
        matriz();
    }
    
    
    
    
    
    
    //ejemplo como usar un vector como clase para llamarlo desde cualquier parte
    public static void vectorCargar(){
        for(int i=0;i<10;i++){ //de los 100 solo se utilizaran 10
            vectorClase[i]=(int)(Math.random()*10);
        }
    }
    public static void vectorMostrar(){
        for(int i=0;i<10;i++){
            System.out.print((i+1)+"-->"+vectorClase[i]+"\t");
        }
    }
            
    //ejemplos de vectores
    public static void vectorUno(){
        int vector[]=new int[2];
        vector[0]=1;
        vector[1]=2;
        //vector[2]=3;
        //vector[3]=4;
        System.out.println(vector[0]);
    }
    
    public static void vectorDos(){
        //completar los datos de un vector con un ciclo
        //definir las variables y el vector
        Scanner datos=new Scanner(System.in);
        //String valores=(String)datos.next();
        String valores="";
        String vector[]=new String[3];
        int modificar=0;
        //llenar los datos para el vector
        for(int i=0; i<3;i++){
            System.out.print("Deme la cadena "+(i+1)+": ");
            valores=(String)datos.next();
            vector[i]=valores;
        }
        //mostrar datos de un vector
        for(int i=0; i<3;i++){
            System.out.println("La cadena "+(i+1)+" es: "+vector[i]);
        }
        //modificar un dato en un arreglo
        System.out.println("Cual valor desea modificar(indique el numero): ");
        modificar=(int)datos.nextInt();
        modificar-=1; //o modificar=modificar-1;
        for(int i=0;i<3;i++){
            if(modificar==i){
                System.out.println("Deme la modificacion a la cadena "+(i+1)+": ");
                valores=(String)datos.next();
                vector[i]=valores;
            }
        }
        //mostrar datos de un vector
        for(int i=0;i<3;i++){
            System.out.println("La cadena "+(i+1)+" es: "+vector[i]);
        }
        //borrar datos del arreglo
        for(int i=0;i<3;i++){
            vector[i]="";
        }
        //mostrar datos de un vector
        for(int i=0;i<3;i++){
            System.out.println("La cadena "+(i+1)+" es: "+vector[i]);
        }
    }
    
    public static void vectorTres(){
        //vector de tamaño dinamico
        int tamano=0;
        Scanner dato =new Scanner(System.in);
        System.out.println("Indique el tamaño del vector: ");
        tamano=(int)dato.nextInt();
        int vector[]=new int[tamano];
        for(int i=0;i<tamano;i++){
            vector[i]=(int)(Math.random()*100);
        }
        System.out.println("Mostrando vector");
        for(int i=0;i<tamano;i++){
            System.out.println((i+1)+"-->"+vector[i]);
        }
 
    }
    
    //LAB crear una funcion para modificar un dato en especifico de vectorClase();
    //LAB crear una funcion para borrar un registro de vectorClase();
    public static void modificarVector(){
        int valorModificado, nuevoValor;
        Scanner valor=new Scanner(System.in);
        System.out.print("\nIndique el valor que desea modificar: ");
        valorModificado=(int)valor.nextInt();
        for(int i=0;i<10;i++){
            if(vectorClase[i]==valorModificado){
                System.out.println("Deme el valor para modificar: ");
                nuevoValor=(int)valor.nextInt();
                vectorClase[i]=nuevoValor;
                System.out.println("Registro modificado");
            }
        }
        vectorMostrar();
    }
    
    public static void borrarPosicionVector(){
        int posicion;
        Scanner valor=new Scanner(System.in);
        System.out.println("Indique la posicion que desea eliminar: ");
        posicion=(int)valor.nextInt();
        posicion-=1;
        for(int i=0;i<10;i++){
            if(posicion==i){
                vectorClase[i]=0;
            }
        }
        vectorMostrar();
    }
    
    

    
    
}
