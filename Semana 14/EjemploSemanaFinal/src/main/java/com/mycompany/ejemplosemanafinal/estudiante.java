
package com.mycompany.ejemplosemanafinal;

import java.util.Scanner;


public class estudiante {
    public static String estudiante[][]=new String[3][3];
    public static String notas[][]=new String[1000][4];
    public static Scanner dato=new Scanner(System.in);
    public static int conteoNotas;
    
    public static void main(String[] args) {
      completarDatosInicio();
      conteoNotas=1;
      menu();
    }
    public static void completarDatosInicio(){
      estudiante[0][0]="CEDULA";
      estudiante[0][1]="NOMBRE";
      estudiante[0][2]="TELEFONO";
      estudiante[1][0]="306660666";
      estudiante[1][1]="DANIEL";
      estudiante[1][2]="88888888";
      estudiante[2][0]="304440444";
      estudiante[2][1]="YENDRY";
      estudiante[2][2]="83838383";
      notas[0][0]="ID NOTA";
      notas[0][1]="NOMBRE MATERIA";
      notas[0][2]="NOTA MATERIA";
      notas[0][3]="CEDULA ESTUDIANTE";
    }
    public static void menu(){
        boolean bandera=true;
        int menu;
        //Scanner dato=new Scanner(System.in);
       do{
           System.out.print("\t\tMENU DE SISTEMA INGRESO NOTAS\n\n\n"
                           +"\t1. Mostrar estudientes\n"
                           +"\t2. Ingresar notas\n"
                           +"\t3. Buscar notas por cedula\n"
                           +"\t4. Salir\n"
                           +"\tIndique lo que desea hacer en el Sistema: ");
           menu=(int)dato.nextInt();
           switch(menu){
               case 1:
                   System.out.println("Mostrando estudiantes\n\n");
                   mostrarEstudiantes();
                   break;
               case 2:
                   System.out.println("Ingreso de notas\n"+conteoNotas);
                   llenarNotas();
                   break;
               case 3:
                   System.out.println("Mostrando notas\n");
                   buscarCedula();
                   break;
               case 4:
                   bandera=false;
                   break;
                   
           }
           
       }while(bandera==true); 
    }
    
    public static void mostrarEstudiantes(){
        for(int f=0; f<3;f++){
            for(int c=0;c<3;c++){
                System.out.print("\t"+estudiante[f][c]+"\t\t");
            }
            System.out.println("");
        }
    }
    public static void llenarNotas(){
        try{
            String cedula;
                    String valorID=String.valueOf(conteoNotas);
                    System.out.print("Deme una cedula de estudiante: ");
                    cedula=(String)dato.next();
                    boolean existe=true;
                    for(int f=1;f<3;f++){
                     if(cedula.equals(estudiante[f][0])){
                              for(int c=0;c<4;c++){
                                   if(c==0){ 
                                       notas[conteoNotas][c]=valorID;
                                   }else if(c==1){
                                       System.out.print("Ingrese el nombre de la materia: ");
                                       notas[conteoNotas][c]=(String)dato.next();
                                   }else if(c==2){
                                       System.out.print("Ingrese el Nota de la materia: ");
                                       notas[conteoNotas][c]=(String)dato.next();
                                   }else if(c==3){
                                       System.out.print("Ingrese el la cedula de la materia: ");
                                       notas[conteoNotas][c]=cedula;
                                   }
                                }
                              conteoNotas+=1;
                              existe=true;
                                
                     }else{
                         existe=false;
                     }
                    }
                    if (existe==false){
                        System.out.println("Estudiente no existe en la base de datos");
                    }
                    
        }catch(Exception e){
            
            menu();
            
        }
        
    }    
    public static void buscarCedula(){
        int cedula;
        int cedulaInterna;
        try{
        System.out.print("Deme una cedula de estudiante: ");
        cedula=(int)dato.nextInt();
        
        for(int f=1;f<=1000;f++){
            cedulaInterna=Integer.parseInt(notas[f][3]);
            if(cedula==cedulaInterna){
                System.out.println("Mostrando notas de cedula "+cedula); 
                System.out.println("Nombre de materia "+notas[f][1]);
                System.out.println("Nota de materia "+notas[f][2]);
                System.out.println("--------------------------------------");
            }
        }
        }catch(Exception e){
            System.out.println("Final de notas de estudiante");
            menu();
        }
    }

}
