/**
 * SEGUNDO EXAMEN PROGRAMACION I UAM
 * @author Alonso Ramirez Araya
 * @docente Daniel Mendez Gutierrez
 * II Cuatrimestre 2021
 */

package com.mycompany.segundoexamen;
//Se importan las librerias necesarias para este programa
import java.util.Objects;
import javax.swing.JOptionPane;

//Clase principal
public class segundoexamen {
    
    //variables de clase nenesarias
    public static int contrasena;
    public static String usuario, correo, seleccionPregunta, respuestaPregunta;
    public static boolean bandera=true;
    
    //Se inicia el main
    public static void main(String[] args) {
        menuPrincipal(); //llamamos al menu principal
    }
    
    //Se inicia menu principal
    public static void menuPrincipal(){
        try{ //importante para respaldar el funcionamiento
            byte menu=0; //al ser un valor pequeño utilizo byte
            do{
               menu=Byte.parseByte(JOptionPane.showInputDialog(null,
               "MENU PRINCIPAL\n"
              +"1. Registrar\n"
              +"2. Ingresar\n"
              +"3. Recuperar contraseña\n"
              +"4. Salir\n"
              +"ELIJA OPCION"));
              switch(menu){
                 case 1:
                   JOptionPane.showMessageDialog(null,"Registro");
                   registrar(); //Se llama a subproceso registro
                   break; 
                 case 2:
                    JOptionPane.showMessageDialog(null,"Ingreso");
                    ingresar(); //Se llama a subproceso ingresar
                   break;
                 case 3:
                    JOptionPane.showMessageDialog(null,"Recuperar contraseña");
                    recuperarContrasena(); //Se llama a subproceso ingresar recuperarContrasena
                   break;
                 case 4:
                    JOptionPane.showMessageDialog(null,"Hasta luego...");
                    bandera=false; //Se valida bandera como salida del programa
                    System.exit(0);
                   break;
                 default: //Evitamos que se caiga el programa por mal ingreso de datos
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break; 
                }
            }while(bandera==true); //Validacion para repetir menu principal
        }catch(Exception e){
            menuPrincipal(); //Si entra en juego el try catch se retorno el menu
        }
    }
    
    //Se inicia accion de registro
    public static void registrar(){
        try{
            int verificarContrasena; //Se crea para guardar el valor ingresado
            //Se cargan datos
            usuario=(String)JOptionPane.showInputDialog("Ingrese su nombre");
            correo=(String)JOptionPane.showInputDialog("Ingrese su direccion de correo");
            contrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingrese una contraseña numerca 123..."));
            verificarContrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Repita su contraseña"));
            
            //Se inicia verificacion de contraseña
            if(contrasena==verificarContrasena){
                JOptionPane.showMessageDialog(null,"Contraseña correcta");
            }
            else{
                for(int i=0;i<=3;i++){ //Se asiga valor maximo de intentos al verificar contraseña
                   
                   if(i==3){
                       JOptionPane.showMessageDialog(null,"Cantidad maxima de intentos! ");
                       menuPrincipal(); //Si llega al maximo se retorna al menu principal
                    }
                   JOptionPane.showMessageDialog(null,"No coincide, intento: "+(i+1));
                   contrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingrese una contraseña numerca 123..."));
                   verificarContrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Repita su contraseña"));
                   if(contrasena==verificarContrasena){
                       JOptionPane.showMessageDialog(null,"Contraseña correcta");
                       i=3; //Se da valor a i para frenar el ciclo si la contraseña es correcta
                    }
                }
            }
            //Se utiliza vector para indicar opciones unicas para elegir
            String []validar ={
            "Nombre de mi mascota",
            "Apellido de mi madre",
            "Color de ojos de mi pareja",
            };
            seleccionPregunta=(String)JOptionPane.showInputDialog(null,
              "Seleccione una?","Pregunta de seguridad",JOptionPane.PLAIN_MESSAGE,null,validar,validar[0]);
            respuestaPregunta=(String)JOptionPane.showInputDialog("Ingrese su respuesta");
            JOptionPane.showMessageDialog(null,"REGISTRO CORRECTO"+"\n"
                                              +"\n"
                                              +"Sus credenciales de ingreso son"+"\n"
                                              +"Usuario: "+usuario+"\n" //Se indican credenciales para ingresar
                                              +"Contraseña: "+contrasena);
            menuPrincipal();
        }catch(Exception e){
            registrar();
        }
    }

