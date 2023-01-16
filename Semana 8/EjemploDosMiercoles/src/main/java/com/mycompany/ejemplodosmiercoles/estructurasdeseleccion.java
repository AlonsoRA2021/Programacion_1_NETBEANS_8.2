
package com.mycompany.ejemplodosmiercoles;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class estructurasdeseleccion {

    
    public static void main(String[] args) {
      //SI IF->Simple
      /*
      if () {
      Resultados si es verdadero
      }
      
      */
      /*
      if(5>3){ //literales
          System.out.println("Hola mundo 1");
      }
      if(!(5<3)){
          System.out.println("Hola mundo 2");
      }
      // y &&, o ||
      if((5>3)&&(5<10)){
          System.out.println("Hola mundo 3");
      }
      if((2>3)&&(5<10)){
          System.out.println("Hola mundo 4"); //no se mostrará
      }
      //Variables
      int valorUno=5, valorDos=7;
      Scanner valorIngresado= new Scanner(System.in);
      if(valorUno<valorDos){
          System.out.println("El primer valor es el menor");
      }
      if(valorUno>valorDos){
          System.out.println("El segundo valor es el menor");
      }
      if(valorUno==valorDos){
          System.out.println("Los valores son iguales");
      }
      
        System.out.print("Deme un primer valor: ");
        valorUno=(int)valorIngresado.nextInt();
        System.out.print("Deme un segundo valor: ");
        valorDos=(int)valorIngresado.nextInt();
        
        if(valorUno<valorDos){
          System.out.println("El primer valor es el menor");
      }
      if(valorUno>valorDos){
          System.out.println("El segundo valor es el menor");
      }
      if(valorUno==valorDos){
          System.out.println("Los valores son iguales");
      }
        
      // si sino if else
      /*
      if (){
      }
      else {
      }
      */
      /*
      if(valorUno>valorDos){
         System.out.println("El primer valor es el mayor");
      }
      else{
          System.out.println("El segundo valor es el mayor");
      }
      // Estructura anidada
      
      if(valorUno>valorDos){
         System.out.println("El primer valor es el mayor");
      }
      else{
          if(valorUno<valorDos){
              System.out.println("El segundo valor es el mayor"); 
          }
          else{
              if(valorUno==valorDos){
                  System.out.println("Los valores son iguales");
              }
              else{
                  System.out.println("ERROR");
              }
          }
      }
      
      // Segun Switch
      /*switch(variable){
          case 1:
              //instrucciones
              break; //sirve para retornar
          case 2:
              //instrucciones
              break;
          default:
              break;
              
      }*/
      
      //Vector en JAVA
      String []validar ={
          "Suma",
          "Resta",
          "Multiplicacion",
          "Division"
      };
      int numeroUno, numeroDos, suma, resta, modulo;
      double multiplicacion, division;
      numeroUno= (int)Integer.parseInt(JOptionPane.showInputDialog("Deme un primer valor entero"));
      numeroDos= (int)Integer.parseInt(JOptionPane.showInputDialog("Deme un segundo valor entero"));
      suma=numeroUno+numeroDos;
      resta=numeroUno-numeroDos;
      multiplicacion=numeroUno*numeroDos; 
      division= (double)numeroUno/numeroDos;
      String menu=(String)JOptionPane.showInputDialog(null,
              "Que desea realizar?","Menu del sistema",JOptionPane.PLAIN_MESSAGE,null,validar,validar[0]);
      // Actividad #1
      // Solicitar 2 valores para variables desde un JOptionPane
      switch(menu){
          case "Suma":
              JOptionPane.showMessageDialog(null,"La suma de los valores es: "+suma);
              break;
          case "Resta":
              JOptionPane.showMessageDialog(null,"La resta de los valores es: "+resta);
              break;
          case "Multiplicacion":
              JOptionPane.showMessageDialog(null,"La multiplicacion de los valores es: "+multiplicacion);
              break;
          case "Division":
              JOptionPane.showMessageDialog(null,"La division de los valores es: "+division);
              break;
      }

    }
}
