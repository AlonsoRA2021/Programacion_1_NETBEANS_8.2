
package com.mycompany.simulacroexamen;

import java.util.Objects;
import java.util.Scanner;

public class simulacro {

    //variables de clase nenesarias 
    public static int numeroTelefono;
    public static String nombre, direccion;
    
    
    public static void main(String[] args) {
       validarUsuarios();
    }
    
    public static void validarUsuarios(){
        try{
            int contrasena;
            String usuario;
            Scanner valor= new Scanner(System.in);
            System.out.print("Deme el usuario: ");
            usuario=(String) valor.next();
            System.out.print("Deme la contraseña de usuario: ");
            contrasena=(int) valor.nextInt();
            if((Objects.equals(usuario, "admin"))&&(Objects.equals(contrasena, 123))){
                menuSistema();
            } 
        }catch(Exception e){
            System.out.println("Datos no permitidos "+ e);
            validarUsuarios();
        } 
    }
    
    public static void menuSistema() {
        
        try{
            boolean bandera=true;
            int menu;
            Scanner valor = new Scanner(System.in);
            do{
                System.out.print("\t\t\tMenu de Sistema\n"
                        + "\t1. Ingresar datos de cliente\n"
                        + "\t2. Mostrar datos de cliente\n"
                        + "\t3. Borrar datos de cliente\n"
                        + "\t4. Para salir del sistema\n"
                        + "\t   Ingrese un valor: ");
                menu=(int)valor.nextInt();
                switch(menu){
                    case 1: 
                        cargarDatos();
                        break;
                    case 2:
                        mostrarDatos();
                        break;
                    case 3: 
                        borrarDatos();
                        break;
                    case 4:
                        bandera=false;
                        System.exit(0);
                        break;
                }
                
            }while(bandera==true);
        }catch(Exception e){
           menuSistema();
        }
    }
    
    public static void cargarDatos() {
        try{
            Scanner valor= new Scanner(System.in);
            int menu;
           do{
               //limpiarPantalla();
               System.out.print("\t\t\tCargar datos de Cliente\n"
                       + "\t1. Para cargar nombre de Cliente\n"
                       + "\t2. Para cargar direccion de Cliente\n"
                       + "\t3. Para cargar telefono\n"
                       + "\t4. Para regresar al menu principal\n"
                       + "\t   Ingrese un valor: ");
               menu=(int)valor.nextInt();
               switch(menu){
                   case 1: 
                       System.out.print("Deme el nombre a registrar: ");
                       nombre=(String)valor.next();
                       break;
                   case 2: 
                       System.out.print("Deme la direccion a registrar: ");
                       direccion=(String)valor.next();
                       break;
                   case 3: 
                       System.out.print("Deme el telefono a registrar: ");
                       numeroTelefono=(int)valor.nextInt();
                       break;
                   case 4: 
                       menuSistema();        
               }
           } while(true);
        }catch(Exception e){
            cargarDatos();
        }
    }
    
    public static void mostrarDatos() {
        try{
            Scanner valor= new Scanner(System.in);
            int menu;
           do{
               //limpiarPantalla();
               System.out.print("\t\t\tMostrar datos de Cliente\n"
                       + "\t1. Para mostrar nombre de Cliente\n"
                       + "\t2. Para mostrar direccion de Cliente\n"
                       + "\t3. Para mostrar telefono\n"
                       + "\t4. Para regresar al menu principal\n"
                       + "\t   Ingrese un valor: ");
               menu=(int)valor.nextInt();
               switch(menu){
                   case 1: 
                       System.out.println("El nombre del cliente es: "+nombre);
                       break;
                   case 2: 
                       System.out.println("La direccion del cliente es: "+ direccion);
                       break;
                   case 3: 
                       System.out.println("El numero del cliente es: "+numeroTelefono);
                       break;
                   case 4: 
                       menuSistema();        
               }
           } while(true);
        }catch(Exception e){
            mostrarDatos();
        }
    }
    
   public static void borrarDatos() {
        try{
            Scanner valor= new Scanner(System.in);
            int menu;
           do{
               //limpiarPantalla();
               System.out.print("\t\t\tCargar datos de Cliente\n"
                       + "\t1. Para borrar nombre de Cliente\n"
                       + "\t2. Para borra direccion de Cliente\n"
                       + "\t3. Para borrar telefono\n"
                       + "\t4. Para regresar al menu principal\n"
                       + "\t   Ingrese un valor: ");
               menu=(int)valor.nextInt();
               switch(menu){
                   case 1: 
                       System.out.print("Borrando nombre .....  ");
                       nombre=(String)"";
                       break;
                   case 2: 
                       System.out.print("Borrando direccion .....  ");
                       direccion=(String)"";
                       break;
                   case 3: 
                       System.out.print("Borrando telefono ..... ");
                       numeroTelefono=(int)0;
                       break;
                   case 4: 
                       menuSistema();        
               }
           } while(true);
        }catch(Exception e){
            cargarDatos();
        }
    } 
    
    
    public static void limpiarPantalla()
            {
            try{
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                //new ProcessBuilder("cmd","/c","ping www.google.com").inheritIO().start().waitFor();
            }   catch(Exception e){
                
            }       
            
            }
    
}