    //Se inicia validacion del usuario
    public static void ingresar(){
        try{
            /*Aca se utiliza un igualador para corregir el problema del null
            y darle un valor, ya que al ingresar sin antes registrar, la variable
            estaba en null y no era posible comparar dos variables del tipo String*/
            if((Objects.equals(usuario,null))){
               usuario="vacio";
            }
            String usuarioIngresado; //Se guarda el valor ingresado
            int contrasenaIngresada;
            usuarioIngresado=(String)JOptionPane.showInputDialog("Ingrese su usuario");
            contrasenaIngresada=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña"));
            
            //Se valida que el usuario y la contraseña esten registrados
            if((Objects.equals(usuario,usuarioIngresado)&&(Objects.equals(contrasena,contrasenaIngresada)))){
                JOptionPane.showMessageDialog(null,"Usuario y contraseña correctos"); 
                menuInterno(); //Si esta registrado llama al menu principal
                menuInterno(); //Si coloca nuevamente como respaldo para retornar
            }
            else{
                for(int i=3;i>=0;i--){ //Se utiliza contador decremental para indicar los intentos
                   
                   if(i==0){
                       JOptionPane.showMessageDialog(null,"Maximo de intentos alcanzado");
                       menuPrincipal();
                    }
                    JOptionPane.showMessageDialog(null,"Datos incorrectos o no registrados, intentos restantes: "+(i));
                    usuarioIngresado=(String)JOptionPane.showInputDialog("Ingrese su usuario");
                    contrasenaIngresada=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña"));
                   if(usuario.equalsIgnoreCase(usuarioIngresado)&&contrasena==contrasenaIngresada){
                       JOptionPane.showMessageDialog(null,"Usuario y contraseña correctos");
                       i=0; //Si uno de los intentos es correcto se da valor a i para salir del ciclo
                       menuPrincipal();
                    }
                }
            }
        }catch(Exception e){
            ingresar();
        }
    }
    
    //Se inicia accion para recuperar contraseña
    public static void recuperarContrasena(){
        try{
            /*Aca de igual manera se utiliza igualador para darle valor a
            las variables en caso de que sea null
            */
            if((Objects.equals(usuario,null))){
               usuario="vacio";
            }
            if((Objects.equals(seleccionPregunta,null))){
               seleccionPregunta="vacio";
            }
             if((Objects.equals(respuestaPregunta,null))){
               respuestaPregunta="vacio";
            }
            //Se crean variables para guardar nuevos datos ingresados
            String usuarioIngresado;
            String respuestaIngresada;
            int verificarContrasena;
            usuarioIngresado=(String)JOptionPane.showInputDialog("Ingrese su usuario");
            //De nuevo se utilza vector para las preguntas de seguridad
            String []validar ={
            "Nombre de mi mascota",
            "Apellido de mi madre",
            "Color de ojos de mi pareja",
            };
            String preguntaSeleccionada=(String)JOptionPane.showInputDialog(null,
              "Seleccione una?","Pregunta de seguridad",JOptionPane.PLAIN_MESSAGE,null,validar,validar[0]);
            respuestaIngresada=(String)JOptionPane.showInputDialog("Respuesta de la pregunta");
            //Se inicia validacion de datos
            if(((Objects.equals(usuario,usuarioIngresado)&&((Objects.equals(seleccionPregunta,
              preguntaSeleccionada)&&(Objects.equals(respuestaPregunta,respuestaIngresada))))))){
                //Si estan correctos se procede a regenerar contraseña
                JOptionPane.showMessageDialog(null,"Datos correctos! Cree una nueva contraseña");
                //De nuevo se verifica contraseña creada
                for(int i=0;i<=3;i++){
                   if(i==3){
                       JOptionPane.showMessageDialog(null,"Cantidad maxima de intentos! ");
                       menuPrincipal(); //Si supera el limite se sale al menu principal
                    }
                   contrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Ingrese una contraseña numerca 123..."));
                   verificarContrasena=(int)Integer.parseInt(JOptionPane.showInputDialog("Repita su contraseña"));
                   
                   if(contrasena==verificarContrasena){
                       JOptionPane.showMessageDialog(null,"Cambio de contraseña exitoso!");
                       i=3;
                       menuPrincipal(); //Regresa al menu luego del cambio
                    }
                   JOptionPane.showMessageDialog(null,"No coincide, intento: "+(i+1));
                }   
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al validar sus datos, intentelo nuevamente");
                menuPrincipal(); //Si la comparacion de datos es negativa se sale al menu principal
            }
        }catch(Exception e){
            recuperarContrasena();
        }   
    }
    
