/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.organillama;

import ConexionMysql.ConexionMysql;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mau
 */
public class Login extends javax.swing.JFrame {
    public int xMouse,yMouse;
    public int idusuario;
    
    
    public Login() {
        BaseDeDatos BD = new BaseDeDatos();
        initComponents();
        this.setBackground(new Color(255,255,255,190));
        imagen(fondo, "src//main//java//Imagenes//fondoLogin.png");
        imagen(lblCerrar, "src//main//java//Imagenes//btnCerrarBlanco.png");
        this.setLocationRelativeTo(null);
        idusuario = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCerrar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        InicioDeSesion = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        lblCreaCuenta = new javax.swing.JLabel();
        lblIngresar = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCerrar.setMinimumSize(new java.awt.Dimension(50, 50));
        lblCerrar.setPreferredSize(new java.awt.Dimension(50, 50));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 270, 450));

        barraSuperior.setOpaque(false);
        barraSuperior.setPreferredSize(new java.awt.Dimension(600, 50));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        InicioDeSesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        InicioDeSesion.setText("Inicia sesión");
        getContentPane().add(InicioDeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 270, 50));

        Usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Usuario.setText("Correo:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 80, 30));

        Contraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Contraseña.setText("Contraseña:");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 40));

        lblCreaCuenta.setBackground(new java.awt.Color(204, 255, 204));
        lblCreaCuenta.setForeground(new java.awt.Color(153, 153, 255));
        lblCreaCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreaCuenta.setText("CREAR CUENTA");
        lblCreaCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreaCuenta.setMaximumSize(new java.awt.Dimension(100, 50));
        lblCreaCuenta.setMinimumSize(new java.awt.Dimension(100, 50));
        lblCreaCuenta.setOpaque(true);
        lblCreaCuenta.setPreferredSize(new java.awt.Dimension(100, 50));
        lblCreaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreaCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreaCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreaCuentaMouseExited(evt);
            }
        });
        getContentPane().add(lblCreaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblIngresar.setBackground(new java.awt.Color(204, 255, 204));
        lblIngresar.setForeground(new java.awt.Color(153, 153, 255));
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("INGRESAR");
        lblIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngresar.setMaximumSize(new java.awt.Dimension(100, 50));
        lblIngresar.setMinimumSize(new java.awt.Dimension(100, 50));
        lblIngresar.setOpaque(true);
        lblIngresar.setPreferredSize(new java.awt.Dimension(100, 50));
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarMouseExited(evt);
            }
        });
        getContentPane().add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese su correo");
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 30));

        txtpass.setForeground(new java.awt.Color(204, 204, 204));
        txtpass.setText("jPasswordField1");
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection Conectar(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","Colque","Colque123");
        } catch (SQLException e) {
            System.out.print(e.toString());
            JOptionPane.showMessageDialog(this, "error inesperado");
        }
        return con;
    }
    
    public void ingresar(){
              Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String User = txtusuario.getText();
        String Pass = txtpass.getText();
        if(User.equals("")||Pass.equals("")){
            JOptionPane.showMessageDialog(this, "uno o mas campos estan vacios");
        }else{
            try {
                con1 = Conectar();
                pst = con1.prepareStatement("select iduser,correo,password from user where correo='"+User+"'and password='"+Pass+"'");
                rs = pst.executeQuery();
                if(rs.next()){
                    idusuario = idusuario=rs.getInt(1);
                    this.dispose();
                    new OrganillamaPrincipal(idusuario).setVisible(true);
                    JOptionPane.showMessageDialog(this, "BIENVENIDO.!!");
                }else{
                    JOptionPane.showMessageDialog(this, "credenciales incorrectas");
                }
            } catch (SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "crerror inesperado");
            }
        }
    }
    
    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseEntered
       lblIngresar.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblIngresarMouseEntered

    private void lblIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseExited
        lblIngresar.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_lblIngresarMouseExited

    private void lblCreaCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreaCuentaMouseEntered
        lblCreaCuenta.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblCreaCuentaMouseEntered

    private void lblCreaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreaCuentaMouseExited
        lblCreaCuenta.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_lblCreaCuentaMouseExited

    private void lblIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseClicked
      ingresar();
//        OrganillamaPrincipal principal = new OrganillamaPrincipal();
  //      principal.setVisible(true);
    //    this.dispose();
    }//GEN-LAST:event_lblIngresarMouseClicked

    private void lblCreaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreaCuentaMouseClicked
 registro reg= new registro();
       reg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblCreaCuentaMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel InicioDeSesion;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCreaCuenta;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

public void imagen(JLabel lbl,String ruta){ //cambiar imágenes de las etiquetas
    ImageIcon img = new ImageIcon(ruta);
    Icon icono = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT));
    lbl.setIcon(icono);
    lbl.repaint();
    
}

}
