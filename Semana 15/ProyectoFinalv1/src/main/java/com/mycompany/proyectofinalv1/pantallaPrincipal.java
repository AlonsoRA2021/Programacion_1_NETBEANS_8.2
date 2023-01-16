
package com.mycompany.proyectofinalv1;
//Se importa la matriz desde Java Class y la libreria JOptionPane
import static com.mycompany.proyectofinalv1.proyectoFinal.plataformista;
import javax.swing.JOptionPane;

public class pantallaPrincipal extends javax.swing.JFrame {
    //Se declaras las variables globales para datos tipo String
    public static String nombreIngresadoPlataformista, areaIngresadaPlataformista, codigoIngresadoPlataformista;
    
    public pantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //Se utiliza para centrar la ventana al mostrar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Codigo = new javax.swing.JPasswordField();
        btn_Ingresar = new javax.swing.JButton();
        btn_Registrarse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Area = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Nombre completo:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Área asignada:");

        txt_Nombre.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Codigo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });

        btn_Ingresar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Ingresar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("INGRESAR");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        btn_Registrarse.setBackground(new java.awt.Color(0, 0, 0));
        btn_Registrarse.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_Registrarse.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrarse.setText("REGISTRARSE");
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("uam");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("UNIVERSIDAD AMERICANA");

        btn_Salir.setBackground(new java.awt.Color(255, 153, 153));
        btn_Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_Salir.setText("SALIR DEL SISTEMA");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("INGRESE SUS CREDENCIALES");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("Código plataformista:");

        txt_Area.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Area.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Area)
                                .addGap(102, 102, 102))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txt_Codigo)))
                    .addComponent(btn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Salir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Ingresar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Salir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(btn_Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Se programan las acciones para el boton registro
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        despedida verdespedida = new despedida(); //Se llama a la ventana a mostrar
        verdespedida.setVisible(true);
        dispose(); //Oculta la ventana actual
    }//GEN-LAST:event_btn_SalirActionPerformed

    //Se programan las acciones para el boton registro
    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed
        //Se valida el acceso administrador para crear usuarios
        try{
            String usuarioAdmin, contrasenaAdmin;
            JOptionPane.showMessageDialog(null, "Debe acceder como administrador");
            usuarioAdmin=JOptionPane.showInputDialog("Usuario:");
            contrasenaAdmin=JOptionPane.showInputDialog("Contrasena:");
            if((usuarioAdmin.equals("admin"))&(contrasenaAdmin.equals("proyecto.2021"))){
                pantallaPlataformista verpantallaPlataformista = new pantallaPlataformista();
                verpantallaPlataformista.setVisible(true);
                dispose(); 
            }else{
                JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS, CONSULTE MANUAL TECNICO");
            } 
        }catch(Exception e){
           pantallaPrincipal verpantallaPrincipal = new pantallaPrincipal(); //Se llama a la ventana a mostrar
           verpantallaPrincipal.setVisible(true);
           dispose(); 
        }

    }//GEN-LAST:event_btn_RegistrarseActionPerformed
    //Se programan las acciones para el boton registro
    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        //El .getText captura el texto ingresado y lo guarda en una variable
        nombreIngresadoPlataformista=(txt_Nombre.getText());
        areaIngresadaPlataformista=(txt_Area.getText());
        codigoIngresadoPlataformista=(String.valueOf(txt_Codigo.getPassword()));
        boolean bandera=false;
        for(int f=0;f<10;f++){
            if((nombreIngresadoPlataformista.equals(plataformista[f][0]))&(areaIngresadaPlataformista.equals(plataformista[f][1]))&(codigoIngresadoPlataformista.equals(plataformista[f][2]))){
                bandera=true;
            }
        }
        if(bandera==true){
            JOptionPane.showMessageDialog(null, "DATOS CORRECTOS!");
            pantallaMenu verpantallaMenu = new pantallaMenu();
            verpantallaMenu.setVisible(true);
            dispose();
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS\n"
                                              + "O SIN REGISTRO!");
            LimpiarValores();
        }
        
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        //ingreso de texto
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AreaActionPerformed
        //ingreso de texto
    }//GEN-LAST:event_txt_AreaActionPerformed

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        //ingreso de texto
    }//GEN-LAST:event_txt_CodigoActionPerformed
    //Se crea metodo para limpiar JTextField
    public void LimpiarValores(){
        txt_Nombre.setText("");
        txt_Area.setText("");
        txt_Codigo.setText("");
    }
    
    //Aca tenemos nuestro main para iniciar el programa
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Area;
    private javax.swing.JPasswordField txt_Codigo;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
