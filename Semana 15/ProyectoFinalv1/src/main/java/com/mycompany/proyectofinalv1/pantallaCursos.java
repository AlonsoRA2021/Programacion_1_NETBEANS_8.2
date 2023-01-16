
package com.mycompany.proyectofinalv1;
//Se importa la matriz desde Java Class
import static com.mycompany.proyectofinalv1.proyectoFinal.registroCursos;

public class pantallaCursos extends javax.swing.JFrame {
    //Se declaras las variables globales para datos tipo String
    public static String nombreCarrera, nombreMateria, cantidadCupos, horarioCursos;

    public pantallaCursos() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Carrera = new javax.swing.JTextField();
        txt_Materia = new javax.swing.JTextField();
        txt_Cupos = new javax.swing.JTextField();
        txt_Horario = new javax.swing.JTextField();
        btn_Registro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("COMPLETE LOS SIGUIENTES DATOS");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Nombre de la carrera");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("(L-K-M-J-V-S.ma-ta-no)");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Cantidad de cupos");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setText("Nombre de la materia");

        txt_Carrera.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Carrera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CarreraActionPerformed(evt);
            }
        });

        txt_Materia.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Materia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MateriaActionPerformed(evt);
            }
        });

        txt_Cupos.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Cupos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Cupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CuposActionPerformed(evt);
            }
        });

        txt_Horario.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txt_Horario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Horario.setToolTipText("");
        txt_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HorarioActionPerformed(evt);
            }
        });

        btn_Registro.setBackground(new java.awt.Color(51, 255, 51));
        btn_Registro.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_Registro.setText("CONFIRMAR REGISTRO");
        btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setText("Horario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Cupos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Carrera))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btn_Registro)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel8)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txt_Materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txt_Cupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btn_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(394, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(115, 115, 115)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Se programan las acciones para el boton registro
    private void btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroActionPerformed
        //El .getText captura el texto ingresado y lo guarda en una variable
        nombreCarrera=(txt_Carrera.getText());
        nombreMateria=(txt_Materia.getText());
        cantidadCupos=(txt_Cupos.getText());
        horarioCursos=(txt_Horario.getText());
        registroCursos(); //Se llama al metodo
        dispose(); //Se oculta ventana
    }//GEN-LAST:event_btn_RegistroActionPerformed

    private void txt_CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CarreraActionPerformed
        //llenar texto
    }//GEN-LAST:event_txt_CarreraActionPerformed

    private void txt_MateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MateriaActionPerformed
        //llenar texto
    }//GEN-LAST:event_txt_MateriaActionPerformed

    private void txt_CuposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CuposActionPerformed
        //llenar texto
    }//GEN-LAST:event_txt_CuposActionPerformed

    private void txt_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HorarioActionPerformed
        //llenar texto
    }//GEN-LAST:event_txt_HorarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Carrera;
    private javax.swing.JTextField txt_Cupos;
    private javax.swing.JTextField txt_Horario;
    private javax.swing.JTextField txt_Materia;
    // End of variables declaration//GEN-END:variables
}
