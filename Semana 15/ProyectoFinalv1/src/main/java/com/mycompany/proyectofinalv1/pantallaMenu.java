
package com.mycompany.proyectofinalv1;
//Se importa las matriz y los contadores desde Java Class y la libreria JOptionPane
import static com.mycompany.proyectofinalv1.proyectoFinal.conteoCursos;
import static com.mycompany.proyectofinalv1.proyectoFinal.conteoEstudiantes;
import static com.mycompany.proyectofinalv1.proyectoFinal.cursos;
import static com.mycompany.proyectofinalv1.proyectoFinal.estudiantes;
import static com.mycompany.proyectofinalv1.proyectoFinal.matricula;
import javax.swing.JOptionPane;


public class pantallaMenu extends javax.swing.JFrame {


    public pantallaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_RegistrarCurso = new javax.swing.JButton();
        btn_RegistrarEstudiante = new javax.swing.JButton();
        btn_Matricular = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_VerEstudiantes = new javax.swing.JButton();
        btn_VerCursos = new javax.swing.JButton();
        btn_VerMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU DEL SISTEMA");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("OPCIONES");

        btn_RegistrarCurso.setBackground(new java.awt.Color(0, 0, 0));
        btn_RegistrarCurso.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_RegistrarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarCurso.setText("REGISTRAR NUEVO CURSO");
        btn_RegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarCursoActionPerformed(evt);
            }
        });

        btn_RegistrarEstudiante.setBackground(new java.awt.Color(0, 0, 0));
        btn_RegistrarEstudiante.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_RegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarEstudiante.setText("REGISTRAR NUEVO ESTUDIANTE");
        btn_RegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarEstudianteActionPerformed(evt);
            }
        });

        btn_Matricular.setBackground(new java.awt.Color(0, 0, 0));
        btn_Matricular.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_Matricular.setForeground(new java.awt.Color(255, 255, 255));
        btn_Matricular.setText("MATRICULAR CURSO");
        btn_Matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MatricularActionPerformed(evt);
            }
        });

        btn_Salir.setBackground(new java.awt.Color(255, 153, 153));
        btn_Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_Salir.setText("SALIR DEL MENU");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_VerEstudiantes.setBackground(new java.awt.Color(0, 0, 0));
        btn_VerEstudiantes.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_VerEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        btn_VerEstudiantes.setText("MOSTRAR ESTUDIANTES");
        btn_VerEstudiantes.setToolTipText("");
        btn_VerEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerEstudiantesActionPerformed(evt);
            }
        });

        btn_VerCursos.setBackground(new java.awt.Color(0, 0, 0));
        btn_VerCursos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_VerCursos.setForeground(new java.awt.Color(255, 255, 255));
        btn_VerCursos.setText("MOSTRAR CURSOS");
        btn_VerCursos.setToolTipText("");
        btn_VerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerCursosActionPerformed(evt);
            }
        });

        btn_VerMatricula.setBackground(new java.awt.Color(0, 0, 0));
        btn_VerMatricula.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_VerMatricula.setForeground(new java.awt.Color(255, 255, 255));
        btn_VerMatricula.setText("BUSCAR MATRICULA");
        btn_VerMatricula.setToolTipText("");
        btn_VerMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_VerEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_RegistrarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_RegistrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Matricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_VerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_VerMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(btn_Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_RegistrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_RegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_VerEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_VerCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_VerMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addContainerGap())
        );

        btn_VerMatricula.getAccessibleContext().setAccessibleName("BUSCAR MATRICULA");

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
    //Se programan las acciones para el boton registrarCurso
    private void btn_RegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarCursoActionPerformed
        pantallaCursos verpantallaCursos = new pantallaCursos();
        verpantallaCursos.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarCursoActionPerformed
    //Se programan las acciones para el boton registroEstudiante
    private void btn_RegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarEstudianteActionPerformed
        pantallaRegistro verpantallaRegistro = new pantallaRegistro();
        verpantallaRegistro.setVisible(true);
    }//GEN-LAST:event_btn_RegistrarEstudianteActionPerformed
    //Se programan las acciones para el boton matricular
    private void btn_MatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MatricularActionPerformed
        //Se inicia validacion para estudiante registrado
        String cedulaIngresada;
        cedulaIngresada=JOptionPane.showInputDialog("Digite su N° de cedula:");
        boolean bandera=false;
        for(int f=0;f<1000;f++){
           if(cedulaIngresada.equals(estudiantes[f][2])){ 
               bandera=true;
           }
        }
        if(bandera==true){
            pantallaMatricula verpantallaMatricula = new pantallaMatricula();
            verpantallaMatricula.setVisible(true);
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "ERROR AL MATRICULAR!"+"\n"
                                               +"El estudiante no se encuentra en la base de datos"+"\n"
                                               +"Debe estar registrado en la Universidad");
        }
    }//GEN-LAST:event_btn_MatricularActionPerformed
    //Se programan las acciones para el boton salir
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        pantallaPrincipal verpantallaPrincipal = new pantallaPrincipal();
        verpantallaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed
    //Se programan las acciones para el boton VerEstudiantes
    private void btn_VerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerEstudiantesActionPerformed
        String mostrar="";
        for(int f=0;f<conteoEstudiantes;f++){
            for(int c=0;c<7;c++){
                mostrar+=estudiantes[f][c];
                mostrar+="       ";
            }
            mostrar+="\n\n";
        }
       JOptionPane.showMessageDialog(null, mostrar);
    }//GEN-LAST:event_btn_VerEstudiantesActionPerformed
    //Se programan las acciones para el boton VerCursos
    private void btn_VerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerCursosActionPerformed
        String mostrar="";
        for(int f=0;f<conteoCursos;f++){
            for(int c=0;c<4;c++){
                mostrar+=cursos[f][c];
                mostrar+="       ";
            }
            mostrar+="\n\n";
        }
       JOptionPane.showMessageDialog(null, mostrar);
       
    }//GEN-LAST:event_btn_VerCursosActionPerformed

    private void btn_VerMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerMatriculaActionPerformed
        boolean bandera=false;
        String buscarCedula;
        buscarCedula=JOptionPane.showInputDialog("Cedula de estudiante:");
        for(int f=0;f<conteoCursos;f++){
            if(buscarCedula.equals(matricula[f][0])){
                JOptionPane.showMessageDialog(null, "Cedula: "+matricula[f][0]+"\n"
                                                   +"Nombre: "+matricula[f][1]+"\n"
                                                   +"Materia: "+matricula[f][2]+"\n"
                                                   +"Horario: "+matricula[f][3]);
                bandera=true;
            }
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO MATRICULA CON LA CEDULA "+buscarCedula);
        }
    }//GEN-LAST:event_btn_VerMatriculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Matricular;
    private javax.swing.JButton btn_RegistrarCurso;
    private javax.swing.JButton btn_RegistrarEstudiante;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_VerCursos;
    private javax.swing.JButton btn_VerEstudiantes;
    private javax.swing.JButton btn_VerMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
