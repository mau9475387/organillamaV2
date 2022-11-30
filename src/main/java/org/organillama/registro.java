/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.organillama;

import ConexionMysql.ConexionMysql;
import static java.awt.Color.black;
import java.awt.Image;
import java.awt.Label;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Cursor;
import java.util.HashSet;
import java.util.Set;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {
    
    int xMouse,yMouse;
    public registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        imagen(lblCerrar, "src//main//java//Imagenes//btnCerrarBlanco.png");
  
        imagen(lblMinimizar, "src//main//java//Imagenes//btnMinimizarBlanco.png");
        imagen(lblImagen,"src//main//java//Imagenes//LlenarDatos.png");
        imagen(lblFlechaIz,"src//main//java//Imagenes//FlechaIz.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allContentPanel = new javax.swing.JPanel();
        BarraSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblFlechaIz = new javax.swing.JLabel();
        ContenidoInferior = new javax.swing.JPanel();
        lblRegistrate = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblConfContraseña = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldUsuario = new javax.swing.JTextField();
        TextFieldCorreo = new javax.swing.JTextField();
        PasswordFieldContraseña = new javax.swing.JPasswordField();
        PasswordFieldContraseñaConf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(242,242,242));
        setMaximumSize(new java.awt.Dimension(740, 500));
        setMinimumSize(new java.awt.Dimension(740, 500));
        setUndecorated(true);
        setOpacity(0.9F);
        setPreferredSize(new java.awt.Dimension(740, 500));
        setSize(new java.awt.Dimension(740, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        allContentPanel.setBackground(new Color (255,255,255,30)
        );
        allContentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BarraSuperior.setBackground(new Color(0,0,0,60));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        lblCerrar.setBackground(new Color(0,0,0,0));
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        lblMinimizar.setBackground(new Color(0,0,0,0));
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });

        lblFlechaIz.setBackground(new Color(0,0,0,0));
        lblFlechaIz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFlechaIz.setOpaque(true);
        lblFlechaIz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFlechaIzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFlechaIzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFlechaIzMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFlechaIz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFlechaIz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        ContenidoInferior.setBackground(new java.awt.Color(153, 204, 255));
        ContenidoInferior.setOpaque(false);

        lblRegistrate.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        lblRegistrate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrate.setText("Registrate");

        lblNombre.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblNombre.setText("Nombre:");

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblContraseña.setText("Contraseña:");

        lblConfContraseña.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblConfContraseña.setText("Confirmar Contraseña:");

        lblCorreo.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        lblCorreo.setText("Correo electronico:");

        btnRegistrarse.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        btnRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnRegistrarse.setMaximumSize(new java.awt.Dimension(152, 36));
        btnRegistrarse.setMinimumSize(new java.awt.Dimension(152, 36));
        btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarseMouseEntered(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancelar.setMaximumSize(new java.awt.Dimension(152, 36));
        btnCancelar.setMinimumSize(new java.awt.Dimension(152, 36));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
        });

        TextFieldNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TextFieldNombre.setForeground(new java.awt.Color(204, 204, 204));
        TextFieldNombre.setText("Ingrese su nombre");
        TextFieldNombre.setToolTipText("");
        TextFieldNombre.setActionCommand("<Not Set>");
        TextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TextFieldNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldNombreMouseClicked(evt);
            }
        });
        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        TextFieldUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TextFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TextFieldUsuario.setText("Ingrese su nombre de Usuario");
        TextFieldUsuario.setToolTipText("");
        TextFieldUsuario.setActionCommand("<Not Set>");
        TextFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldUsuarioMouseClicked(evt);
            }
        });
        TextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsuarioActionPerformed(evt);
            }
        });

        TextFieldCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TextFieldCorreo.setForeground(new java.awt.Color(204, 204, 204));
        TextFieldCorreo.setText("Ingrese su correo electronico");
        TextFieldCorreo.setToolTipText("");
        TextFieldCorreo.setActionCommand("<Not Set>");
        TextFieldCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TextFieldCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldCorreoFocusLost(evt);
            }
        });
        TextFieldCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldCorreoMouseClicked(evt);
            }
        });
        TextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCorreoActionPerformed(evt);
            }
        });

        PasswordFieldContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordFieldContraseña.setForeground(new java.awt.Color(204, 204, 204));
        PasswordFieldContraseña.setText("jPasswordField1");
        PasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PasswordFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldContraseñaMouseClicked(evt);
            }
        });

        PasswordFieldContraseñaConf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordFieldContraseñaConf.setForeground(new java.awt.Color(204, 204, 204));
        PasswordFieldContraseñaConf.setText("jPasswordField1");
        PasswordFieldContraseñaConf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PasswordFieldContraseñaConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldContraseñaConfMouseClicked(evt);
            }
        });
        PasswordFieldContraseñaConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldContraseñaConfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenidoInferiorLayout = new javax.swing.GroupLayout(ContenidoInferior);
        ContenidoInferior.setLayout(ContenidoInferiorLayout);
        ContenidoInferiorLayout.setHorizontalGroup(
            ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoInferiorLayout.createSequentialGroup()
                .addGroup(ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ContenidoInferiorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre)
                            .addComponent(lblConfContraseña)
                            .addComponent(lblCorreo)
                            .addGroup(ContenidoInferiorLayout.createSequentialGroup()
                                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUsuario)
                            .addComponent(lblContraseña)
                            .addComponent(TextFieldNombre)
                            .addComponent(TextFieldUsuario)
                            .addComponent(PasswordFieldContraseña)
                            .addComponent(PasswordFieldContraseñaConf)
                            .addComponent(TextFieldCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        ContenidoInferiorLayout.setVerticalGroup(
            ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoInferiorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblRegistrate)
                .addGroup(ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenidoInferiorLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(0, 0, 0)
                        .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblUsuario)
                        .addGap(0, 0, 0)
                        .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblContraseña)
                        .addGap(0, 0, 0)
                        .addComponent(PasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblConfContraseña)
                        .addGap(0, 0, 0)
                        .addComponent(PasswordFieldContraseñaConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblCorreo)
                        .addGap(0, 0, 0)
                        .addComponent(TextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ContenidoInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout allContentPanelLayout = new javax.swing.GroupLayout(allContentPanel);
        allContentPanel.setLayout(allContentPanelLayout);
        allContentPanelLayout.setHorizontalGroup(
            allContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContenidoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        allContentPanelLayout.setVerticalGroup(
            allContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allContentPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(BarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContenidoInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(allContentPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean isEmail(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);
        if(mat.find()){
            return true;
        }else{
            return false;
        }
    }

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered

    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited

    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered

    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited

    }//GEN-LAST:event_lblMinimizarMouseExited

    private void PasswordFieldContraseñaConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldContraseñaConfMouseClicked
        PasswordFieldContraseñaConf.setText("");
        PasswordFieldContraseñaConf.setForeground(black);
    }//GEN-LAST:event_PasswordFieldContraseñaConfMouseClicked

    private void PasswordFieldContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldContraseñaMouseClicked
        PasswordFieldContraseña.setText("");
        PasswordFieldContraseña.setForeground(black);
    }//GEN-LAST:event_PasswordFieldContraseñaMouseClicked

    private void TextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCorreoActionPerformed

    private void TextFieldCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldCorreoMouseClicked
        TextFieldCorreo.setText("");
        TextFieldCorreo.setForeground(black);
    }//GEN-LAST:event_TextFieldCorreoMouseClicked

    private void TextFieldCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldCorreoFocusLost
        if(isEmail(TextFieldCorreo.getText())){

        }else{
            JOptionPane.showMessageDialog(null, "Correo Electronico incorrecto", "Validar Correo Electronico"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TextFieldCorreoFocusLost

    private void TextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsuarioActionPerformed

    private void TextFieldUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldUsuarioMouseClicked
        TextFieldUsuario.setText("");
        TextFieldUsuario.setForeground(black);
    }//GEN-LAST:event_TextFieldUsuarioMouseClicked

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void TextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNombreMouseClicked
        TextFieldNombre.setText("");
        TextFieldNombre.setForeground(black);
    }//GEN-LAST:event_TextFieldNombreMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseEntered
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnRegistrarseMouseEntered

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void btnRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarseMouseClicked

        ConexionMysql con = new ConexionMysql();
        Connection cn = con.conectar();
               
        String nombre = TextFieldNombre.getText();
        String usuario = TextFieldUsuario.getText();
        String password = PasswordFieldContraseña.getText();
        String correo = TextFieldCorreo.getText();

        if(PasswordFieldContraseñaConf.getText().equals(PasswordFieldContraseña.getText())){
            Login log = new Login();
            log.setVisible(true);
            //inserte método para añadir datos a la BD
            this.dispose();
        }
        
        
        else{
            JOptionPane.showMessageDialog(null, "Reescriba la contraseña", "Confirmacion no valida"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
        if(TextFieldNombre.getText().equals("Ingrese su nombre") || TextFieldNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese su Nombte", "Casilla Vacia"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
        if(TextFieldUsuario.getText().equals("Ingrese su nombre de Usuario") || TextFieldUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese su Usuario", "Casilla Vacia"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
        if(TextFieldCorreo.getText().equals("Ingrese su correo electronico") || TextFieldCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese su Correo Electronico", "Casilla Vacia"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
        if(PasswordFieldContraseñaConf.getText().equals("jPasswordField1") || PasswordFieldContraseñaConf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese su Contraseña", "Casilla Vacia"
                ,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarseMouseClicked

    private void PasswordFieldContraseñaConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldContraseñaConfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldContraseñaConfActionPerformed

    private void lblFlechaIzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaIzMouseClicked
       Login log = new Login();
            log.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_lblFlechaIzMouseClicked

    private void lblFlechaIzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaIzMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFlechaIzMouseEntered

    private void lblFlechaIzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFlechaIzMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFlechaIzMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Login log = new Login();
            log.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel ContenidoInferior;
    private javax.swing.JPasswordField PasswordFieldContraseña;
    private javax.swing.JPasswordField PasswordFieldContraseñaConf;
    private javax.swing.JTextField TextFieldCorreo;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JPanel allContentPanel;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnRegistrarse;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblConfContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFlechaIz;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrate;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables

    public void imagen(JLabel lbl,String ruta){ //cambiar imágenes de las etiquetas
    ImageIcon img = new ImageIcon(ruta);
    Icon icono = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT));
    lbl.setIcon(icono);
    
}
}

