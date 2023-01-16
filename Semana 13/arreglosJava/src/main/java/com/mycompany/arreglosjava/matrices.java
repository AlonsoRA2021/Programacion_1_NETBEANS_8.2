
package com.mycompany.arreglosjava;

import java.util.Scanner;

public class matrices {
    
   public static String cliente[][]=new String[3][3];
   
   public static void matriz(){ 
       //matrizUno();
       cargarDatosCliente();
       mostrarDatosClienteLista();
   }
   
   public static void matrizUno(){
       int tabla[][]=new int[3][3];
       tabla[0][0]=1;
       tabla[1][1]=1;
       tabla[2][2]=1;
       for(int f=0;f<3;f++){ //se recorren las filas
           for(int c=0;c<3;c++){ //se recorren las columnas
               System.out.print("|"+tabla[f][c]+"|\t");
           }
           System.out.println("");
       }
   }
   
   public static void cargarDatosCliente(){
       Scanner dato=new Scanner(System.in);
       cliente[0][0]="Cedula";
       cliente[0][1]="Nombre";
       cliente[0][2]="Telefono";
       for(int f=1;f<3;f++){
           for(int c=0;c<3;c++){
               if(c==0){
                   System.out.print("Deme la cedula del Cliente: ");
                   cliente[f][c]=(String)dato.nextLine();
               }else if(c==1){
                    System.out.print("Deme el Nombre del Cliente: ");
                    cliente[f][c]=(String)dato.nextLine();  
               }else if(c==2){
                    System.out.print("Deme el telefono del Cliente: ");
                    cliente[f][c]=(String)dato.nextLine();  
               }
           }
       }
       
   }
   
   
  public static void mostrarDatosCliente(){
      for(int f=0;f<3;f++){
          for(int c=0;c<3;c++){
              System.out.print("\t"+cliente[f][c]+"\t\t");
          }
          System.out.println("");
      }
  }
  
  public static void mostrarDatosClienteLista(){
    for(int f=1;f<3;f++){
        for(int c=0;c<3;c++){
            if(c==0){
                System.out.println("La Cedula del Cliente "+(f)+" es: "+cliente[f][c]);
                   
            }else if(c==1){
                System.out.println("El Nombre del Cliente "+(f)+" es: "+cliente[f][c]);
                      
            }else if(c==2){
                System.out.println("El Telefono del Cliente "+(f)+" es: "+cliente[f][c]);  
            }
        }
    }

 
            
  }
  
    
    
}
