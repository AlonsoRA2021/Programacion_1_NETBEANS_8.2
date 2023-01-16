/**
 * EXAMEN FINAL PROGRAMACION I UAM
 * @author Alonso Ramirez Araya
 * @docente Daniel Mendez Gutierrez
 * II Cuatrimestre 2021
 */

package com.mycompany.examenfinal;
//Se importan las librerias necesarias para este programa
import java.util.Scanner;

//Clase principal
public class examenfinal {
    
    //variables de clase nenesarias
    public static String cliente[][]=new String[4][3];
    public static String producto[][]=new String[4][3];
    public static String factura[][]=new String[100][3];
    public static Scanner dato=new Scanner(System.in);
    public static int conteoFacturas;

    //Se inicia el main
    public static void main(String[] args) {
        cargarDatosManualmente(); //llamamos datos de tablas cliente y producto
        conteoFacturas=1; //se inicializa variable global para contador
        menu(); //llamamos al menu principal
    }
    
    //Se inicia menu principal
    public static void menu(){
        try{ //importante para respaldar el funcionamiento
            boolean bandera=true;
            byte menu; //al ser un valor pequeño utilizo byte
            do{
               System.out.println("");
               System.out.print("\t***TIENDA COMPRAFACIL***\n"
                           +"\t   *MENU DEL SISTEMA*\n"
                           +"\t1. Mostrar clientes\n"
                           +"\t2. Mostrar productos\n"
                           +"\t3. Ingresar facturas\n"
                           +"\t4. Mostrar todos los datos\n"
                           +"\t5. Buscar factura\n"
                           +"\t6. Salir\n"
                           +"\tIndique lo que desea hacer en el Sistema: ");
               menu=(byte)dato.nextByte(); //se solicita seleccion
               switch(menu){ 
                 case 1:
                   System.out.println("\n"
                                     +"Mostrando clientes ---------->");
                   mostrarClientes(); //se llama al metodo para tabla uno
                   break;
                 case 2:
                   System.out.println("\n"
                                     +"Mostrando productos ---------->");
                   mostrarProductos(); //se llama metodo para tabla dos
                   break;
                 case 3:
                   System.out.println("Ingresando factura ---------->\n"
                                     +"Factura N° "+conteoFacturas);
                   llenarFacturas(); //se llama al metodo para llenar facturas
                   break;
                 case 4:
                   System.out.println("\n"
                                    + "Mostrando datos ---------->");
                   mostrarTablas(); //se llama metodo para mostrar todos los datos
                   break;
                 case 5:
                   System.out.println("\n"
                                    + "Buscando factura ---------->");
                   buscarFactura(); //se llama al metodo para buscar factura
                   break;
                 case 6:
                   System.out.println("\n\tGRACIAS, HASTA LUEGO!\n");
                   bandera=false; //se valida la opcion de salida
                   System.exit(0);
                   break;
                 default: //Evitamos que se caiga el programa por mal ingreso de datos
                   System.out.println("Opcion invalida");
                   break;
                }
            }while(bandera==true); 
        }catch(Exception e){
            menu();
        }
    }
    
    //Se llenan tablas cliente y producto
    public static void cargarDatosManualmente(){
        try{
            //matriz cliente
            //fila uno descripcion
            cliente[0][0]="CEDULA";
            cliente[0][1]="\tNOMBRE";
            cliente[0][2]="TELEFONO";
            //fila dos cliente
            cliente[1][0]="101110111";
            cliente[1][1]="JOSE";
            cliente[1][2]="70702020";
            //fila tres cliente
            cliente[2][0]="202220222";
            cliente[2][1]="CARLOS";
            cliente[2][2]="60601111";
            //fila cuatro cliente
            cliente[3][0]="303330333";
            cliente[3][1]="MARIO";
            cliente[3][2]="90905000";
            //matriz producto
            //fila uno descripcion 
            producto[0][0]="ID";
            producto[0][1]="NOMBRE";
            producto[0][2]="\tDESCRIPCION";
            //fila dos producto
            producto[1][0]="1000";
            producto[1][1]="OLLA ARROCERA";
            producto[1][2]="OSTER/4730/12 TAZAS";
            //fila tres producto
            producto[2][0]="1250";
            producto[2][1]="COCINA CERAMICA";
            producto[2][2]="FRIGIDAIRE/5 QUEMADORES";
            //fila cuatro producto
            producto[3][0]="1600";
            producto[3][1]="MICROONDAS";
            producto[3][2]="WHIRLPOOL/WM1807W/700 WATTS";
            //matriz factura
            //fila uno descripcion 
            factura[0][0]="FACTURA";
            factura[0][1]="PRODUCT";
            factura[0][2]="CLIENTE";
        }catch(Exception e){
          cargarDatosManualmente();
        }
    }
    