    //Se inicia menu interno
    public static void menuInterno(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. Sentencias de seleccion\n"
                +"2. Sentencias de repeticion\n"
                +"3. Sentencias anidadas\n"
                +"4. Salidas\n"
                +"5. Ingresos\n"
                +"6. Otras funciones\n"
                +"7. Regresar al menu principal\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Sentencias de seleccion");
                     sentenciasDeSeleccion(); //Se llama al subproceso
                     
                 break;
                 
                 case 2:
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Sentencias de repeticion");
                     sentenciasDeRepeticion(); //Se llama al subproceso
                 break;
                 
                 case 3: //Aca se responde porque no era necesario un submenu
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Sentencias anidadas");
                     JOptionPane.showMessageDialog(null,"Este tipo de sentencias basicamente hace referencia a la aplicacion del conocimiento de las demas sentencias\n"
                             + "en una sintaxis de programacion en la cual nuestra parte logica mental nos permite ir construyendo lo que se nos solicita para llegar\n"
                             + "a una solucion incluyendo ciclos dentro de otros seguiendo un parametro de validacion que nuestro lenguaje de programacion lo comprenda.\n"
                             + "Por ejemplo: se nos pide crear un menu con opciones de calculo y dentro de dichas opciones registrar los usuarios que utilicen el programa\n"
                             + "todo esto utilizando sentencias, la unica manera de realizarlo es anidar sentencias una dentro de otra segun la idea que hayamos formulado\n"
                             + "en el analisis previo al desarrollo, solo anidando el compilador entendera como, cuando y porque debe realizar cada accion.");
                     menuInterno();
                 break;
                 
                 case 4:
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Salidas");
                     salidas(); //Se llama al subproceso
                 break;
                 
                 case 5:
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Ingresos");
                     ingresos(); //Se llama al subproceso
                 break;
                 
                 case 6:
                     JOptionPane.showMessageDialog(null,"Vamos a repasar Otras funciones");
                     otrasFunciones(); //Se llama al subproceso
                 break;
                 
                 case 7:
                     JOptionPane.showMessageDialog(null,"Buena suerte, nos vemos!");
                    bandera=false;
                    menuPrincipal(); //Se regresa al menu principal
                 break;
                 
