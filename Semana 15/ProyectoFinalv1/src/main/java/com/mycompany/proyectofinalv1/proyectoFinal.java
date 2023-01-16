/**
 * PROYECTO FINAL PROGRAMACION I UAM
 * @author Alonso Ramirez Araya
 * @docente Daniel Mendez Gutierrez
 * II Cuatrimestre 2021
 */
package com.mycompany.proyectofinalv1;

//Se importan los metodos y variables de los JFrame
import static com.mycompany.proyectofinalv1.pantallaCursos.cantidadCupos;
import static com.mycompany.proyectofinalv1.pantallaCursos.horarioCursos;
import static com.mycompany.proyectofinalv1.pantallaPlataformista.areaPlataformista;
import static com.mycompany.proyectofinalv1.pantallaPlataformista.codigoPlataformista;
import static com.mycompany.proyectofinalv1.pantallaPlataformista.nombrePlataformista;
import static com.mycompany.proyectofinalv1.pantallaRegistro.nombreEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.apellidosEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.carreraEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.cedulaEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.estadoEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.fechaEstudiante;
import static com.mycompany.proyectofinalv1.pantallaRegistro.telefonoEstudiante;
import static com.mycompany.proyectofinalv1.pantallaCursos.nombreCarrera;
import static com.mycompany.proyectofinalv1.pantallaCursos.nombreMateria;
import static com.mycompany.proyectofinalv1.pantallaMatricula.matriculaCedula;
import static com.mycompany.proyectofinalv1.pantallaMatricula.matriculaHorario;
import static com.mycompany.proyectofinalv1.pantallaMatricula.matriculaMateria;
import static com.mycompany.proyectofinalv1.pantallaMatricula.matriculaNombre;
import javax.swing.JOptionPane; //Se importa libreria para JOptionPane

public class proyectoFinal { //Inicio
   //Se crean las variables globales para las utilizar las matricez en los JFrame
   public static String matricula[][]=new String[1000][4]; //Matriz uno
   public static String cursos[][]=new String[1000][4];  //Matriz dos
   public static String plataformista[][]=new String[100][3]; //Matriz tres
   public static String estudiantes[][]=new String[1000][7]; //Matriz  cuatro
   public static int conteoMatricula=0; //Contador para matriz cuatro
   public static int conteoCursos=1; //Contador para matriz tres
   public static int conteoPlataformista=0; //Contador para matriz uno
   public static int conteoEstudiantes=1; //Contador para matriz dos
   
   public static void registroPlataformistas(){
       try{ //Iniciamos con Try
           for(int f=conteoPlataformista;f<100;f++){ //Recorremos la matriz para cargar datos
                for(int c=0;c<3;c++){
                    if(c==0){
                        plataformista[f][c]=nombrePlataformista;
                    }else if(c==1){
                        plataformista[f][c]=areaPlataformista;
                    }else if(c==2){
                        plataformista[f][c]=codigoPlataformista;
                    }
                }
                conteoPlataformista+=1; //Se utiliza contador para guardar la ultima posicion
                break; //Se detiene ciclo luego de cargar una fila
            }
            JOptionPane.showMessageDialog(null, "REGISTRADO!"); //Mensaje de validacion

       }catch(Exception e){ //Se cierra Try con Catch
           registroPlataformistas(); //Retorna el metodo si es necesario
       }
   }
   //Aca se aplica la misma codificacion que el metodo anterior
   public static void registroEstudiantes(){
       estudiantes[0][0]="NOMBRE";
       estudiantes[0][1]="APELLIDOS";
       estudiantes[0][2]="CEDULA";
       estudiantes[0][3]="ESTADO";
       estudiantes[0][4]="FECHA";
       estudiantes[0][5]="TELEFONO";
       estudiantes[0][6]="CARRERA";
       try{
           for(int f=conteoEstudiantes;f<1000;f++){
                for(int c=0;c<7;c++){
                    if(c==0){
                        estudiantes[f][c]=nombreEstudiante;
                    }else if(c==1){
                        estudiantes[f][c]=apellidosEstudiante;
                    }else if(c==2){
                        estudiantes[f][c]=cedulaEstudiante;
                    }else if(c==3){
                        estudiantes[f][c]=estadoEstudiante;
                    }else if(c==4){
                        estudiantes[f][c]=fechaEstudiante;
                    }else if(c==5){
                        estudiantes[f][c]=telefonoEstudiante;
                    }else if(c==6){
                        estudiantes[f][c]=carreraEstudiante;
                    }
                }
                conteoEstudiantes+=1;
                break;
            }
            JOptionPane.showMessageDialog(null, "REGISTRADO!");
       }catch(Exception e){
           registroEstudiantes();
       }
   }
   //Nuevamente de aplica las misma codificacion anterior
   public static void registroCursos(){
       cursos[0][0]="CARRERA";
       cursos[0][1]="MATERIA";
       cursos[0][2]="CUPOS";
       cursos[0][3]="HORARIO";
        try{
            for(int f=conteoCursos;f<1000;f++){
                for(int c=0;c<4;c++){
                    if(c==0){
                        cursos[f][c]=nombreCarrera;
                    }else if(c==1){
                        cursos[f][c]=nombreMateria;
                    }else if(c==2){
                        cursos[f][c]=cantidadCupos;
                    }else if(c==3){
                        cursos[f][c]=horarioCursos;
                    }
                }
                conteoCursos+=1;
                break;
            }
            JOptionPane.showMessageDialog(null, "REGISTRADO!");
        }catch(Exception e){
           registroCursos();
       }
   }
   //Aca se utiliza aplica la misma configuracion agregandole una validacion para matricular
   public static void matricular(){
        try{
            boolean bandera=false; //Declaramos una bandera para mostrar resultado de la validacion
            for(int fUno=0;fUno<1000;fUno++){ //Se utiliza fUno ya que f se utiliza dos veces
                //Iniciamos comparacion con .equals ya que son cadenas de caracteres
                if((matriculaCedula.equals(estudiantes[fUno][2]))&(matriculaNombre.equals(estudiantes[fUno][0]))&(matriculaMateria.equals(cursos[fUno][1]))&(matriculaHorario.equals(cursos[fUno][3]))){
                    bandera=true; //La bandera recibe respuesta por comparacion exitosa
                    for(int f=conteoMatricula;f<1000;f++){ //Se inicia carga de datos en matriz
                        for(int c=0;c<4;c++){
                            if(c==0){
                                matricula[f][c]=matriculaCedula;
                            }else if(c==1){
                                matricula[f][c]=matriculaNombre;
                            }else if(c==2){
                                matricula[f][c]=matriculaMateria;
                            }else if(c==3){
                                matricula[f][c]=matriculaHorario;
                            }
                        }
                        conteoMatricula+=1;
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "MATRICULA EXITOSA!");  
                }
            }
            if(bandera==false){ //Si la bandera no sufre cambios se desplega mensaje de resultado al comparar
                JOptionPane.showMessageDialog(null, "ERROR AL MATRICULAR!"+"\n"
                                                   +"La informacion ingresada no coincide con los cursos"+"\n"
                                                   +"disponibles o con su informacion personal.");
            }
        }catch(Exception e){
           registroCursos();
       }
   }
   
    
} //Fin