    //Se muestran clientes cargados
    public static void mostrarClientes(){
        try{
            for(int f=0; f<4;f++){
                for(int c=0;c<3;c++){
                   System.out.print("\t\t"+cliente[f][c]);
                }
                System.out.println("");
            }  
        }catch(Exception e){
            mostrarClientes();
        }
    }
    
    //Se muestran productos cargados
    public static void mostrarProductos(){
        try{
            for(int f=0; f<4;f++){
                for(int c=0;c<3;c++){
                   System.out.print("\t\t"+producto[f][c]);
                }
                System.out.println("");
            }  
        }catch(Exception e){
            mostrarClientes();
        }
    }
    
    //Se llena la tabla de factura
    public static void llenarFacturas(){
        try{
            String productoID, clienteID; //creamos variables para ingresar datos
            String valorID=String.valueOf(conteoFacturas); //se realiza conversion
            boolean bandera=true;
            System.out.print("Ingrese ID de producto: ");
            productoID=(String)dato.next();
            System.out.print("Ingrese cedula de cliente: ");
            clienteID=(String)dato.next();
            //inicia cicli para llenar matriz factura
            for(int f=1;f<4;f++){ //se recorre por las filas
                if((productoID.equals(producto[f][0]))&&(clienteID.equals(cliente[f][0]))){
                    for(int c=0;c<4;c++){ //se recorre por las columnas
                        if(c==0){ //sentencia para columna 0
                            factura[conteoFacturas][c]=valorID+123;
                        }else if(c==1){ //sentencia para columna 1
                            factura[conteoFacturas][c]=productoID;
                        }else if(c==2){ //sentencia para columna 3
                            factura[conteoFacturas][c]=clienteID;
                        }
                    }
                    conteoFacturas+=1; //se aumenta contador luego del recorrido
                    System.out.println("\n"
                                     + "Factura agregada con exito!");
                    bandera=true;
                }else{
                    bandera=false;
                }
            }
            if(bandera==false){
                System.out.println("ID de producto o cedula invalidos, intente nuevamente...");
            }
        }catch(Exception e){
           menu(); //en caso de un error se llama al menu
        }
        
    }
    
    //Se muestran datos de las tres tablas
    public static void mostrarTablas(){
        try{
            mostrarClientes(); //se llama a metodo utilizado anteriormente
            System.out.println("");
            mostrarProductos(); //se llama a metodo utilizado anteriormente
            System.out.println("");
            for(int f=0;f<conteoFacturas;f++){
                for(int c=0;c<3;c++){
                   System.out.print("\t\t"+factura[f][c]);
                }
                System.out.println("");
            }  
        }catch(Exception e){
            mostrarTablas();
        }
    }
    
    //Se busca factura por cedula de cliente
    public static void buscarFactura(){
        try{
            int cliente, clienteInterno;
            System.out.print("Ingrese cedula de cliente: ");
            cliente=(int)dato.nextInt();
            for(int f=1;f<=100;f++){ 
                clienteInterno=Integer.parseInt(factura[f][2]); //se realiza conversion
                if(cliente==clienteInterno){
                    System.out.println("");
                    System.out.println("\t\tMostrando facturas del cliente: "+cliente); 
                    System.out.println("\t\tFactura N° "+factura[f][0]);
                    System.out.println("\t\tID Producto "+factura[f][1]);
                    System.out.println("\t\t--------------------------------------");
                }
            }
        }catch(Exception e){
            System.out.println("Final de facturas de cliente");
            menu();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