                 default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
                    break;
                } 
            }while(bandera==true);
        }catch(Exception e){
            menuInterno();  
        }
    }
    
    //Se inicia primera opcion del menu interno
    public static void sentenciasDeSeleccion(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. Sentencia IF\n"
                +"2. Sentencia IF-ELSE\n"
                +"3. Sentencia Switch\n"
                +"4. Regresar\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"Esta sentencia nos permite validar una condicion simple de manera que una accion se\n"
                                                      + "realizará SI y solo SI se cumple lo esperado.\n"
                                                      + "Por ejemplo: podemos decir que un peaton cruza la calle solo si la luz del semaforo\n"
                                                      + "esta de color rojo para los vehiculos.");
                     sentenciasDeSeleccion();
                 break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"Esta sentencia nos permite validar una condicion simple al igual que el IF con la variedad de que\n"
                                                      + "nos permite validar una segunda condicion dado el estado de la primera.\n"
                                                      + "Por ejemplo: Podemos decir que la nota minima para aprobar es de 70, SI una persona obtiene una nota\n"
                                                      + "igual o superior al minimo entonces sera aprobado, SINO si lo anterior no se cumple\n"
                                                      + "la persona sera reprobada y debera realizar un examen extra.");
                     sentenciasDeSeleccion();
                 break;
                 case 3:
                     JOptionPane.showMessageDialog(null,"Esta sentencia permite utilizar una especie de menu dentro de un ciclo repetitivo, como su nombre lo indica\n"
                                                      + "podemos jugar con las opciones de seleccion que necesitemos para desarrollar nuestro programa para que\n"
                                                      + "el usuario pueda saltar de una accion a otra y cuenta con una condicion al final de su sentencia para\n"
                                                      + "que este se pueda repetir MIENTRAS que se requiera.\n"
                                                      + "Por ejemplo: cuando navegamos en una tienda virtual podemos entrar en un menu de categorias y dentro\n"
                                                      + "de este encontrar mas categorias con la libertad de retroceder, avanzar y salir.");
                     sentenciasDeSeleccion();
                 break;
                 case 4:
                     bandera=false;
                     menuInterno();
                 break;
                }
            }while(bandera==true);   
        }catch(Exception e){
            sentenciasDeSeleccion();
        }
        
    }
    
    //Se inicia segunda opcion del menu interno
    public static void sentenciasDeRepeticion(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. Sentencia While\n"
                +"2. Sentencia Do-While\n"
                +"3. Sentencia For\n"
                +"4. Regresar\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"Esta sentencia es similar al IF con la diferencia que el WHILE nos permite crear un ciclo repetitivo con solo\n"
                                                      + "colocarle un contador interno para que este aumente o decremente hasta llegar a la condicion de salida,\n"
                                                      + "al igual que el IF primero valida si se cumple lo esperado para entrar al ciclo.\n"
                                                      + "Por ejemplo: podemos decir que una persona debe repetir el curso lectivo MIENTRAS no apruebe todas sus materias\n"
                                                      + "al aprobar el curso dejara de realizar dicha accion.");
                     sentenciasDeRepeticion();
                 break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"Similar al WHILE, esta sentencia primero nos da la libertad de realizar una determinada accion o acciones\n"
                                                      + "y luego valida si se cumple con lo esperado por el ciclo para continuar con la repeticion, de lo contrario\n"
                                                      + "se finaliza el ciclo.\n"
                                                      + "Por ejemplo: al ingresar a un cajero automatico se nos permite ver el menu de opciones y navegar un poco\n"
                                                      + "pero al seleccionar una accion el sistema valida si el pin digitado al ingresar es correcto, si lo es\n"
                                                      + "entonces seguimos navegando, caso contrario nos saca completamente del programa y finaliza el ciclo.");
                     sentenciasDeRepeticion();
                 break;
                 case 3:
                     JOptionPane.showMessageDialog(null,"Esta sentencia es una de las mas accesibles para crear ciclos repetitivos ya que nos permite establecer\n"
                                                      + "un valor inicial hasta otro final y con un contador, por lo que todas las acciones dentro de él se repetiran\n"
                                                      + "n cantidad de veces segun los requerimientos.\n"
                                                      + "Por ejemplo: si se requiere desarrollar una validacion critica en donde la cantidad maxima de paquetes informaticos\n"
                                                      + "enviados por un colaborador en donde se debe establecer un limite de 100 archivos en 7 dias, pasado los 7 dias si no se\n"
                                                      + "ha superado el limite el contador de dias vuelve a comenzar desde 0 y el colaborador no sera bloqueado.");
                     sentenciasDeRepeticion();
                 break;
                 case 4:
                     bandera=false;
                     menuInterno();
                 break;
                }
            }while(bandera==true);   
        }catch(Exception e){
            sentenciasDeRepeticion();
        }
        
    }
    
    //Se inicia cuarta opcion del menu interno
    public static void salidas(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. JOPTION PANE\n"
                +"2. System.out.print y println\n"
                +"3. Regresar\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"La funcion JOPTION PANE para salidas es una caracteristica de JAVA como tal que nos permite mostrar por ventanas emergentes\n"
                                                      + "la informacion que deseamos para que se vea un poco mas estetico que los mensajes mostrados por el compilador.\n"
                                                      + "Por ejemplo: podemos mostrarle al usuario una alerta de ingreso correcto, erroneo o de pregunta dependiendo el caso\n"
                                                      + "y cuenta con gran variedad de mensajes y diseños de ventanas para mostrar.");
                     salidas();
                 break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"El comando System.out.print y println al igual que el JOPTION PANE nos brinda la posibilidad de mostrar mensajes\n"
                                                      + "con la gran diferencia de que es utilizado mas que todo para la fase de desarrollo como un previo de lo que vera el usuario,\n"
                                                      + "se trata de una libreia de JAVA que es importada por defecto, el (ln) del final es para saltar de linea si es necesario\n"
                                                      + "Por ejemplo: si creamos un programa corto para probar ciclos, arreglos, laboratorios y demas, pues no es necesario utilizar un\n"
                                                      + "JOPTION PANE ya que eso resta tiempo de ejecucion y nos devia un poco del enfoque que es la codificacion");
                     salidas();
                 break;
                 case 3:
                     bandera=false;
                     menuInterno();
                 break;
                }
            }while(bandera==true);   
        }catch(Exception e){
            salidas();
        }
        
        
    }
    
    //Se inicia quinta opcion del menu interno
    public static void ingresos(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. JOPTION PANE\n"
                +"2. Scanner\n"
                +"3. Regresar\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"El JOPTION PANE para ingreso de datos se trata de una ventana emergente, podemos decir que es un mensaje en pantalla con la\n"
                                                      + "capacidad de solictar y permitir el ingreso de X datos segun lo programdo con anterioridad y cuenta con gran variedad de\n"
                                                      + "tipos de mensajes para mostrar lo que nos da rienda suelta a la creatividad de cada desarrollador.\n"
                                                      + "Por ejemplo: se puede crear un menu de opciones con lista desplegable para que el usuario no tenga que digitar nada\n"
                                                      + "solo basta con seleccionar y el JOPTION PANE entendera lo que se ingresa siempre y cuando la codificacion sea la correcta.");
                     ingresos();
                 break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"Se trata de otra libreria que incluye JAVA, con ella podemos leer datos ingresador por entrada estandar de igual manera\n"
                                                      + "que el System.out.print se utiliza mas que todo en la etapa previa cuando se trabaja en la codificacion del programa.\n"
                                                      + "Por ejemplo: si creamos un programa corto para probar ciclos, arreglos, laboratorios y demas, pues no es necesario utilizar un\n"
                                                      + "JOPTION PANE ya que eso resta tiempo de ejecucion y nos devia un poco del enfoque que es la codificacion");
                     ingresos();
                 break;
                 case 3:
                     bandera=false;
                     menuInterno();
                 break;
                }
            }while(bandera==true);   
        }catch(Exception e){
            ingresos();
        }
    }
    
    //Se inicia sexta opcion del menu interno
    public static void otrasFunciones(){
        try{
            byte menu=0;
            do{
                menu=Byte.parseByte(JOptionPane.showInputDialog(null,
                "MENU PRINCIPAL\n"
                +"1. Try catch\n"
                +"2. Random\n"
                +"3. Regresar\n"
                +"ELIJA OPCION"));
                switch(menu){
                 case 1:
                     JOptionPane.showMessageDialog(null,"El try catch es un tipo de excepcion de JAVA muy bien pensada y util que nos brinda un apoyo por asi decirlo, lo que este amigo hace es\n"
                                                      + "intentar salvar nuestra codificacion de un error o errores que se puedan presentar, la tecnica mas usada consiste en la instrucciones que\n"
                                                      + "podrian provocar problemas dentro de un bloque try y luego colocar un bloque catch.\n"
                                                      + "Por ejemplo: si hemos colocado correctamente nuestro try catch y dentro una validacion de ingreso de datos y una variable de tipo int recibe\n"
                                                      + "un valor tipo String el programa sufriria pero el try catch nos ayudara a solventar este tipo de inconvenientes, entre otros mas.");
                     otrasFunciones();
                 break;
                 case 2:
                     JOptionPane.showMessageDialog(null,"Random es una asignacion del tipo matematico que nos brinda la posibilidad de generar valores\n"
                                                      + "al azar como su nombre lo indica, estableciendo\n"
                                                      + "un valor como rango desde 0 hasta n segun lo requerido para nuestro desarrollo.\n"
                                                      + "Por ejemplo: si creamos un juego de mesa y vamos a utilizar un dado y queremos que cuando\n"
                                                      + "el jugador lo lance se muestre al azar un lado del dado\n"
                                                      + "el cual iria de entre 0 a 6.");
                     otrasFunciones();
                 break;
                 case 3:
                     bandera=false;
                     menuInterno();
                 break;
                }
            }while(bandera==true);   
        }catch(Exception e){
            otrasFunciones();
        }
    }
    
}
