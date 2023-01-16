
package com.mycompany.prueba;

import javax.swing.JOptionPane;

public class compararcadenasdetexto {

    public static void main(String[] args) {
        
            String u,us;
    us="hola";
    u=(String)JOptionPane.showInputDialog("Ingrese su nombre");
    
    if(u.equalsIgnoreCase(us)){
        JOptionPane.showMessageDialog(null,"FUNCIONA");
    }
        
    }
    
}
